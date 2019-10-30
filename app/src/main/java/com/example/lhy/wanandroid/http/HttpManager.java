package com.example.lhy.wanandroid.http;

import android.util.Log;

import com.example.lhy.wanandroid.net.LeakApplication;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.lhy.wanandroid.util.HttpUtils.isNetworkAvailable;

/**
 * Created by usercwq on 2019/10/23.
 */

public class HttpManager {
    private static volatile HttpManager httpManager;
    private HttpManager(){

    }

    public static HttpManager getInstance(){
        if (httpManager==null){
            synchronized (HttpManager.class){
                if (httpManager==null){
                     httpManager = new HttpManager();
                }
            }
        }
        return httpManager;
    }

    public synchronized  <T>T getServer(String url,Class<T> mCliss){
        return getRetrofit(url).build().create(mCliss);
    }
    private  Retrofit.Builder getRetrofit(String url){
        return new Retrofit.Builder()
                .baseUrl(ApiServcie.url)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(getOkhttpClient());
    }

    private OkHttpClient getOkhttpClient() {
        MyCacheinterceptor myCacheinterceptor=new MyCacheinterceptor();
        Cache cahce=new Cache(new File(LeakApplication.getLeakApplication().getCacheDir(),"Cache"),1024*1024*100);
        //日志过滤器
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                try {
                    String text = URLDecoder.decode(message, "utf-8");
                    Log.e("OKHttp-----", text);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    Log.e("OKHttp-----", message);
                }
            }
        });
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new OkHttpClient.Builder()
                .writeTimeout(5,TimeUnit.SECONDS)
                .readTimeout(5, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                //缓存拦截器
                .addInterceptor(myCacheinterceptor)
                .addNetworkInterceptor(myCacheinterceptor)
                //日志拦截器
                .addInterceptor(httpLoggingInterceptor)
                ///cooke处理器
               // .addInterceptor()
                .cache(cahce)
                .build();


    }
    //缓存拦截器
    private class MyCacheinterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            //这里就是说判读我们的网络条件，要是有网络的话我么就直接获取网络上面的数据，要是没有网络的话我么就去缓存里面取数据
            if (!isNetworkAvailable(LeakApplication.getLeakApplication())) {
                request = request.newBuilder().cacheControl(CacheControl.FORCE_CACHE).build();
            }
            Response originalResponse = chain.proceed(request);
            if(isNetworkAvailable(LeakApplication.getLeakApplication())) {
                int maxAge = 0;
                return originalResponse.newBuilder()
                        // 清除头信息，因为服务器如果不支持，会返回一些干扰信息，不清除下面无法生效
                        .removeHeader("Pragma")
                        .header("Cache-Control", "public ,max-age=" + maxAge)
                        .build();
            }else{
                int maxStale = 60*60*24*7;
                return originalResponse.newBuilder()
                        // 清除头信息，因为服务器如果不支持，会返回一些干扰信息，不清除下面无法生效
                        .removeHeader("Pragma")
                        //这里的设置的是我们的没有网络的缓存时间，想设置多少就是多少。
                        .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)
                        .build();
            }

        }
    }

}

package com.example.lhy.wanandroid.http;

import com.example.lhy.wanandroid.bean.AnalysisBean;
import com.example.lhy.wanandroid.bean.ListBean;
import com.example.lhy.wanandroid.bean.ProjectBean;
import com.example.lhy.wanandroid.bean.UserLoginBean;
import com.example.lhy.wanandroid.bean.UserRegisterBean;
import com.example.lhy.wanandroid.bean.accoutbean.AccoutBean;
import com.example.lhy.wanandroid.bean.accoutbean.AccoutFuBean;
import com.example.lhy.wanandroid.bean.homebean.BannerBean;
import com.example.lhy.wanandroid.bean.homebean.HomeBean;
import com.example.lhy.wanandroid.bean.homebean.HomeErJiBean;
import com.example.lhy.wanandroid.bean.navigition.NavigitionBean;
import com.example.lhy.wanandroid.bean.projectbean.ProjectLieBiaoBean;
import com.example.lhy.wanandroid.bean.zhishibean.ZhiShiBean;
import com.example.lhy.wanandroid.bean.zhishibean.ZhiShiWenZBean;

import java.util.List;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by usercwq on 2019/10/23.
 */

public interface ApiServcie {
    String url="https://www.wanandroid.com/";
//https://www.wanandroid.com/analysis/macthleague/leagueList
    @GET("wxarticle/chapters/json")
    Observable<BaseResponse<List<ListBean>>> getData();

    @POST("analysis/macthleague/leagueMatchList")
    Observable<ResponseBody> getNews(@Body RequestBody requestBody);
   //http://test.scaiwl.top/analysis/macthleague/leagueList
    /*@POST("analysis/macthleague/leagueList")
    Observable<BaseResponse<List<AnalysisBean.DataBean>>> getAnalysis();*/

    @POST("analysis/macthleague/leagueList")
    Observable<AnalysisBean> getAnalysis();

    //公众号列表  tab
    @GET("wxarticle/chapters/json")
    Observable<AccoutBean> getAccoutData();


    //公众号列表  每个tab对应的列表
    @GET("wxarticle/list/{id}/1/json")
    Observable<AccoutFuBean> getAccoutFuData(@Path("id")int id);

    //知识体系
    @GET("tree/json")
    Observable<ZhiShiBean> getZhiShiBean();
    //https://www.wanandroid.com/article/list/0/json?cid=60
    @GET("article/list/0/json")
    Observable<ZhiShiWenZBean> getZhiShiWenZData(@Query("cid") int cid);

    //项目接口  tab
    @GET("project/tree/json")
    Observable<ProjectBean>  getProjectData();
//https://www.wanandroid.com/project/list/1/json?cid=294
    //列表
    @GET("project/list/1/json")
    Observable<ProjectLieBiaoBean>  getProjectLiebiaoData(@Query("cid")int cid);


    //首页  banner数据
    //https://www.wanandroid.com/banner/json
    @GET("banner/json")
    Observable<BannerBean> getBannerData();
    //列表数据  https://www.wanandroid.com/
    @GET("article/list/{page}/json")
    Observable<HomeBean> getHomeLieBiaoData(@Path("page") int page);
    //https://www.wanandroid.com/friend/json

    @GET("friend/json")
    Observable<HomeErJiBean> getHomeErJiData();

    //https://www.wanandroid.com/navi/json 导航

    @GET("navi/json")
    Observable<NavigitionBean> getNavigitionJiData();

    //https://www.wanandroid.com/user/register  注册
    @POST("user/register")
    @FormUrlEncoded
    Observable<UserRegisterBean>  getUserRegisterData(@Field("username")String username,@Field("password")
            String password,@Field("repassword")String repassword);

    //登录
    //https://www.wanandroid.com/user/login
    @POST("user/login")
    @FormUrlEncoded
    Observable<UserLoginBean>  getUserLoginData(@Field("username")String username, @Field("password")String password);
}

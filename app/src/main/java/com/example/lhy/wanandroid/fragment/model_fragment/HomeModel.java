package com.example.lhy.wanandroid.fragment.model_fragment;

import com.example.lhy.wanandroid.base.BaseModel;
import com.example.lhy.wanandroid.bean.homebean.BannerBean;
import com.example.lhy.wanandroid.bean.homebean.HomeBean;
import com.example.lhy.wanandroid.http.ApiServcie;
import com.example.lhy.wanandroid.http.HttpManager;
import com.example.lhy.wanandroid.util.RxUtils;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by usercwq on 2019/10/24.
 */

public class HomeModel extends BaseModel {
    public void loadBanneData(final ZhiShiClickBack zhiShiClickBack) {
        ApiServcie server = HttpManager.getInstance().getServer(ApiServcie.url, ApiServcie.class);
        server.getBannerData()
                .compose(RxUtils.<BannerBean>rxObserableSchedulerHelper())
                .subscribe(new Observer<BannerBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(BannerBean bannerBean) {
                        zhiShiClickBack.onSeccuss(bannerBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        zhiShiClickBack.onFiled(e.getMessage()+"网络请求失败");
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }

    public void loadData(int page, final ZhiShiClickBack<HomeBean> zhiShiClickBack) {
        ApiServcie server = HttpManager.getInstance().getServer(ApiServcie.url, ApiServcie.class);
        server.getHomeLieBiaoData(page)
                .compose(RxUtils.<HomeBean>rxObserableSchedulerHelper())
                .subscribe(new Observer<HomeBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(HomeBean homeBean) {
                        zhiShiClickBack.onSeccuss(homeBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        zhiShiClickBack.onFiled(e.getMessage()+"网络请求失败");
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}

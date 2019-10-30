package com.example.lhy.wanandroid.fragment.model_fragment;

import com.example.lhy.wanandroid.bean.homebean.HomeErJiBean;
import com.example.lhy.wanandroid.http.ApiServcie;
import com.example.lhy.wanandroid.http.HttpManager;
import com.example.lhy.wanandroid.util.RxUtils;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by usercwq on 2019/10/26.
 */

public class HomeErJiModel {

    public void loadData(final ZhiShiClickBack<HomeErJiBean> zhiShiClickBack) {
        ApiServcie server = HttpManager.getInstance().getServer(ApiServcie.url, ApiServcie.class);
        server.getHomeErJiData()
                .compose(RxUtils.<HomeErJiBean>rxObserableSchedulerHelper())
                .subscribe(new Observer<HomeErJiBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(HomeErJiBean homeErJiBean) {
                            zhiShiClickBack.onSeccuss(homeErJiBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        zhiShiClickBack.onFiled(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}

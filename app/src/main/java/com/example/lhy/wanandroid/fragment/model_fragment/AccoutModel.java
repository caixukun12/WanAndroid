package com.example.lhy.wanandroid.fragment.model_fragment;

import com.example.lhy.wanandroid.base.BaseModel;
import com.example.lhy.wanandroid.bean.accoutbean.AccoutBean;
import com.example.lhy.wanandroid.bean.accoutbean.AccoutFuBean;
import com.example.lhy.wanandroid.http.ApiServcie;
import com.example.lhy.wanandroid.http.HttpManager;
import com.example.lhy.wanandroid.util.RxUtils;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by usercwq on 2019/10/24.
 */

public class AccoutModel extends BaseModel {
    public void loadData(final ResultCallBack resultCallBack) {
        ApiServcie server = HttpManager.getInstance().getServer(ApiServcie.url, ApiServcie.class);
        server.getAccoutData()
                .compose(RxUtils.<AccoutBean>rxObserableSchedulerHelper())
                .subscribe(new Observer<AccoutBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(AccoutBean accoutBean) {
                        resultCallBack.onSussecc(accoutBean.getData());
                    }

                    @Override
                    public void onError(Throwable e) {
                        resultCallBack.onField(e.getMessage()+"网络请求失败");
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }


    public void loadFuData(int id, final ResultCallBack resultCallBack) {
        ApiServcie server = HttpManager.getInstance().getServer(ApiServcie.url, ApiServcie.class);
        server.getAccoutFuData(id)
                .compose(RxUtils.<AccoutFuBean>rxObserableSchedulerHelper())
                .subscribe(new Observer<AccoutFuBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(AccoutFuBean accoutFuBean) {
                        resultCallBack.onSusseccFu(accoutFuBean.getData().getDatas());
                    }

                    @Override
                    public void onError(Throwable e) {
                        resultCallBack.onFieldFu(e.getMessage()+"网路请求失败");
                    }

                    @Override
                    public void onComplete() {

                    }
                });


    }
}


package com.example.lhy.wanandroid.fragment.view_fragment;

import com.example.lhy.wanandroid.base.BaseModel;
import com.example.lhy.wanandroid.bean.UserLoginBean;
import com.example.lhy.wanandroid.fragment.model_fragment.ZhiShiClickBack;
import com.example.lhy.wanandroid.http.ApiServcie;
import com.example.lhy.wanandroid.http.HttpManager;
import com.example.lhy.wanandroid.util.RxUtils;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by usercwq on 2019/10/29.
 */

public class NavLoginModel extends BaseModel {
    public void loadData(String username, String password, final ZhiShiClickBack zhiShiClickBack) {
        ApiServcie server = HttpManager.getInstance().getServer(ApiServcie.url, ApiServcie.class);
        server.getUserLoginData(username,password)
                .compose(RxUtils.<UserLoginBean>rxObserableSchedulerHelper())
                .subscribe(new Observer<UserLoginBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(UserLoginBean userLoginBean) {
                        zhiShiClickBack.onSeccuss(userLoginBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        zhiShiClickBack.onFiled(e.getMessage()+"网络失败");
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}

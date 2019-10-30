package com.example.lhy.wanandroid.fragment.model_fragment;

import com.example.lhy.wanandroid.base.BaseModel;
import com.example.lhy.wanandroid.bean.UserRegisterBean;
import com.example.lhy.wanandroid.http.ApiServcie;
import com.example.lhy.wanandroid.http.HttpManager;
import com.example.lhy.wanandroid.util.RxUtils;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by usercwq on 2019/10/28.
 */

public class RegisteModel extends BaseModel {
    public void loadData(final String username, String userpassword, String repassword, final ZhiShiClickBack zhiShiClickBack) {
        ApiServcie server = HttpManager.getInstance().getServer(ApiServcie.url, ApiServcie.class);
        server.getUserRegisterData(username,userpassword,repassword)
                .compose(RxUtils.<UserRegisterBean>rxObserableSchedulerHelper())
                .subscribe(new Observer<UserRegisterBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }
                    @Override
                    public void onNext(UserRegisterBean userRegisterBean) {
                        zhiShiClickBack.onSeccuss(userRegisterBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                            zhiShiClickBack.onFiled(e.getMessage()+"网络请求");

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}

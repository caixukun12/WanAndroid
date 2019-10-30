package com.example.lhy.wanandroid.fragment.model_fragment;

import com.example.lhy.wanandroid.base.BaseModel;
import com.example.lhy.wanandroid.bean.navigition.NavigitionBean;
import com.example.lhy.wanandroid.http.ApiServcie;
import com.example.lhy.wanandroid.http.HttpManager;
import com.example.lhy.wanandroid.util.RxUtils;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by usercwq on 2019/10/24.
 */

public class NavigitionModel extends BaseModel {
    private static final String TAG = "NavigitionModel";

    public void loadData(final ZhiShiClickBack<NavigitionBean> zhiShiClickBack) {
        ApiServcie server = HttpManager.getInstance().getServer(ApiServcie.url, ApiServcie.class);
        server.getNavigitionJiData()
                .compose(RxUtils.<NavigitionBean>rxObserableSchedulerHelper())
                .subscribe(new Observer<NavigitionBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(NavigitionBean homeBean) {
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

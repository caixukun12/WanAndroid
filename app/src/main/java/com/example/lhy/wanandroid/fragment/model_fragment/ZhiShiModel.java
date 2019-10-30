package com.example.lhy.wanandroid.fragment.model_fragment;

import com.example.lhy.wanandroid.base.BaseModel;
import com.example.lhy.wanandroid.bean.zhishibean.ZhiShiBean;
import com.example.lhy.wanandroid.http.ApiServcie;
import com.example.lhy.wanandroid.http.HttpManager;
import com.example.lhy.wanandroid.util.RxUtils;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by usercwq on 2019/10/24.
 */

public class ZhiShiModel extends BaseModel {
    public void loadData(final ZhiShiClickBack zhiShiClickBack) {
        ApiServcie server = HttpManager.getInstance().getServer(ApiServcie.url, ApiServcie.class);
        server.getZhiShiBean()
                .compose(RxUtils.<ZhiShiBean>rxObserableSchedulerHelper())

                .subscribe(new Observer<ZhiShiBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ZhiShiBean zhiShiBean) {
                        zhiShiClickBack.onSeccuss(zhiShiBean.getData());
                    }

                    @Override
                    public void onError(Throwable e) {
                        zhiShiClickBack.onFiled(e.getMessage()+"网络亲求失败");
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}

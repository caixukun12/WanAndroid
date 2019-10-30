package com.example.lhy.wanandroid.fragment.model_fragment;

import com.example.lhy.wanandroid.base.BaseModel;
import com.example.lhy.wanandroid.bean.zhishibean.ZhiShiWenZBean;
import com.example.lhy.wanandroid.http.ApiServcie;
import com.example.lhy.wanandroid.http.HttpManager;
import com.example.lhy.wanandroid.util.RxUtils;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by usercwq on 2019/10/25.
 */

public class ZhiShiWanZhnagModel extends BaseModel {

    private static  String TAG = "ZhiShiWanZhnagModel";

    public void loadData(int id, final ZhiShiClickBack zhiShiClickBack) {
        ApiServcie server = HttpManager.getInstance().getServer(ApiServcie.url, ApiServcie.class);
        server.getZhiShiWenZData(id)
                .compose(RxUtils.<ZhiShiWenZBean>rxObserableSchedulerHelper())
                .subscribe(new Observer<ZhiShiWenZBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ZhiShiWenZBean zhiShiWenZBean) {

                        zhiShiClickBack.onSeccuss(zhiShiWenZBean);
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

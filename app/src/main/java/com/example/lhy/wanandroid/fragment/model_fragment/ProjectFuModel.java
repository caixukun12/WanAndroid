package com.example.lhy.wanandroid.fragment.model_fragment;

import com.example.lhy.wanandroid.bean.projectbean.ProjectLieBiaoBean;
import com.example.lhy.wanandroid.http.ApiServcie;
import com.example.lhy.wanandroid.http.HttpManager;
import com.example.lhy.wanandroid.util.RxUtils;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by usercwq on 2019/10/25.
 */

public class ProjectFuModel {
    public void loadData(int id, final ZhiShiClickBack<ProjectLieBiaoBean> zhiShiClickBack) {
        ApiServcie server = HttpManager.getInstance().getServer(ApiServcie.url, ApiServcie.class);
        server.getProjectLiebiaoData(id)
                .compose(RxUtils.<ProjectLieBiaoBean>rxObserableSchedulerHelper())
                .subscribe(new Observer<ProjectLieBiaoBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ProjectLieBiaoBean projectLieBiaoBean) {
                            zhiShiClickBack.onSeccuss(projectLieBiaoBean);
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

package com.example.lhy.wanandroid.fragment.model_fragment;

import com.example.lhy.wanandroid.base.BaseModel;
import com.example.lhy.wanandroid.bean.ProjectBean;
import com.example.lhy.wanandroid.http.ApiServcie;
import com.example.lhy.wanandroid.http.HttpManager;
import com.example.lhy.wanandroid.util.RxUtils;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by usercwq on 2019/10/24.
 */

public class ProjectModel extends BaseModel {


    public void loadData(final ZhiShiClickBack<ProjectBean> zhiShiClickBack) {
        ApiServcie server = HttpManager.getInstance().getServer(ApiServcie.url, ApiServcie.class);
        server.getProjectData()
                .compose(RxUtils.<ProjectBean>rxObserableSchedulerHelper())
                .subscribe(new Observer<ProjectBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ProjectBean projectBean) {
                        zhiShiClickBack.onSeccuss(projectBean);
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

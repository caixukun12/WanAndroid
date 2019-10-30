package com.example.lhy.wanandroid.fragment.presenter_fragment;

import com.example.lhy.wanandroid.base.BasePresenter;
import com.example.lhy.wanandroid.bean.projectbean.ProjectLieBiaoBean;
import com.example.lhy.wanandroid.fragment.model_fragment.ProjectFuModel;
import com.example.lhy.wanandroid.fragment.model_fragment.ZhiShiClickBack;
import com.example.lhy.wanandroid.fragment.view_fragment.ProjectFuView;

/**
 * Created by usercwq on 2019/10/25.
 */

public class ProjectFuPresenter extends BasePresenter<ProjectFuView> {

    private ProjectFuModel projectFuModel;

    @Override
    protected void initModel() {
        projectFuModel = new ProjectFuModel();

    }

    public void loadData(int id) {
        projectFuModel.loadData(id, new ZhiShiClickBack<ProjectLieBiaoBean>() {
            @Override
            public void onSeccuss(ProjectLieBiaoBean dataBeans) {
                    if (mView!=null){
                        if (dataBeans!=null){
                            mView.setData(dataBeans);

                        }
                    }
            }

            @Override
            public void onFiled(String error) {
                if (mView!=null)
                   mView.showToast(error);
            }
        });
    }
}

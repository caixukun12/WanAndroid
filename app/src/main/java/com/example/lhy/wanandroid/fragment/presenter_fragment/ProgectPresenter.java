package com.example.lhy.wanandroid.fragment.presenter_fragment;

import com.example.lhy.wanandroid.base.BasePresenter;
import com.example.lhy.wanandroid.bean.ProjectBean;
import com.example.lhy.wanandroid.fragment.model_fragment.ProjectModel;
import com.example.lhy.wanandroid.fragment.model_fragment.ZhiShiClickBack;
import com.example.lhy.wanandroid.fragment.view_fragment.ProjectView;

/**
 * Created by usercwq on 2019/10/24.
 */

public class ProgectPresenter extends BasePresenter<ProjectView> {

    private ProjectModel projectModel;

    @Override
    protected void initModel() {
        projectModel = new ProjectModel();

    }

    public void loadData() {
        projectModel.loadData(new ZhiShiClickBack<ProjectBean>() {
            @Override
            public void onSeccuss(ProjectBean dataBeans) {
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

package com.example.lhy.wanandroid.fragment.presenter_fragment;

import com.example.lhy.wanandroid.base.BasePresenter;
import com.example.lhy.wanandroid.bean.navigition.NavigitionBean;
import com.example.lhy.wanandroid.fragment.model_fragment.NavigitionModel;
import com.example.lhy.wanandroid.fragment.model_fragment.ZhiShiClickBack;
import com.example.lhy.wanandroid.fragment.view_fragment.NavigitionView;

/**
 * Created by usercwq on 2019/10/24.
 */

public class NavigitionPresenter extends BasePresenter<NavigitionView> {

    private NavigitionModel navigitionModel;

    @Override
    protected void initModel() {
        navigitionModel = new NavigitionModel();
    }

    public void loadData() {
        navigitionModel.loadData(new ZhiShiClickBack<NavigitionBean>() {
            @Override
            public void onSeccuss(NavigitionBean dataBeans) {
                if (mView!=null){
                    if (dataBeans!=null){
                        mView.setData(dataBeans);
                    }
                }
            }

            @Override
            public void onFiled(String error) {
                if (mView!=null){
                    mView.showToast(error);
                }
            }
        });
    }
}

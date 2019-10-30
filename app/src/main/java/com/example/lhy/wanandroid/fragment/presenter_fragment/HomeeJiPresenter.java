package com.example.lhy.wanandroid.fragment.presenter_fragment;

import com.example.lhy.wanandroid.base.BasePresenter;
import com.example.lhy.wanandroid.bean.homebean.HomeErJiBean;
import com.example.lhy.wanandroid.fragment.model_fragment.HomeErJiModel;
import com.example.lhy.wanandroid.fragment.model_fragment.ZhiShiClickBack;
import com.example.lhy.wanandroid.fragment.view_fragment.HomeErJiView;

/**
 * Created by usercwq on 2019/10/26.
 */

public class HomeeJiPresenter extends BasePresenter<HomeErJiView> {

    private HomeErJiModel homeErJiModel;

    @Override
    protected void initModel() {
        homeErJiModel = new HomeErJiModel();
    }

    public void loadData() {
        homeErJiModel.loadData(new ZhiShiClickBack<HomeErJiBean>() {
            @Override
            public void onSeccuss(HomeErJiBean dataBeans) {
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

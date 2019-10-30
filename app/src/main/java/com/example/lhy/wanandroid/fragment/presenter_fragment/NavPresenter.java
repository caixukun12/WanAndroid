package com.example.lhy.wanandroid.fragment.presenter_fragment;

import com.example.lhy.wanandroid.base.BasePresenter;
import com.example.lhy.wanandroid.bean.UserLoginBean;
import com.example.lhy.wanandroid.fragment.model_fragment.ZhiShiClickBack;
import com.example.lhy.wanandroid.fragment.view_fragment.NavIiew;
import com.example.lhy.wanandroid.fragment.view_fragment.NavLoginModel;

/**
 * Created by usercwq on 2019/10/28.
 */

public class NavPresenter extends BasePresenter<NavIiew> {

    private NavLoginModel navModel;

    @Override
    protected void initModel() {
        navModel = new NavLoginModel();
    }

    public void loadData(String username,String password) {
        navModel.loadData(username, password, new ZhiShiClickBack<UserLoginBean>() {

            @Override
            public void onSeccuss(UserLoginBean dataBeans) {
                if (mView!=null){
                    mView.setData(dataBeans);
                }
            }

            @Override
            public void onFiled(String error) {
                if (mView!=null)
                    mView.shoToast(error);
            }
        });
    }
}

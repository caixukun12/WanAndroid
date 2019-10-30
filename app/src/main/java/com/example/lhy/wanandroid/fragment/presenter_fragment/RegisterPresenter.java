package com.example.lhy.wanandroid.fragment.presenter_fragment;

import com.example.lhy.wanandroid.base.BasePresenter;
import com.example.lhy.wanandroid.bean.UserRegisterBean;
import com.example.lhy.wanandroid.fragment.model_fragment.RegisteModel;
import com.example.lhy.wanandroid.fragment.model_fragment.ZhiShiClickBack;
import com.example.lhy.wanandroid.fragment.view_fragment.RegisterView;

/**
 * Created by usercwq on 2019/10/28.
 */

public class RegisterPresenter extends BasePresenter<RegisterView> {

    private RegisteModel registeModel;

    @Override
    protected void initModel() {
        registeModel = new RegisteModel();
    }

    public void loadData(String username,String password,String repasswrod) {
        registeModel.loadData(username, password, repasswrod, new ZhiShiClickBack<UserRegisterBean>() {
            @Override
            public void onSeccuss(UserRegisterBean dataBeans) {
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

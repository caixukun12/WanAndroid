package com.example.lhy.wanandroid.fragment.view_fragment;

import com.example.lhy.wanandroid.base.BaseView;
import com.example.lhy.wanandroid.bean.UserRegisterBean;

/**
 * Created by usercwq on 2019/10/28.
 */

public interface RegisterView extends BaseView {
    void setData(UserRegisterBean dataBeans);

    void showToast(String error);
}

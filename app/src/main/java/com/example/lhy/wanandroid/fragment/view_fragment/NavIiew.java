package com.example.lhy.wanandroid.fragment.view_fragment;

import com.example.lhy.wanandroid.base.BaseView;
import com.example.lhy.wanandroid.bean.UserLoginBean;

/**
 * Created by usercwq on 2019/10/28.
 */

public interface NavIiew extends BaseView {
    void setData(UserLoginBean dataBeans);

    void shoToast(String error);

}

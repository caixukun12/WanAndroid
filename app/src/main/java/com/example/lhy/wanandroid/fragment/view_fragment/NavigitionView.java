package com.example.lhy.wanandroid.fragment.view_fragment;

import com.example.lhy.wanandroid.base.BaseView;
import com.example.lhy.wanandroid.bean.navigition.NavigitionBean;

/**
 * Created by usercwq on 2019/10/24.
 */

public interface NavigitionView extends BaseView {

    void setData(NavigitionBean dataBeans);

    void showToast(String error);

}

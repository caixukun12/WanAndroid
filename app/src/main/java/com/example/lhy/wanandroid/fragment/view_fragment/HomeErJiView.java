package com.example.lhy.wanandroid.fragment.view_fragment;

import com.example.lhy.wanandroid.base.BaseView;
import com.example.lhy.wanandroid.bean.homebean.HomeErJiBean;

/**
 * Created by usercwq on 2019/10/26.
 */

public interface HomeErJiView extends BaseView {

    void setData(HomeErJiBean dataBeans);

    void showToast(String error);

}

package com.example.lhy.wanandroid.fragment.view_fragment;

import com.example.lhy.wanandroid.base.BaseView;
import com.example.lhy.wanandroid.bean.accoutbean.AccoutBean;

import java.util.List;

/**
 * Created by usercwq on 2019/10/24.
 */

public interface AccoutView extends BaseView {

    void setData(List<AccoutBean.DataBean> dataBeans);

    void showToast(String error);

}

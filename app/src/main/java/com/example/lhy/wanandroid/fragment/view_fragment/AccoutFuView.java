package com.example.lhy.wanandroid.fragment.view_fragment;

import com.example.lhy.wanandroid.base.BaseView;
import com.example.lhy.wanandroid.bean.accoutbean.AccoutFuBean;

import java.util.List;

/**
 * Created by usercwq on 2019/10/24.
 */

public interface AccoutFuView extends BaseView {
    void setDataFu(List<AccoutFuBean.DataBean.DatasBean> datasBeans);

    void showToast(String error);
}

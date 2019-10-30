package com.example.lhy.wanandroid.fragment.view_fragment;

import com.example.lhy.wanandroid.base.BaseView;
import com.example.lhy.wanandroid.bean.homebean.BannerBean;
import com.example.lhy.wanandroid.bean.homebean.HomeBean;

/**
 * Created by usercwq on 2019/10/24.
 */

public interface HomeView extends BaseView {

    void setData(BannerBean dataBeans);

    void showToast(String error);

    void setDataLianBiao(HomeBean dataBeans);

}

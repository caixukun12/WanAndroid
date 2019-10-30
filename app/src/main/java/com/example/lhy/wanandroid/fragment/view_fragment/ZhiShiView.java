package com.example.lhy.wanandroid.fragment.view_fragment;

import com.example.lhy.wanandroid.base.BaseView;
import com.example.lhy.wanandroid.bean.zhishibean.ZhiShiBean;
import com.example.lhy.wanandroid.bean.zhishibean.ZhiShiWenZBean;

import java.util.List;

/**
 * Created by usercwq on 2019/10/24.
 */

public interface ZhiShiView extends BaseView {

    void setData(List<ZhiShiWenZBean.DataBean.DatasBean> dataBeans);
    void setDatas(List<ZhiShiBean.DataBean> dataBeans);
    void showToast(String error);

}

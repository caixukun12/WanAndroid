package com.example.lhy.wanandroid.fragment.view_fragment;

import com.example.lhy.wanandroid.base.BaseView;
import com.example.lhy.wanandroid.bean.zhishibean.ZhiShiWenZBean;

/**
 * Created by usercwq on 2019/10/25.
 */

public interface ZhiShiWanZhnagView extends BaseView {
    void setData(ZhiShiWenZBean dataBeans);

    void showToast(String error);

}

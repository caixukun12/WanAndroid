package com.example.lhy.wanandroid.fragment.view_fragment;

import com.example.lhy.wanandroid.base.BaseView;
import com.example.lhy.wanandroid.bean.ProjectBean;

/**
 * Created by usercwq on 2019/10/24.
 */

public interface ProjectView extends BaseView {

    void setData(ProjectBean dataBeans);

    void showToast(String error);

}

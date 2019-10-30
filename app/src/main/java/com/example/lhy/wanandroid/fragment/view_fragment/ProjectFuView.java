package com.example.lhy.wanandroid.fragment.view_fragment;

import com.example.lhy.wanandroid.base.BaseView;
import com.example.lhy.wanandroid.bean.projectbean.ProjectLieBiaoBean;

/**
 * Created by usercwq on 2019/10/25.
 */

public interface ProjectFuView extends BaseView {
    void setData(ProjectLieBiaoBean dataBeans);

    void showToast(String error);

}

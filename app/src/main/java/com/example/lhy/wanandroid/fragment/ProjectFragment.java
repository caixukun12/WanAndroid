package com.example.lhy.wanandroid.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.Toast;

import com.example.lhy.wanandroid.R;
import com.example.lhy.wanandroid.base.BaseFragment;
import com.example.lhy.wanandroid.bean.ProjectBean;
import com.example.lhy.wanandroid.fragment.adapters_fragent.AccoutAdapter;
import com.example.lhy.wanandroid.fragment.presenter_fragment.ProgectPresenter;
import com.example.lhy.wanandroid.fragment.view_fragment.ProjectView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by usercwq on 2019/10/24.
 */
//项目
public class ProjectFragment extends BaseFragment<ProgectPresenter, ProjectView> implements
        ProjectView {
    @BindView(R.id.tablayout_projcet)
    TabLayout tablayoutProjcet;
    @BindView(R.id.vp_project)
    ViewPager vpProject;

    private ArrayList<Fragment> fragments = new ArrayList<>();
    private ArrayList<String>   title = new ArrayList<>();
    public static ProjectFragment getInstance() {
        ProjectFragment homeFragment = new ProjectFragment();
        Bundle bundle = new Bundle();
        homeFragment.setArguments(bundle);
        return homeFragment;
    }
    private void initTab() {
        AccoutAdapter accoutAdapter = new AccoutAdapter(getChildFragmentManager(),fragments,title);
        vpProject.setAdapter(accoutAdapter);
        tablayoutProjcet.setupWithViewPager(vpProject);



    }
    @Override
    protected ProgectPresenter initPresenter() {
        return new ProgectPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.project_fragment;
    }

    @Override
    public void initView() {


    }

    @Override
    public void initData() {

        mPresenter.loadData();
    }

    @Override
    public void setData(ProjectBean dataBeans) {
        List<ProjectBean.DataBean> data = dataBeans.getData();
        for (int i=0;i<data.size();i++){
            ProjectFuFragment projectFuFragment = new ProjectFuFragment();
            projectFuFragment.setId(data.get(i).getId());
            fragments.add(projectFuFragment);
            title.add(data.get(i).getName());
        }
        initTab();
    }

    @Override
    public void showToast(String error) {
        Toast.makeText(getContext(), error, Toast.LENGTH_SHORT).show();
    }
}

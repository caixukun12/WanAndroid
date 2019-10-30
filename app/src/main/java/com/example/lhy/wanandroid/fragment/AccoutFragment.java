package com.example.lhy.wanandroid.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.example.lhy.wanandroid.R;
import com.example.lhy.wanandroid.base.BaseFragment;
import com.example.lhy.wanandroid.bean.accoutbean.AccoutBean;
import com.example.lhy.wanandroid.fragment.adapters_fragent.AccoutAdapter;
import com.example.lhy.wanandroid.fragment.presenter_fragment.AccoutPresenter;
import com.example.lhy.wanandroid.fragment.view_fragment.AccoutView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.Unbinder;

/**
 * Created by usercwq on 2019/10/24.
 */

//公众号
public class AccoutFragment extends BaseFragment<AccoutPresenter, AccoutView> implements
        AccoutView {
    @BindView(R.id.tablayout_accout)
    TabLayout tablayoutAccout;

    Unbinder unbinder;
    @BindView(R.id.vp_accout)
    ViewPager vpAccout;
    private   ArrayList<Fragment> fragments = new ArrayList<>();
    private ArrayList<String>   title = new ArrayList<>();

    public static AccoutFragment getInstance() {
        AccoutFragment fragment = new AccoutFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected AccoutPresenter initPresenter() {

        return new AccoutPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.accout_fragment;

    }


    private void initTab() {
        AccoutAdapter accoutAdapter = new AccoutAdapter(getChildFragmentManager(),fragments,title);
        vpAccout.setAdapter(accoutAdapter);
        tablayoutAccout.setupWithViewPager(vpAccout);

    }

    @Override
    public void initData() {
        mPresenter.loadData();


    }


    @Override
    public void setData(List<AccoutBean.DataBean> dataBeans) {
        for (int i = 0; i < dataBeans.size(); i++) {
         AccoutFuFragment accoutFuFragment = new AccoutFuFragment();
            accoutFuFragment.setId(dataBeans.get(i).getId());
            fragments.add(accoutFuFragment);
            String name = dataBeans.get(i).getName();
            title.add(name);
        }

        initTab();
    }

    @Override
    public void showToast(String error) {

    }


}

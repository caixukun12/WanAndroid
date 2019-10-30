package com.example.lhy.wanandroid.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.lhy.wanandroid.R;
import com.example.lhy.wanandroid.base.BaseFragment;
import com.example.lhy.wanandroid.bean.homebean.BannerBean;
import com.example.lhy.wanandroid.bean.homebean.HomeBean;
import com.example.lhy.wanandroid.fragment.adapters_fragent.HomeAdapter;
import com.example.lhy.wanandroid.fragment.presenter_fragment.HomePresenter;
import com.example.lhy.wanandroid.fragment.view_fragment.HomeView;
import com.example.lhy.wanandroid.ui.main.HomeErJiActivity;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.Unbinder;

/**
 * Created by usercwq on 2019/10/24.
 */
//首页
public class HomeFragment extends BaseFragment<HomePresenter, HomeView> implements HomeView {
    @BindView(R.id.rclv_home)
    RecyclerView rclvHome;
    Unbinder unbinder;
    @BindView(R.id.smart)
    SmartRefreshLayout smart;
    @BindView(R.id.fab)
    FloatingActionButton fab;
    private HomeAdapter homeAdapter;
    int page=1;
    public static HomeFragment getInstance() {
        HomeFragment homeFragment = new HomeFragment();
        Bundle bundle = new Bundle();
        homeFragment.setArguments(bundle);
        return homeFragment;
    }

    @Override
    protected HomePresenter initPresenter() {
        return new HomePresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.home_fragment;
    }

    @Override
    public void initView() {
        rclvHome.setLayoutManager(new LinearLayoutManager(getContext()));
        rclvHome.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration
                .VERTICAL));
        homeAdapter = new HomeAdapter(getContext());
        rclvHome.setAdapter(homeAdapter);
        smart.setOnRefreshLoadMoreListener(new OnRefreshLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                smart.finishLoadMore(true);
                page++;
                mPresenter.loadData(page);
            }

            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                smart.finishRefresh(true);
                page=1;
                ArrayList<HomeBean.DataBean.DatasBean> list_liebiao = homeAdapter.getList_liebiao();
                list_liebiao.clear();
                homeAdapter.notifyDataSetChanged();
                mPresenter.loadData(page);
            }
        });
        homeAdapter.setOnItemClick(new HomeAdapter.OnItemClick() {
            @Override
            public void onClickItem(View v, int position) {
                go2ActivityHome(position);
            }
        });
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rclvHome.smoothScrollToPosition(0);
            }
        });
    }

    private void go2ActivityHome(int position) {
        ArrayList<HomeBean.DataBean.DatasBean> list_liebiao = homeAdapter.getList_liebiao();
        HomeBean.DataBean.DatasBean datasBean = list_liebiao.get(position);

        Intent intent = new Intent(getContext(),HomeErJiActivity.class);
        intent.putExtra("datasbean",datasBean);
        startActivity(intent);
    }

    @Override
    public void initData() {
        super.initData();
        mPresenter.loadBanneData();
        mPresenter.loadData(page);
    }


    @Override
    public void setData(BannerBean dataBeans) {

        homeAdapter.setData(dataBeans);
    }

    @Override
    public void showToast(String error) {
        Toast.makeText(getContext(), error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setDataLianBiao(HomeBean dataBeans) {
        homeAdapter.setLIeBiaoData(dataBeans);
    }


}

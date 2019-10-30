package com.example.lhy.wanandroid.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.lhy.wanandroid.R;
import com.example.lhy.wanandroid.base.BaseFragment;
import com.example.lhy.wanandroid.bean.navigition.NavigitionBean;
import com.example.lhy.wanandroid.fragment.adapters_fragent.NavigitionAdapter;
import com.example.lhy.wanandroid.fragment.presenter_fragment.NavigitionPresenter;
import com.example.lhy.wanandroid.fragment.view_fragment.NavigitionView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import q.rorbin.verticaltablayout.VerticalTabLayout;
import q.rorbin.verticaltablayout.adapter.TabAdapter;
import q.rorbin.verticaltablayout.widget.QTabView;
import q.rorbin.verticaltablayout.widget.TabView;

/**
 * Created by usercwq on 2019/10/24.
 */

//导航
public class NavigitionFragment extends BaseFragment<NavigitionPresenter, NavigitionView>
        implements NavigitionView {
    @BindView(R.id.tablayout_navigition)
    VerticalTabLayout tablayoutNavigition;
        @BindView(R.id.rclv_navigition)
        RecyclerView rclvNavigition;

    private String name;
    private ArrayList<NavigitionBean.DataBean.ArticlesBean> articlesBeans;
    private NavigitionAdapter navigitionAdapter;


    public static NavigitionFragment getInstance() {
        NavigitionFragment fragment = new NavigitionFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected NavigitionPresenter initPresenter() {
        return new NavigitionPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.navigition_fragment;
    }

    @Override
    public void initView() {
        super.initView();
        rclvNavigition.setLayoutManager(new LinearLayoutManager(getContext()));
        rclvNavigition.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL));
        navigitionAdapter = new NavigitionAdapter(getContext());
        rclvNavigition.setAdapter(navigitionAdapter);

    }

    @Override
    public void initData() {
        super.initData();
        mPresenter.loadData();

    }

    @Override
    public void setData(NavigitionBean dataBeans) {
        final List<NavigitionBean.DataBean> data = dataBeans.getData();
        navigitionAdapter.setData(dataBeans);
        tablayoutNavigition.setTabAdapter(new TabAdapter() {
            List<String> title;
            {
                title = new ArrayList<>();
                articlesBeans = new ArrayList<>();
                for (int i = 0; i < data.size(); i++) {
                    List<NavigitionBean.DataBean.ArticlesBean> articles= data.get(i).getArticles();
                    name = data.get(i).getName();
                    title.add(name);
                    articlesBeans.addAll(articles);
                }
                Collections.addAll(title);
            }

            @Override
            public int getCount() {
                return title.size();

            }

            @Override
            public TabView.TabBadge getBadge(int position) {
                return null;
            }

            @Override
            public QTabView.TabIcon getIcon(int position) {
                return null;
            }

            @Override
            public QTabView.TabTitle getTitle(int position) {
                return new QTabView.TabTitle.Builder()
                        .setContent(title.get(position))
                        .setTextColor(Color.BLUE, Color.BLACK)
                        .build();
            }

            @Override
            public int getBackground(int position) {
                return 0;
            }
        });
        tablayoutNavigition.addTab(new QTabView(getActivity()));
        tablayoutNavigition.addOnTabSelectedListener(new VerticalTabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabView tab, int position) {
                rclvNavigition.smoothScrollToPosition(position);
            }
            @Override
            public void onTabReselected(TabView tab, int position) {
                rclvNavigition.smoothScrollToPosition(position);
            }
        });

    }

    @Override
    public void showToast(String error) {
        Toast.makeText(getContext(), error, Toast.LENGTH_SHORT).show();
    }


}

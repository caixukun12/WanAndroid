package com.example.lhy.wanandroid.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.lhy.wanandroid.R;
import com.example.lhy.wanandroid.base.BaseFragment;
import com.example.lhy.wanandroid.bean.zhishibean.ZhiShiBean;
import com.example.lhy.wanandroid.bean.zhishibean.ZhiShiWenZBean;
import com.example.lhy.wanandroid.fragment.adapters_fragent.ZhiShiApapder;
import com.example.lhy.wanandroid.fragment.presenter_fragment.ZhiShiPresenter;
import com.example.lhy.wanandroid.fragment.view_fragment.ZhiShiView;
import com.example.lhy.wanandroid.ui.main.ZhiShiWanZhangActivity;

import java.util.List;

import butterknife.BindView;

/**
 * Created by usercwq on 2019/10/24.
 */

//知识体系
public class ZhiShiFragment extends BaseFragment<ZhiShiPresenter, ZhiShiView> implements
        ZhiShiView {
    @BindView(R.id.rclv_zhishi)
    RecyclerView rclvZhishi;
    private ZhiShiApapder zhiShiApapder;
    private List<ZhiShiBean.DataBean> list;
    @BindView(R.id.fab)
    FloatingActionButton fab;
    public static ZhiShiFragment getInstance() {
        ZhiShiFragment fragment = new ZhiShiFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected ZhiShiPresenter initPresenter() {
        return new ZhiShiPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.zhishi_fragment;
    }

    @Override
    public void initView() {
        super.initView();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rclvZhishi.smoothScrollToPosition(0);
            }
        });
        rclvZhishi.setLayoutManager(new LinearLayoutManager(getContext()));
        rclvZhishi.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL));
        zhiShiApapder = new ZhiShiApapder(getContext());
        rclvZhishi.setAdapter(zhiShiApapder);
        zhiShiApapder.setOnClickItem(new ZhiShiApapder.OnClickItem() {
            @Override
            public void onItemClick(int position) {
                go2ZhiShiWenZhangActivity(position);
            }
        });
    }

    private void go2ZhiShiWenZhangActivity(int position) {
        ZhiShiBean.DataBean dataBean = list.get(position);
        Intent intent = new Intent(getContext(), ZhiShiWanZhangActivity.class);
        intent.putExtra("dataBean",dataBean);
        startActivity(intent);
    }

    @Override
    public void initData() {
        mPresenter.loadData();
    }

    @Override
    public void setData(List<ZhiShiWenZBean.DataBean.DatasBean> dataBeans) {

    }

    @Override
    public void setDatas(List<ZhiShiBean.DataBean> dataBeans) {
        list = dataBeans;
        zhiShiApapder.setData(dataBeans);
    }

    @Override
    public void showToast(String error) {
        Toast.makeText(getContext(), error, Toast.LENGTH_SHORT).show();
    }

}
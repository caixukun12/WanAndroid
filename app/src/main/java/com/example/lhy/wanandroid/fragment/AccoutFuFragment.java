package com.example.lhy.wanandroid.fragment;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toast;

import com.example.lhy.wanandroid.R;
import com.example.lhy.wanandroid.base.BaseFragment;
import com.example.lhy.wanandroid.bean.accoutbean.AccoutFuBean;
import com.example.lhy.wanandroid.fragment.adapters_fragent.AccoutFuAdapter;
import com.example.lhy.wanandroid.fragment.presenter_fragment.AccoutFuPresenter;
import com.example.lhy.wanandroid.fragment.view_fragment.AccoutFuView;
import com.example.lhy.wanandroid.ui.main.AccoutErJiActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by usercwq on 2019/10/24.
 */
//复用
public class AccoutFuFragment extends BaseFragment<AccoutFuPresenter, AccoutFuView> implements
        AccoutFuView {


    private static  String TAG = "========AccoutFuFragment";
    @BindView(R.id.rcluv_fu_accout)
    RecyclerView rcluvFuAccout;
    private AccoutFuAdapter accoutFuAdapter;
    private int id;
    @BindView(R.id.fab)
    FloatingActionButton fab;
    public void setId(int id) {
        this.id=id;
    }

    @Override
    protected AccoutFuPresenter initPresenter() {
        return new AccoutFuPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.accout_fufragment;
    }

    @Override
    public void initView() {
        super.initView();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rcluvFuAccout.smoothScrollToPosition(0);
            }
        });
        rcluvFuAccout.setLayoutManager(new LinearLayoutManager(getContext()));
        rcluvFuAccout.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL));
        accoutFuAdapter = new AccoutFuAdapter(getContext());
        rcluvFuAccout.setAdapter(accoutFuAdapter);
        accoutFuAdapter.setOnItemClick(new AccoutFuAdapter.OnItemClick() {
            @Override
            public void onClickItem(View v, int position) {
                go2AccoutActivity(position);
            }
        });
    }

    private void go2AccoutActivity(int position) {
        ArrayList<AccoutFuBean.DataBean.DatasBean> list = accoutFuAdapter.getList();
        AccoutFuBean.DataBean.DatasBean datasBean = list.get(position);
        Intent intent = new Intent(getContext(), AccoutErJiActivity.class);
        intent.putExtra("datasBean",datasBean);
        startActivity(intent);
    }

    @Override
    public void initData() {
        super.initData();
        mPresenter.loadData(id);
    }

    @Override
    public void setDataFu(List<AccoutFuBean.DataBean.DatasBean> datasBeans) {
        Log.i(TAG, "setDataFu: "+datasBeans.toString());
        accoutFuAdapter.setData(datasBeans);
    }

    @Override
    public void showToast(String error) {
        Log.i(TAG, "showToast: "+error);
        Toast.makeText(getContext(), error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

    }

}

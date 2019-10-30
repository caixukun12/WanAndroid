package com.example.lhy.wanandroid.fragment;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.lhy.wanandroid.R;
import com.example.lhy.wanandroid.base.BaseFragment;
import com.example.lhy.wanandroid.bean.zhishibean.ZhiShiWenZBean;
import com.example.lhy.wanandroid.fragment.adapters_fragent.ZhiShiFuAdapter;
import com.example.lhy.wanandroid.fragment.presenter_fragment.ZhiShiWanZhangPresenter;
import com.example.lhy.wanandroid.fragment.view_fragment.ZhiShiWanZhnagView;

import java.util.List;

import butterknife.BindView;

/**
 * Created by usercwq on 2019/10/24.
 */
//复用
public class ZhiShiFuFragment extends BaseFragment<ZhiShiWanZhangPresenter, ZhiShiWanZhnagView> implements
        ZhiShiWanZhnagView {


    @BindView(R.id.fab)
    FloatingActionButton fab;
    private static  String TAG = "========ZhiShiFuFragment";
    @BindView(R.id.rcluv_fu_accout)
    RecyclerView recyclerView;
    private ZhiShiFuAdapter zhiShiFuAdapter;
    private int id;

    public void setId(int id) {
        this.id=id;
    }

    @Override
    protected ZhiShiWanZhangPresenter initPresenter() {
        return new ZhiShiWanZhangPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.accout_fufragment;
    }

    @Override
    public void initView() {
        super.initView();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL));
        zhiShiFuAdapter = new ZhiShiFuAdapter(getContext());
        recyclerView.setAdapter(zhiShiFuAdapter);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.smoothScrollToPosition(0);
            }
        });
    }

    @Override
    public void initData() {
        super.initData();
        mPresenter.loadData(id);
    }


    @Override
    public void setData(ZhiShiWenZBean dataBeans) {

        List<ZhiShiWenZBean.DataBean.DatasBean> datas = dataBeans.getData().getDatas();
        zhiShiFuAdapter.setData(datas);


    }


    @Override
    public void showToast(String error) {


        Toast.makeText(getContext(), error, Toast.LENGTH_SHORT).show();
    }

}

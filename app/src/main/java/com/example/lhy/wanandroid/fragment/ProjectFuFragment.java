package com.example.lhy.wanandroid.fragment;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.lhy.wanandroid.R;
import com.example.lhy.wanandroid.base.BaseFragment;
import com.example.lhy.wanandroid.bean.projectbean.ProjectLieBiaoBean;
import com.example.lhy.wanandroid.fragment.adapters_fragent.ProjectFuAdapter;
import com.example.lhy.wanandroid.fragment.presenter_fragment.ProjectFuPresenter;
import com.example.lhy.wanandroid.fragment.view_fragment.ProjectFuView;
import com.example.lhy.wanandroid.ui.main.ProjectActivity;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * Created by usercwq on 2019/10/24.
 */
//复用
public class ProjectFuFragment extends BaseFragment<ProjectFuPresenter, ProjectFuView> implements
        ProjectFuView {


    private static  String TAG = "========ZhiShiFuFragment";
    @BindView(R.id.rcluv_fu_accout)
    RecyclerView recyclerView;
    private ProjectFuAdapter projectFuAdapter;
    private int id;
    @BindView(R.id.fab)
    FloatingActionButton fla;
    public void setId(int id) {
        this.id=id;
    }

    @Override
    protected ProjectFuPresenter initPresenter() {
        return new ProjectFuPresenter();
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
        projectFuAdapter = new ProjectFuAdapter(getContext());
        recyclerView.setAdapter(projectFuAdapter);
        projectFuAdapter.setOnItemClick(new ProjectFuAdapter.OnItemClick() {
            @Override
            public void onClickItem(View v, int position) {
                go2ActivityProject(position);
            }
        });
        fla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.smoothScrollToPosition(0);
            }
        });
    }

    private void go2ActivityProject(int position) {
        ArrayList<ProjectLieBiaoBean.DataBean.DatasBean> list = projectFuAdapter.getList();
        ProjectLieBiaoBean.DataBean.DatasBean datasBean = list.get(position);
        Intent intent = new Intent(getContext(), ProjectActivity.class);
        intent.putExtra("datasBean",datasBean);
        startActivity(intent);
    }

    @Override
    public void initData() {
        super.initData();
        mPresenter.loadData(id);
    }


    @Override
    public void setData(ProjectLieBiaoBean dataBeans) {
        projectFuAdapter.setData(dataBeans.getData().getDatas());
    }

    @Override
    public void showToast(String error) {
        Toast.makeText(getContext(), error, Toast.LENGTH_SHORT).show();
    }
}

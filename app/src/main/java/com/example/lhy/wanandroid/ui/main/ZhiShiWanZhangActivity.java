package com.example.lhy.wanandroid.ui.main;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lhy.wanandroid.R;
import com.example.lhy.wanandroid.base.BaseActivity;
import com.example.lhy.wanandroid.bean.zhishibean.ZhiShiBean;
import com.example.lhy.wanandroid.fragment.ZhiShiFuFragment;
import com.example.lhy.wanandroid.fragment.adapters_fragent.AccoutAdapter;
import com.example.lhy.wanandroid.presenter.MainPresenter;
import com.example.lhy.wanandroid.view.MainView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by usercwq on 2019/10/25.
 */

public class ZhiShiWanZhangActivity extends BaseActivity<MainPresenter,
        MainView> implements MainView {


    private static String TAG = "ZhiShiWanZhangActivity";
    @BindView(R.id.tablayout_zhishiwenz)
    TabLayout tablayoutZhishiwenz;
    @BindView(R.id.vp_zhishiwenz)
    ViewPager vpZhishiwenz;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.iv_img_huitui)
    ImageView ivImgHuitui;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private ZhiShiBean.DataBean dataBean;
    private int id;
    private ArrayList<Integer> id_list;

    @Override
    protected int getLayoutId() {
        return R.layout.zhishiwenz_fragemnt;
    }

    @Override
    protected MainPresenter basePresenter() {
        return new MainPresenter();
    }

    @Override
    public void initView() {
        super.initView();

        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        id = intent.getIntExtra("id",0);
        dataBean = (ZhiShiBean.DataBean) intent.getSerializableExtra
                ("dataBean");
        List<ZhiShiBean.DataBean.ChildrenBean> children = dataBean.getChildren();
        StringBuffer stringBuffer = new StringBuffer();
        id_list = new ArrayList<>();
        for (int i = 0; i < children.size(); i++) {
            String name = children.get(i).getName();
            int id = children.get(i).getId();
            stringBuffer.append(name + "-");
            id_list.add(id);
        }
        tvTitle.setText(dataBean.getName());
        String s = String.valueOf(stringBuffer);
        String[] split = s.split("-");
        ArrayList<String> tab_list = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            tab_list.add(split[i]);
        }


        initRclv(tab_list);
        initTab(tab_list);
        ivImgHuitui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initRclv(ArrayList<String> tab_list) {
        for (int i = 0; i < tab_list.size(); i++) {
            ZhiShiFuFragment zhiShiFuFragment = new ZhiShiFuFragment();
            zhiShiFuFragment.setId(id_list.get(i));
            fragments.add(zhiShiFuFragment);
        }
    }

    private void initTab(ArrayList<String> tab_list) {
        AccoutAdapter accoutAdapter = new AccoutAdapter(getSupportFragmentManager(), fragments,
                tab_list);
        vpZhishiwenz.setAdapter(accoutAdapter);
        tablayoutZhishiwenz.setupWithViewPager(vpZhishiwenz);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Toast.makeText(this, "分享", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(1, 1, 1, "分享");
        return super.onCreateOptionsMenu(menu);

    }

}

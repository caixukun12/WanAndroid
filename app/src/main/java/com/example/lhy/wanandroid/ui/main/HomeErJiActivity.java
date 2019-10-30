package com.example.lhy.wanandroid.ui.main;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lhy.wanandroid.R;
import com.example.lhy.wanandroid.base.BaseActivity;
import com.example.lhy.wanandroid.bean.homebean.HomeBean;
import com.example.lhy.wanandroid.bean.homebean.HomeErJiBean;
import com.example.lhy.wanandroid.fragment.presenter_fragment.HomeeJiPresenter;
import com.example.lhy.wanandroid.fragment.view_fragment.HomeErJiView;

import butterknife.BindView;

public class HomeErJiActivity extends BaseActivity<HomeeJiPresenter, HomeErJiView> implements
        HomeErJiView {


    @BindView(R.id.webview)
    WebView webview;
    @BindView(R.id.iv_img_huitui)
    ImageView ivImgHuitui;
    @BindView(R.id.tv_title_home_erji)
    TextView tvTitleHomeErji;
    @BindView(R.id.toolbar_home_erji)
    Toolbar toolbarHomeErji;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_home_er_ji;
    }

    @Override
    protected HomeeJiPresenter basePresenter() {
        return new HomeeJiPresenter();
    }

    @Override
    public void initView() {
        super.initView();
       setSupportActionBar(toolbarHomeErji);
        Intent intent = getIntent();
        HomeBean.DataBean.DatasBean databean = (HomeBean.DataBean.DatasBean) intent
                .getSerializableExtra("datasbean");

        String link = databean.getLink();
        String title = databean.getTitle();
        tvTitleHomeErji.setText(title);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl(link);
        ivImgHuitui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    public void initData() {
        mPresenter.loadData();
    }

    @Override
    public void setData(HomeErJiBean dataBeans) {


    }

    @Override
    public void showToast(String error) {


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(1, 1, 1, "分享");
        menu.add(1, 2, 1, "收藏");
        menu.add(1, 3, 1, "用浏览器打开");
        return super.onCreateOptionsMenu(menu);
    }


}

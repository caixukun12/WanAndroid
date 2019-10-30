package com.example.lhy.wanandroid.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lhy.wanandroid.R;
import com.example.lhy.wanandroid.bean.accoutbean.AccoutFuBean;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AccoutErJiActivity extends AppCompatActivity {

    @BindView(R.id.iv_img_huitui)
    ImageView ivImgHuitui;
    @BindView(R.id.tv_title_accout_erji)
    TextView tvTitleAccoutErji;
    @BindView(R.id.toolbar_accout_erji)
    Toolbar toolbarHomeErji;
    @BindView(R.id.webview_accout)
    WebView webviewAccout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accout_er_ji);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {

        Intent intent = getIntent();
        AccoutFuBean.DataBean.DatasBean datasBean = (AccoutFuBean.DataBean.DatasBean) intent.getSerializableExtra("datasBean");

        String link = datasBean.getLink();
        webviewAccout.setWebViewClient(new WebViewClient());
        webviewAccout.loadUrl(link);
        tvTitleAccoutErji.setText(datasBean.getTitle());

    }

    @OnClick(R.id.iv_img_huitui)
    public void onClick() {
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(1,1,1,"分享");
        menu.add(1,2,1,"收藏");
        menu.add(1,3,1,"用浏览器打开");
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 1:
                Toast.makeText(this, this.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, this.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this, this.getTitle(), Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

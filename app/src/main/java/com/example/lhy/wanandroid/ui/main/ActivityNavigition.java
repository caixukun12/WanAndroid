package com.example.lhy.wanandroid.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lhy.wanandroid.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActivityNavigition extends AppCompatActivity {

    @BindView(R.id.iv_img_huitui)
    ImageView ivImgHuitui;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.webview)
    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigition);
        ButterKnife.bind(this);
     //   setSupportActionBar(toolbar);
        Intent intent = getIntent();
        String link = intent.getStringExtra("link");

        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl(link);
        ivImgHuitui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

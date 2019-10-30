package com.example.lhy.wanandroid.ui.main;

import android.content.Intent;
import android.os.Build;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lhy.wanandroid.R;
import com.example.lhy.wanandroid.base.BaseActivity;
import com.example.lhy.wanandroid.bean.projectbean.ProjectLieBiaoBean;
import com.example.lhy.wanandroid.fragment.presenter_fragment.ProjectFuPresenter;
import com.example.lhy.wanandroid.fragment.view_fragment.ProjectView;

import butterknife.BindView;

/**
 * Created by usercwq on 2019/10/27.
 */

public class ProjectActivity extends BaseActivity<ProjectFuPresenter, ProjectView> {
    @BindView(R.id.iv_img_huitui)
    ImageView ivImgHuitui;
    @BindView(R.id.tv_title_project)
    TextView tvTitleProject;
    @BindView(R.id.toolbar_project)
    Toolbar toolbar;
    @BindView(R.id.webview_projection)
    WebView webviewProjection;

    @Override
    protected int getLayoutId() {
        return R.layout.project_erji_item;
    }

    @Override
    protected ProjectFuPresenter basePresenter() {
        return new ProjectFuPresenter();
    }

    @Override
    public void initView() {
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        ProjectLieBiaoBean.DataBean.DatasBean datasBean = (ProjectLieBiaoBean.DataBean.DatasBean) intent.getSerializableExtra("datasBean");

        String link = datasBean.getLink();
        webviewProjection.setWebViewClient(new WebViewClient());
        webviewProjection.loadUrl(link);
        tvTitleProject.setText(datasBean.getTitle());
        ivImgHuitui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.white));

        }
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

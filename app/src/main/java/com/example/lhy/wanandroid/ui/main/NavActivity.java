package com.example.lhy.wanandroid.ui.main;

import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lhy.wanandroid.R;
import com.example.lhy.wanandroid.base.BaseActivity;
import com.example.lhy.wanandroid.bean.UserLoginBean;
import com.example.lhy.wanandroid.fragment.presenter_fragment.NavPresenter;
import com.example.lhy.wanandroid.fragment.view_fragment.NavIiew;

import butterknife.BindView;

/**
 * Created by usercwq on 2019/10/28.
 */

//登录页面
public class NavActivity extends BaseActivity<NavPresenter, NavIiew> implements NavIiew {
    @BindView(R.id.iv_img_huitui)
    ImageView ivImgHuitui;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.app_bar_layout)
    AppBarLayout appBarLayout;
    @BindView(R.id.et_username)
    EditText etUsername;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.btn_login)
    TextView btnLogin;
    @BindView(R.id.tv_sign_up)
    TextView tvSignUp;
    @BindView(R.id.tv_title)
    TextView tvTitle;

    @Override
    protected int getLayoutId() {
        return R.layout.navlogin;
    }

    @Override
    protected NavPresenter basePresenter() {
        return new NavPresenter();
    }

    @Override
    public void initView() {
        tvTitle.setText("登录");
        initLiniter();


    }

    private void initLiniter() {

        //点击登录
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                mPresenter.loadData(username,password);
            }
        });
        //点击注册
        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToRegisterAcrtivity();
            }
        });
        ivImgHuitui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void goToRegisterAcrtivity() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivityForResult(intent,200);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==200 &&resultCode==100){
            String password = data.getStringExtra("password");
            String username = data.getStringExtra("username");
            etPassword.setText(password);
            etUsername.setText(username);
        }
    }

    @Override
    public void setData(UserLoginBean dataBeans) {
        int errorCode = dataBeans.getErrorCode();
        String errorMsg = dataBeans.getErrorMsg();

        if (errorCode==0){
            Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
            String username = dataBeans.getData().getUsername();
            Intent intent = getIntent();
            intent.putExtra("username",username);
            setResult(100,intent);
            finish();
        }else{
            Toast.makeText(this, errorMsg, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void shoToast(String error) {

    }
}

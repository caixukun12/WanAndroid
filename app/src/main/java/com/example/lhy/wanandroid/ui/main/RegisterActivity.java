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
import com.example.lhy.wanandroid.bean.UserRegisterBean;
import com.example.lhy.wanandroid.fragment.presenter_fragment.RegisterPresenter;
import com.example.lhy.wanandroid.fragment.view_fragment.RegisterView;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by usercwq on 2019/10/28.
 */

public class RegisterActivity extends BaseActivity<RegisterPresenter, RegisterView> implements
        RegisterView {

    @BindView(R.id.iv_img_huitui)
    ImageView ivImgHuitui;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.app_bar_layout)
    AppBarLayout appBarLayout;
    @BindView(R.id.et_username)
    EditText etUsername;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.et_password2)
    EditText etPassword2;
    @BindView(R.id.btn_register)
    TextView btnRegister;
    @BindView(R.id.tv_sign_in)
    TextView tvSignIn;

    private int errorCode;
    private String errorMsg;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_register;
    }

    @Override
    protected RegisterPresenter basePresenter() {
        return new RegisterPresenter();
    }

    @Override
    public void initView() {
        tvTitle.setText("注册");
        initListeners();
    }

    private void initListeners() {
        //点击到登录页面
        ivImgHuitui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @OnClick({R.id.btn_register, R.id.tv_sign_in})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_register://注册成功
                 String name = etUsername.getText().toString();
                 String password = etPassword.getText().toString();
                 String re_passwrod = etPassword2.getText().toString();
               mPresenter.loadData(name,password,re_passwrod);


                break;
            case R.id.tv_sign_in:  //去登录

                finish();
                break;
        }
    }




    @Override
    public void setData(UserRegisterBean dataBeans) {
        errorMsg = dataBeans.getErrorMsg().toString();
        errorCode = dataBeans.getErrorCode();

        if (errorCode ==0){
            Toast.makeText(this,"注册成功" , Toast.LENGTH_SHORT).show();
            Intent intent = getIntent();
            String username = etUsername.getText().toString();
            String password = etPassword.getText().toString();
            intent.putExtra("password",password);
            intent.putExtra("username",username);
            setResult(100,intent);
            finish();
        }else{
            Toast.makeText(this, errorMsg, Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void showToast(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}

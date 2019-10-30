package com.example.lhy.wanandroid.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by usercwq on 2019/10/22.
 */

public abstract class BaseActivity<P extends BasePresenter,V extends BaseView>
        extends AppCompatActivity implements BaseView {

    private Unbinder bind;
    public P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        bind = ButterKnife.bind(this);
        mPresenter = basePresenter();
        if (mPresenter!=null){
            mPresenter.buildView((V)this);
        }
        initView();
        initData();
        initListener();

    }

    public void initListener() {

    }

    public void initData() {

    }

    public void initView() {

    }

    protected abstract int getLayoutId();

    protected abstract P basePresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (bind!=null){
            bind.unbind();

        }

    }
}

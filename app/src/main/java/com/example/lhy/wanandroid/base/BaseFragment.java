package com.example.lhy.wanandroid.base;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class BaseFragment<P extends BasePresenter,V extends BaseView>
        extends Fragment implements BaseView {


    private View inflate;
    public P mPresenter;
    private Unbinder bind;

    public BaseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (inflate==null){
            inflate = inflater.inflate(getLayoutId(), container, false);
        }
        bind = ButterKnife.bind(this, inflate);
        mPresenter=initPresenter();
        if (mPresenter!=null){
            mPresenter.buildView(this);
        }
        initView();
        initData();
        return inflate;
    }

    public void initData() {

    }

    public void initView() {

    }

    protected abstract P initPresenter();

    protected abstract int getLayoutId();

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (bind!=null){
            bind.unbind();
        }

    }


}

package com.example.lhy.wanandroid.base;

/**
 * Created by usercwq on 2019/10/22.
 */

public abstract class BasePresenter<V extends BaseView> {
    public V mView;

    public BasePresenter(){
        initModel();
    }

    protected abstract void initModel();


    public  void buildView(V view) {
        this.mView=view;
    }

}

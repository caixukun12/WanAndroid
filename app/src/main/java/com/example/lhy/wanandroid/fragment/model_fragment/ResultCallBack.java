package com.example.lhy.wanandroid.fragment.model_fragment;

/**
 * Created by usercwq on 2019/10/24.
 */

public interface ResultCallBack<T> {
    void onSussecc(T dataBeans);

    void onField(String error);

    void onSusseccFu(T datasBeans);

    void onFieldFu(String error);

}

package com.example.lhy.wanandroid.fragment.presenter_fragment;

import com.example.lhy.wanandroid.base.BasePresenter;
import com.example.lhy.wanandroid.bean.accoutbean.AccoutBean;
import com.example.lhy.wanandroid.fragment.model_fragment.AccoutModel;
import com.example.lhy.wanandroid.fragment.model_fragment.ResultCallBack;
import com.example.lhy.wanandroid.fragment.view_fragment.AccoutView;

import java.util.List;

/**
 * Created by usercwq on 2019/10/24.
 */

public class AccoutPresenter extends BasePresenter<AccoutView> {

    private AccoutModel accoutModel;

    @Override
    protected void initModel() {
        accoutModel = new AccoutModel();
    }

    public void loadData() {
        accoutModel.loadData(new ResultCallBack<List<AccoutBean.DataBean>>() {
            @Override
            public void onSussecc(List<AccoutBean.DataBean> dataBeans) {
                if (mView!=null){
                    if (dataBeans!=null){
                        mView.setData(dataBeans);
                    }
                }
            }

            @Override
            public void onField(String error) {
                if (mView!=null){
                    mView.showToast(error);
                }
            }

            @Override
            public void onSusseccFu(List<AccoutBean.DataBean> datasBeans) {

            }

            @Override
            public void onFieldFu(String error) {

            }
        });


    }
}

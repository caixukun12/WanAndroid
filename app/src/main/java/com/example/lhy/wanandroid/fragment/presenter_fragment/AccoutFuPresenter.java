package com.example.lhy.wanandroid.fragment.presenter_fragment;

import com.example.lhy.wanandroid.base.BasePresenter;
import com.example.lhy.wanandroid.bean.accoutbean.AccoutFuBean;
import com.example.lhy.wanandroid.fragment.model_fragment.AccoutModel;
import com.example.lhy.wanandroid.fragment.model_fragment.ResultCallBack;
import com.example.lhy.wanandroid.fragment.view_fragment.AccoutFuView;

import java.util.List;

/**
 * Created by usercwq on 2019/10/24.
 */

public class AccoutFuPresenter extends BasePresenter<AccoutFuView> {

    private AccoutModel accoutModel;

    @Override
    protected void initModel() {
        accoutModel = new AccoutModel();

    }

    public void loadData(int id) {
        accoutModel.loadFuData(id,new ResultCallBack<List<AccoutFuBean.DataBean.DatasBean>>() {

            @Override
            public void onSussecc(List<AccoutFuBean.DataBean.DatasBean> dataBeans) {

            }

            @Override
            public void onField(String error) {

            }

            @Override
            public void onSusseccFu(List<AccoutFuBean.DataBean.DatasBean> datasBeans) {
                if (mView!=null){
                    if (datasBeans!=null){
                        mView.setDataFu(datasBeans);
                    }
                }
            }

            @Override
            public void onFieldFu(String error) {
                if (mView!=null){
                    mView.showToast(error);
                }
            }
        });

    }
}

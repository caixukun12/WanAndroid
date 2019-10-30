package com.example.lhy.wanandroid.fragment.presenter_fragment;

import com.example.lhy.wanandroid.base.BasePresenter;
import com.example.lhy.wanandroid.bean.zhishibean.ZhiShiBean;
import com.example.lhy.wanandroid.fragment.model_fragment.ZhiShiClickBack;
import com.example.lhy.wanandroid.fragment.model_fragment.ZhiShiModel;
import com.example.lhy.wanandroid.fragment.view_fragment.ZhiShiView;

import java.util.List;

/**
 * Created by usercwq on 2019/10/24.
 */

public class ZhiShiPresenter extends BasePresenter<ZhiShiView> {

    private ZhiShiModel zhiShiModel;

    @Override
    protected void initModel() {
        zhiShiModel = new ZhiShiModel();
    }

    public void loadData() {
        zhiShiModel.loadData(new ZhiShiClickBack<List<ZhiShiBean.DataBean>>() {
            @Override
            public void onSeccuss(List<ZhiShiBean.DataBean> dataBeans) {
                if (mView!=null){
                    if (dataBeans!=null){
                        mView.setDatas(dataBeans);
                    }
                }
            }

            @Override
            public void onFiled(String error) {
                if (mView!=null){
                    mView.showToast(error);
                }
            }
        });
    }
}

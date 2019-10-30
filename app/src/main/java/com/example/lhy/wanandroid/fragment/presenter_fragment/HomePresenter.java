package com.example.lhy.wanandroid.fragment.presenter_fragment;

import com.example.lhy.wanandroid.base.BasePresenter;
import com.example.lhy.wanandroid.bean.homebean.BannerBean;
import com.example.lhy.wanandroid.bean.homebean.HomeBean;
import com.example.lhy.wanandroid.fragment.model_fragment.HomeModel;
import com.example.lhy.wanandroid.fragment.model_fragment.ZhiShiClickBack;
import com.example.lhy.wanandroid.fragment.view_fragment.HomeView;

/**
 * Created by usercwq on 2019/10/24.
 */
//首页
public class HomePresenter extends BasePresenter<HomeView> {

    private HomeModel homeModel;

    @Override
    protected void initModel() {
        homeModel = new HomeModel();
    }

    public void loadBanneData() {
        homeModel.loadBanneData(new ZhiShiClickBack<BannerBean>() {

            @Override
            public void onSeccuss(BannerBean dataBeans) {
                if (mView!=null){
                    if (dataBeans!=null){
                        mView.setData(dataBeans);
                    }
                }
            }

            @Override
            public void onFiled(String error) {
                if (mView!=null)
                        mView.showToast(error);
            }
        });
    }

    public void loadData(int page) {
        homeModel.loadData(page,new ZhiShiClickBack<HomeBean>() {
            @Override
            public void onSeccuss(HomeBean dataBeans) {
                if (mView!=null){
                    if (dataBeans!=null){
                        mView.setDataLianBiao(dataBeans);
                    }
                }

            }

            @Override
            public void onFiled(String error) {
                if (mView!=null)
                    mView.showToast(error);
            }
        });
    }
}

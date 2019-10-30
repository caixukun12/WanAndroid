package com.example.lhy.wanandroid.fragment.presenter_fragment;

import com.example.lhy.wanandroid.base.BasePresenter;
import com.example.lhy.wanandroid.bean.zhishibean.ZhiShiWenZBean;
import com.example.lhy.wanandroid.fragment.model_fragment.ZhiShiClickBack;
import com.example.lhy.wanandroid.fragment.model_fragment.ZhiShiWanZhnagModel;
import com.example.lhy.wanandroid.fragment.view_fragment.ZhiShiWanZhnagView;

/**
 * Created by usercwq on 2019/10/25.
 */

public class ZhiShiWanZhangPresenter extends BasePresenter<ZhiShiWanZhnagView> {

    private ZhiShiWanZhnagModel zhiShiWanZhnagModel;

    public void loadData(int id) {
        zhiShiWanZhnagModel.loadData(id,new ZhiShiClickBack<ZhiShiWenZBean>
                () {
            @Override
            public void onSeccuss(ZhiShiWenZBean dataBeans) {
                if (mView!=null){
                    if (dataBeans!=null){
                        mView.setData(dataBeans);
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

    @Override
    protected void initModel() {
        zhiShiWanZhnagModel = new ZhiShiWanZhnagModel();
    }
}

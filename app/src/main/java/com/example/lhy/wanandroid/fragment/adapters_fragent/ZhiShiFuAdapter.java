package com.example.lhy.wanandroid.fragment.adapters_fragent;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.lhy.wanandroid.R;
import com.example.lhy.wanandroid.bean.zhishibean.ZhiShiWenZBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by usercwq on 2019/10/24.
 */

public class ZhiShiFuAdapter extends RecyclerView.Adapter {
    private ArrayList<ZhiShiWenZBean.DataBean.DatasBean> list = new ArrayList<>();
    private Context context;

    public ZhiShiFuAdapter( Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.accout_fu_item, parent, false);
        MyItem myItem = new MyItem(inflate);
        return myItem;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyItem myItem= (MyItem) holder;

        myItem.tvLeftName.setText(list.get(position).getSuperChapterName()+"/"+list.get(position).getChapterName());
        myItem.tvName.setText(list.get(position).getShareUser());
        myItem.tvMessage.setText(list.get(position).getTitle());
        myItem.tvNameTimer.setText(list.get(position).getNiceDate());
        Glide.with(context).load(list.get(position).getEnvelopePic()).into(myItem.ivRightImage);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setData(List<ZhiShiWenZBean.DataBean.DatasBean> datasBeans) {

        list.addAll(datasBeans);
        notifyDataSetChanged();
    }

    class MyItem extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_name)
        TextView tvName;
        @BindView(R.id.tv_name_timer)
        TextView tvNameTimer;
        @BindView(R.id.tv_message)
        TextView tvMessage;
        @BindView(R.id.tv_left_name)
        TextView tvLeftName;
        @BindView(R.id.iv_right_image)
        ImageView ivRightImage;
        public MyItem(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}

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
import com.example.lhy.wanandroid.bean.projectbean.ProjectLieBiaoBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by usercwq on 2019/10/24.
 */

public class ProjectFuAdapter extends RecyclerView.Adapter {
    private ArrayList<ProjectLieBiaoBean.DataBean.DatasBean> list = new ArrayList<>();
    private Context context;

    public ProjectFuAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.project_fu_item, parent, false);TextView tvrigetbuttonproject = (TextView) inflate.findViewById(R.id.tv_riget_button__project);


        MyItem myItem = new MyItem(inflate);
        return myItem;
    }

    public ArrayList<ProjectLieBiaoBean.DataBean.DatasBean> getList() {
        return list;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        MyItem myItem= (MyItem) holder;
        myItem.tvtitleproject.setText(list.get(position).getTitle());
        myItem.tvmessageproject.setText(list.get(position).getDesc());
        myItem.tvleftbuttonproject.setText(list.get(position).getAuthor());
        myItem.tv_riget_button__project.setText(list.get(position).getNiceDate());
        Glide.with(context).load(list.get(position).getEnvelopePic()).into(myItem.ivimgproject);
        myItem.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClick!=null){
                    onItemClick.onClickItem(v,position);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setData(List<ProjectLieBiaoBean.DataBean.DatasBean> datasBeans) {

        list.addAll(datasBeans);
        notifyDataSetChanged();
    }

    class MyItem extends RecyclerView.ViewHolder {

        public   TextView tvleftbuttonproject;
        public  TextView tvmessageproject;
        public  TextView tvtitleproject;
        public  TextView tv_riget_button__project;
        public  ImageView ivimgproject;

        public MyItem(View itemView) {
            super(itemView);
            tvleftbuttonproject = (TextView) itemView.findViewById(R.id.tv_left_button_project);
            tvmessageproject = (TextView) itemView.findViewById(R.id.tv_message_project);
            tvtitleproject = (TextView) itemView.findViewById(R.id.tv_title_project);
            tv_riget_button__project = (TextView) itemView.findViewById(R.id.tv_riget_button__project);
            ivimgproject = (ImageView) itemView.findViewById(R.id.iv_img_project);
        }
    }
    public OnItemClick onItemClick;

    public void setOnItemClick(OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    public interface OnItemClick{
        void onClickItem(View v, int position);


    }
}

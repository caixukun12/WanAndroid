package com.example.lhy.wanandroid.fragment.adapters_fragent;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lhy.wanandroid.R;
import com.example.lhy.wanandroid.bean.zhishibean.ZhiShiBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by usercwq on 2019/10/24.
 */

public class ZhiShiApapder extends RecyclerView.Adapter {
    public ArrayList<ZhiShiBean.DataBean> list = new ArrayList<>();
    private Context context;
    private String name;
    public static String tab;

    public ZhiShiApapder(Context context) {

        this.context = context;
    }

    public ArrayList<ZhiShiBean.DataBean> getList() {
        return list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.zhishi_item, parent, false);
        MyItem myItem = new MyItem(inflate);
        return myItem;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        MyItem myItem = (MyItem) holder;
        myItem.tvTitle.setText(list.get(position).getName());
        List<ZhiShiBean.DataBean.ChildrenBean> children = list.get(position).getChildren();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0;i<children.size();i++){
            String name = children.get(i).getName();
            stringBuffer.append(name+"     ");
        }
        myItem.tvMessage.setText(stringBuffer);
        myItem.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickItem.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyItem extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_message)
        TextView tvMessage;
        public MyItem(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }

    public void setData(List<ZhiShiBean.DataBean> dataBeans) {
        list.addAll(dataBeans);
        notifyDataSetChanged();

    }
    public OnClickItem onClickItem;

    public void setOnClickItem(OnClickItem onClickItem) {
        this.onClickItem = onClickItem;
    }

    public interface OnClickItem{
        void onItemClick(int position);
    }
}

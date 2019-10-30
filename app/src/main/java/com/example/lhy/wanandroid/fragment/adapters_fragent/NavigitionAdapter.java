package com.example.lhy.wanandroid.fragment.adapters_fragent;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.lhy.wanandroid.R;
import com.example.lhy.wanandroid.bean.navigition.NavigitionBean;
import com.example.lhy.wanandroid.ui.main.ActivityNavigition;
import com.example.lhy.wanandroid.util.FlowLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by usercwq on 2019/10/27.
 */

public class NavigitionAdapter extends RecyclerView.Adapter<NavigitionAdapter.MyItem> {
    private List<NavigitionBean.DataBean> data = new ArrayList<>();
    private Context context;

    public NavigitionAdapter(Context
                                     context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyItem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_flow, parent, false);
        MyItem myItem = new MyItem(inflate);
        return myItem;

    }

    @Override
    public void onBindViewHolder(@NonNull MyItem holder, int position) {
        NavigitionBean.DataBean dataBean = data.get(position);
        final List<NavigitionBean.DataBean.ArticlesBean> articles = dataBean.getArticles();
        holder.tvTitleNav.setText(articles.get(0).getChapterName());
//往容器内添加TextView数据

        for (int i = 0; i < articles.size(); i++) {

            //获取视图,视图可以自定义,可以添加自己想要的效果
            TextView label = (TextView) View.inflate(context, R.layout.message, null);
            //获取数据
            final String data = articles.get(i).getTitle();
            //绑定数据
            label.setText(data);
            final int finalI = i;
            label.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, ActivityNavigition.class);
                    intent.putExtra("link", articles.get(finalI).getLink());
                    context.startActivity(intent);

                }
            });
            //加到容器中,parent是FlowLayout
            holder.flow.addView(label);
        }

    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(NavigitionBean dataBeans) {
        List<NavigitionBean.DataBean> data = dataBeans.getData();
        this.data.addAll(data);
        notifyDataSetChanged();

    }

    public class MyItem extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_title_nav)
        TextView tvTitleNav;
        @BindView(R.id.flow)
        FlowLayout flow;

        public MyItem(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

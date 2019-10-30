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
import com.example.lhy.wanandroid.bean.homebean.BannerBean;
import com.example.lhy.wanandroid.bean.homebean.HomeBean;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by usercwq on 2019/10/24.
 */

public class HomeAdapter extends RecyclerView.Adapter {
    private ArrayList<BannerBean.DataBean> list = new ArrayList<>();
    private ArrayList<HomeBean.DataBean.DatasBean> list_liebiao = new ArrayList<>();
    private Context context;
    private int BANNERR_TYPE = 0;
    private int LIE_DATA_TYPE = 1;
    private  int poastion_banner;

    public ArrayList<HomeBean.DataBean.DatasBean> getList_liebiao() {
        return list_liebiao;
    }

    public HomeAdapter(Context context) {

        this.context = context;
        for (int i=0;i<list.size();i++){
            poastion_banner = i;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = null;
        if (viewType == BANNERR_TYPE) {
            inflate = LayoutInflater.from(context).inflate(R.layout.banner_item, parent, false);
            MyItemBanner myItem = new MyItemBanner(inflate);
            return myItem;
        } else {
            inflate = LayoutInflater.from(context).inflate(R.layout.liebiao_item, parent, false);
            MyItemLieBaio myItemLieBaio = new MyItemLieBaio(inflate);
            return myItemLieBaio;
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        int type = getItemViewType(position);

        if (type == BANNERR_TYPE) {
            MyItemBanner myItemBanner = (MyItemBanner) holder;
            myItemBanner.banner.setImages(list)
                    .setImageLoader(new ImageLoader() {
                        @Override
                        public void displayImage(Context context, Object path, ImageView
                                imageView) {
                            BannerBean.DataBean d = (BannerBean.DataBean) path;
                            Glide.with(context.getApplicationContext()) .load(d.getImagePath()) .into(imageView);

                        }
                    })
                    //设置轮播的动画效果,里面有很多种特效,可以都看看效果。
                    .setBannerAnimation(Transformer.ZoomOutSlide)
                    //设置指示器的位置，小点点，居中显示
                    .setIndicatorGravity(BannerConfig.RIGHT)
                    .start();
        } else {

            MyItemLieBaio myItemLieBaio = (MyItemLieBaio) holder;
            myItemLieBaio.tvNameTimer.setText(list_liebiao.get(position - 1).getNiceDate());
            myItemLieBaio.tvNameWy.setText(list_liebiao.get(position - 1).getAuthor());
            myItemLieBaio.tv_message_liebiao.setText(list_liebiao.get(position - 1).getTitle());
            myItemLieBaio.tv_left_name_liebiao.setText(list_liebiao.get(position-1).getSuperChapterName()+"/"
                    +list_liebiao.get(position-1).getChapterName());
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClick.onClickItem(v,position);
            }
        });
    }

    @Override
    public int getItemCount() {

        if (list.size() > 0 && list != null) {
            return list_liebiao.size() + 1;
        } else {
            return list_liebiao.size();
        }

    }


    public void setData(BannerBean dataBeans) {
        List<BannerBean.DataBean> banner_Data = dataBeans.getData();
        list.addAll(banner_Data);
        notifyDataSetChanged();
    }

    public void setLIeBiaoData(HomeBean dataBeans) {
        List<HomeBean.DataBean.DatasBean> datas = dataBeans.getData().getDatas();
        list_liebiao.addAll(datas);
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {

        if (position == 0) {
            return BANNERR_TYPE;
        } else {
            return LIE_DATA_TYPE;
        }


    }

    class MyItemBanner extends RecyclerView.ViewHolder {
        @BindView(R.id.banner)
        Banner banner;

        public MyItemBanner(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    class MyItemLieBaio extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_name_zhiding)
        TextView tvNameZhiding;
        @BindView(R.id.tv_name_wy)
        TextView tvNameWy;
        @BindView(R.id.tv_name_timer)
        TextView tvNameTimer;
        @BindView(R.id.tv_message_liebiao)
        TextView tv_message_liebiao;
        @BindView(R.id.tv_left_name_liebiao)
        TextView tv_left_name_liebiao;
        @BindView(R.id.iv_right_image_liebiao)
        ImageView iv_right_image_liebiao;

        public MyItemLieBaio(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
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

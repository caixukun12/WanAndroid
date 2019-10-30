package com.example.lhy.wanandroid.ui.main;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lhy.wanandroid.R;
import com.example.lhy.wanandroid.base.BaseActivity;
import com.example.lhy.wanandroid.bean.AnalysisBean;
import com.example.lhy.wanandroid.bean.Rowkey;
import com.example.lhy.wanandroid.fragment.AccoutFragment;
import com.example.lhy.wanandroid.fragment.HomeFragment;
import com.example.lhy.wanandroid.fragment.NavigitionFragment;
import com.example.lhy.wanandroid.fragment.ProjectFragment;
import com.example.lhy.wanandroid.fragment.ZhiShiFragment;
import com.example.lhy.wanandroid.http.ApiServcie;
import com.example.lhy.wanandroid.presenter.MainPresenter;
import com.example.lhy.wanandroid.view.MainView;
import com.google.gson.Gson;
import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.tencent.bugly.crashreport.CrashReport;
import com.umeng.analytics.MobclickAgent;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends BaseActivity<MainPresenter, MainView> implements MainView {


    private static final String TAG = "MainActivity";
    @BindView(R.id.rButton_home)
    RadioButton rButtonHome;
    @BindView(R.id.rButton_zhiShi)
    RadioButton rButtonZhiShi;
    @BindView(R.id.rButton_accounts)
    RadioButton rButtonAccounts;
    @BindView(R.id.rButton_Navigation)
    RadioButton rButtonNavigation;
    @BindView(R.id.rButton_Project)
    RadioButton rButtonProject;
    @BindView(R.id.rGroup)
    RadioGroup rGroup;
    @BindView(R.id.nav)
    NavigationView nav;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.dl)
    DrawerLayout dl;
    @BindView(R.id.search_view)
    MaterialSearchView searchView;
    @BindView(R.id.toolbar_container)
    FrameLayout toolbarContainer;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.fl)
    FrameLayout fl;

    private UMShareAPI mShareAPI;
    private ArrayList<Rowkey> rowkeys = new ArrayList<>();
    private FragmentManager manager;
    private int HOME_TYPE = 0;
    private int ZHISHI_TYPE = 1;
    private int ACCOUT_TYPE = 2;
    private int NAVIGITION_TYPE = 3;
    private int PROJECT_TYPE = 4;
    private ArrayList<Fragment> fragments;
    private int hidepostion;
    private TextView tvUser;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected MainPresenter basePresenter() {
        return new MainPresenter();
    }

    @Override
    public void initView() {
        super.initView();
        //requestData();
        //申请动态权限
        getPermission();
        //bugily初始化
        getBugly();
        // getData();
// 如果通过“AndroidManifest.xml”来配置APP信息，初始化方法如下
// CrashReport.initCrashReport(context, strategy);
        LeakThread leakThread = new LeakThread();
        leakThread.start();

        initToolbar();
        //测换
        gotNavigition();
        initSeach();
        manager = getSupportFragmentManager();
        fragments = new ArrayList<>();
        fragments.add(HomeFragment.getInstance());
        fragments.add(ZhiShiFragment.getInstance());
        fragments.add(AccoutFragment.getInstance());
        fragments.add(NavigitionFragment.getInstance());
        fragments.add(ProjectFragment.getInstance());

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fl, fragments.get(HOME_TYPE))
                .show(fragments.get(HOME_TYPE));

        transaction.commit();
        getNavigition();
    }

    //侧滑
    private void gotNavigition() {
        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ji_fen:  //我的积分

                        break;
                    case R.id.collection: //我的收藏
                        break;
                    case  R.id.todo:  //TODO

                        break;
                    case  R.id.ye_jms: //夜间模式

                        break;
                    case  R.id.seeting:  //系统设置
goToSetting();
                        break;
                    case  R.id.about_me:  //关于我们
                        goToWoMen();
                        break;
                    case  R.id.t_login:  //退出登陆

                        break;
                }
                return false;
            }
        });
    }

    private void goToSetting() {
        Intent intent2 = new Intent(this,SettingActivity.class);
        startActivity(intent2);
    }

    //关于我们
    private void goToWoMen() {
        Intent intent = new Intent(this, GuanYuWomenActivity.class);
        startActivity(intent);

    }

    private void getNavigition() {
        View headerView = nav.getHeaderView(0);
        tvUser = headerView.findViewById(R.id.tv_user);
        ImageView ivNavImgJiFen = headerView.findViewById(R.id.iv_nav_img_jifen);
        //点击登录
        tvUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvUser.setText("去登录");
               go2ActviityNav();

            }
        });
        ivNavImgJiFen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "我是积分排行帮", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     *
     *
     * 登录页面
     */
    private void go2ActviityNav() {

        Intent intent = new Intent(this, NavActivity.class);

        startActivityForResult(intent,200);
    }


    private void initFragment(int type) {
        FragmentTransaction transaction = manager.beginTransaction();
        Fragment showFragment = fragments.get(type);
        Fragment hideFragment = fragments.get(hidepostion);
        if (!showFragment.isAdded()) {
            transaction.add(R.id.fl, showFragment);
        }
        transaction.hide(hideFragment)
                .show(showFragment)
                .addToBackStack(null)
                .commit();
        hidepostion = type;

    }

    private void initSeach() {
        MaterialSearchView searchView = (MaterialSearchView) findViewById(R.id.search_view);
        searchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                //Do some magic

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //Do some magic
                return false;
            }
        });

        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {

                //Do some magic
            }

            @Override
            public void onSearchViewClosed() {
                //Do some magic

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==200 &&resultCode==100){
            String username = data.getStringExtra("username");
            tvUser.setText(username);
        }
    }

    private void initToolbar() {
        setTitle("");
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, dl, toolbar, R.string
                .app_name, R.string.app_name);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        dl.addDrawerListener(toggle);
        toggle.syncState();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_seach, menu);

        MenuItem item = menu.findItem(R.id.action_search);
        searchView.setMenuItem(item);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public void onBackPressed() {
        if (searchView.isSearchOpen()) {
            searchView.closeSearch();
        } else {
            super.onBackPressed();
        }
    }

    private void requestData() {
        Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory
                .create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl("http://test.scaiwl.top/")
                .build();
        final ApiServcie mySeriver = retrofit.create(ApiServcie.class);
        mySeriver.getAnalysis().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<AnalysisBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(AnalysisBean bean) {
                        List<AnalysisBean.DataBean> data = bean.getData();
                        for (AnalysisBean.DataBean datum : data) {
                            String rowKey = datum.getRowKey();
                            // Log.i("tag", "rowKey"+rowKey);
                            rowkeys.add(new Rowkey(rowKey));


                        }

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {
                        String json = new Gson().toJson(rowkeys.get(0));
                        Log.i("tag", "json:" + json);
                        final RequestBody requestBody = RequestBody.create(MediaType.parse
                                ("text/plan"), json);
                        mySeriver.getNews(requestBody).subscribeOn(Schedulers.io()).observeOn
                                (AndroidSchedulers.mainThread())
                                .subscribe(new Observer<ResponseBody>() {

                                    @Override
                                    public void onSubscribe(Disposable d) {

                                    }

                                    @Override
                                    public void onNext(ResponseBody responseBody) {
                                        String string = null;
                                        try {
                                            string = responseBody.string();
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                        Log.i("tag", "第二接口json" + string);
                                        try {

                                            JSONObject jsonObject = new JSONObject(string);
                                            JSONObject data = (JSONObject) jsonObject.get("data");
                                            JSONArray jsonArray = data.getJSONArray("2019-10-22");
                                            JSONArray jsonArray2 = data.getJSONArray("2019-10-23");

                                            Log.i("tag", data.toString());
                                            Log.i("tag", "10月22数据：" + jsonArray);
                                            Log.i("tag", "10月23数据：" + jsonArray2);

                                        } catch (JSONException e) {
                                            e.printStackTrace();
                                        }

                                    }

                                    @Override
                                    public void onError(Throwable e) {

                                    }

                                    @Override
                                    public void onComplete() {

                                    }
                                });

                    }
                });


    }

    private void getBugly() {
        Context context = getApplicationContext();
// 获取当前包名
        String packageName = context.getPackageName();
// 获取当前进程名
        String processName = getProcessName(Process.myPid());
// 设置是否为上报进程
        CrashReport.UserStrategy strategy = new CrashReport.UserStrategy(context);
        strategy.setUploadProcess(processName == null || processName.equals(packageName));
// 初始化Bugly
        CrashReport.initCrashReport(context, "c8ed1d2d02", true, strategy);
    }

    private void getPermission() {

        if (Build.VERSION.SDK_INT >= 23) {
            String[] mPermissionList = new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission
                    .READ_PHONE_STATE, Manifest.permission.READ_EXTERNAL_STORAGE};
            ActivityCompat.requestPermissions(this, mPermissionList, 123);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }

    public void onClick(View v) {
        CrashReport.testJavaCrash();
    }

    public void onClickLogin(View view) {
        mShareAPI = UMShareAPI.get(this);
        mShareAPI.getPlatformInfo(MainActivity.this, SHARE_MEDIA.QQ, authListener);
    }

    UMAuthListener authListener = new UMAuthListener() {
        /**
         * @desc 授权开始的回调
         * @param platform 平台名称
         */
        @Override
        public void onStart(SHARE_MEDIA platform) {

        }

        /**
         * @desc 授权成功的回调
         * @param platform 平台名称
         * @param action 行为序号，开发者用不上
         * @param data 用户资料返回
         */
        @Override
        public void onComplete(SHARE_MEDIA platform, int action, Map<String, String> data) {
            logimap(data);
            Toast.makeText(MainActivity.this, "成功了", Toast.LENGTH_LONG).show();

        }

        /**
         * @desc 授权失败的回调
         * @param platform 平台名称
         * @param action 行为序号，开发者用不上
         * @param t 错误原因
         */
        @Override
        public void onError(SHARE_MEDIA platform, int action, Throwable t) {

            Toast.makeText(MainActivity.this, "失败：" + t.getMessage(), Toast.LENGTH_LONG).show();
        }

        /**
         * @desc 授权取消的回调
         * @param platform 平台名称
         * @param action 行为序号，开发者用不上
         */
        @Override
        public void onCancel(SHARE_MEDIA platform, int action) {
            Toast.makeText(MainActivity.this, "取消了", Toast.LENGTH_LONG).show();
        }
    };

    private void logimap(Map<String, String> data) {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Log.i(TAG, "logimap: " + key + "==" + value);
        }
    }


    //首页                   //知识体系            //公众号
    @OnClick({R.id.rButton_home, R.id.rButton_zhiShi, R.id.rButton_accounts, R.id
            //导航                    //项目
            .rButton_Navigation, R.id.rButton_Project})
    public void onClicks(View view) {
        FragmentTransaction transaction = manager.beginTransaction();

        switch (view.getId()) {
            case R.id.rButton_home:  //首页
                initFragment(HOME_TYPE);
                tvTitle.setText("玩Android");
                break;
            case R.id.rButton_zhiShi:    //知识体系
                initFragment(ZHISHI_TYPE);
                tvTitle.setText("知识体系");
                break;
            case R.id.rButton_accounts: //公众号
                initFragment(ACCOUT_TYPE);
                tvTitle.setText("公众号");
                break;
            case R.id.rButton_Navigation://导航
                initFragment(NAVIGITION_TYPE);
                tvTitle.setText("导航");
                break;
            case R.id.rButton_Project:    //项目
                initFragment(PROJECT_TYPE);
                tvTitle.setText("项目");
                break;

        }
        transaction.commit();
    }



    class LeakThread extends Thread {
        @Override
        public void run() {
            try {
                //  CommonUtils.getInstance(MainActivity.this);
                Thread.sleep(6 * 60 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static String getProcessName(int pid) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/proc/" + pid + "/cmdline"));
            String processName = reader.readLine();
            if (!TextUtils.isEmpty(processName)) {
                processName = processName.trim();
            }
            return processName;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void initData() {
        super.initData();


    }
}

package com.example.lhy.wanandroid.fragment.adapters_fragent;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by usercwq on 2019/10/24.
 */

public class AccoutAdapter extends FragmentStatePagerAdapter {
    private ArrayList<Fragment> fragments;
    private ArrayList<String> title;

    public AccoutAdapter(FragmentManager fm, ArrayList<Fragment> fragments, ArrayList<String>
            title) {
        super(fm);
        this.fragments = fragments;

        this.title = title;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }
}

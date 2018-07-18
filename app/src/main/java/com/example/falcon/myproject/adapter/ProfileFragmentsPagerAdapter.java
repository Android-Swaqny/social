package com.example.falcon.myproject.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class ProfileFragmentsPagerAdapter extends FragmentPagerAdapter {

    Context context;
    List<Fragment> fragments;
    List<String> fragmentsTitles;

    public ProfileFragmentsPagerAdapter(FragmentManager fm, Context context, List<Fragment> fragments,List<String> fragmentsTitles) {
        super(fm);
        this.context = context;
        this.fragments = fragments;
        this.fragmentsTitles = fragmentsTitles;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.fragmentsTitles.get(position);
    }
}

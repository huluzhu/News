package com.bwie.news.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.bwie.news.Fragment.XlistFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hujiqinag on 2017/07/19.
 */
public class FragmentAdapter extends FragmentPagerAdapter {

    private List<Fragment> list_fragment;
    private String[] strings;

    public FragmentAdapter(FragmentManager fm, String[] strings) {
        super(fm);
        this.strings = strings;

        list_fragment = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            XlistFragment xlist = new XlistFragment();
            list_fragment.add(xlist);
        }

    }

    @Override
    public Fragment getItem(int position) {
        return list_fragment.get(position);
    }

    @Override
    public int getCount() {
        return strings.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return strings[position];
    }
}

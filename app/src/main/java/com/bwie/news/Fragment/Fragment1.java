package com.bwie.news.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwie.news.Adapter.FragmentAdapter;
import com.bwie.news.R;

/**
 *
 * Created by hujiqinag on 2017/07/18.
 */
public class Fragment1 extends Fragment {
    private String[] strings = new String[]{"推荐", "热点", "视频", "邯郸", "社会", "头条号", "娱乐", "问答", "图片", "科技"};
    private TabLayout tablayout;
    private ViewPager viewPager;
    private FragmentAdapter adapter;
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment1, null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
    }

    private void initView() {
        tablayout = (TabLayout) view.findViewById(R.id.tablayout);
        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        adapter = new FragmentAdapter(getActivity().getSupportFragmentManager(), strings);
        viewPager.setAdapter(adapter);
        tablayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tablayout.setupWithViewPager(viewPager);
    }
}

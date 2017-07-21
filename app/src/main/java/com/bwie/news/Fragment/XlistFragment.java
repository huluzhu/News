package com.bwie.news.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwie.news.R;

import me.maxwin.view.XListView;

/**
 * Created by hujiqinag on 2017/07/19.
 */
public class XlistFragment extends Fragment implements XListView.IXListViewListener {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.xlistview, null);
        return view;
    }

    @Override
    public void onRefresh() {

    }

    @Override
    public void onLoadMore() {

    }
}

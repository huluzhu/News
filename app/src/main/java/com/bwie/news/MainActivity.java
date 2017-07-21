package com.bwie.news;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bwie.news.Fragment.DengLuFragment;
import com.bwie.news.Fragment.Fragment1;
import com.bwie.news.Fragment.Fragment2;
import com.hjm.bottomtabbar.BottomTabBar;

public class MainActivity extends AppCompatActivity {
    private BottomTabBar bottomtb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomTB();
    }

    private void BottomTB() {
        bottomtb = (BottomTabBar) findViewById(R.id.bottombar);
        bottomtb.init(getSupportFragmentManager()).setImgSize(20, 20)
                .setFontSize(12)
                .setTabPadding(4, 6, 10)
                .setChangeColor(Color.RED, Color.BLACK)
                .addTabItem("首页", R.mipmap.home_tabbar_normal, Fragment1.class)
                .addTabItem("西瓜视频", R.mipmap.abc_ic_go, Fragment2.class)
                .addTabItem("街头条", R.mipmap.dynamic_tabbar_normal, Fragment2.class)
                .addTabItem("未登录", R.mipmap.profile_action_follow_icon, DengLuFragment.class)
                .isShowDivider(false);

    }
}

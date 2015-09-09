package com.lypeer.mysince;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * 单个的fragmentActivity的父类，将一些可以复用的代码封装了起来
 * Created by lypeer on 2015/9/5.
 */
public abstract class SingleFragmentActivity extends FragmentActivity {

    /**
     * 继承这个类就必须实现这个方法，用来获得这个继承的activity所attach的fragment
     *
     * @return 目标fragment
     */
    protected abstract Fragment getTargetFragement();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = getTargetFragement();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }
}

package com.lypeer.mysince;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by lypeer on 9/5/2015.
 */
public class AddCardFragment extends Fragment {

    /**
     *   缓存根视图的对象
     */
    private View mRootView = null;

    /**
     * 输入时哪件事情的edittext
     */
    private EditText mEditThing;

    /**
     * 表示事情距今已经多久的textview
     */
    private TextView mTvDays;

    /**
     * 选择一个开始的时间的button
     */
    private Button mBtnSelectStartDay;

    /**
     * 确认保存这张卡片的button
     */
    private Button mBtnSave;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(mRootView == null){
            mRootView = inflater.inflate(R.layout.fragment_add_card , container , false);
        }
        init();
        return mRootView;
    }

    /**
     * 初始化控件的方法
     */
    private void init() {
        mEditThing = (EditText)mRootView.findViewById(R.id.edit_thing);
        mTvDays = (TextView)mRootView.findViewById(R.id.tv_days);
        mBtnSelectStartDay = (Button)mRootView.findViewById(R.id.btn_select_start_day);
        mBtnSave = (Button)mRootView.findViewById(R.id.btn_save);

        mBtnSelectStartDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}

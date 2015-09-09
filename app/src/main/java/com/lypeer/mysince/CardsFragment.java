package com.lypeer.mysince;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by lypeer on 9/5/2015.
 */
public class CardsFragment extends Fragment {

    /**
     * 表示从addcardactivity返回来的requestcode
     */
    private static final int REQUESTCODE_ADD_CARD = 0;

    /**
     * 表示从carddetailactivity返回来的requestcode
     */
    private static final int REQUESTCODE_CARD_DETAIL = 1;

    /**
     * 缓存根视图的对象
     */
    private View mRootView = null;

    /**
     * 添加新的卡片的按钮
     */
    private Button mBtnAdd;

    /**
     * 打开账户系统的按钮
     */
    private Button mBtnAccount;

    /**
     * 盛装卡片的recyclerview
     */
    private RecyclerView mRvCards;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(mRootView == null){
            mRootView = inflater.inflate(R.layout.fragment_cards, container, false);
        }
        init();
        return mRootView;
    }

    /**
     * 初始化的方法
     */
    private void init() {
        mBtnAdd = (Button)mRootView.findViewById(R.id.btn_add);
        mRvCards = (RecyclerView)mRootView.findViewById(R.id.rv_cards);

        mBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity() , AddCardActivity.class);
                startActivityForResult(intent , REQUESTCODE_ADD_CARD);
            }
        });
    }
}

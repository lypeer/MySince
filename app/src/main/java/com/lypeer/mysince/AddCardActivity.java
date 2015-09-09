package com.lypeer.mysince;

import android.app.Fragment;

/**
 * Created by lypeer on 9/5/2015.
 */
public class AddCardActivity extends SingleFragmentActivity {
    @Override
    protected Fragment getTargetFragement() {
        return new AddCardFragment();
    }
}

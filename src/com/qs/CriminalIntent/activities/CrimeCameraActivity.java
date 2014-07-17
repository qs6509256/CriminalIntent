package com.qs.CriminalIntent.activities;

import android.support.v4.app.Fragment;
import com.qs.CriminalIntent.fragments.CrimeCameraFragment;

/**
 * Description
 * Date : 2014/7/17
 * Time : 23:29
 * Author ： QS
 */
public class CrimeCameraActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeCameraFragment();
    }
}

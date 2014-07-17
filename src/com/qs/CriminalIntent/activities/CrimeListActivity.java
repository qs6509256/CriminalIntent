package com.qs.CriminalIntent.activities;

import android.support.v4.app.Fragment;
import com.qs.CriminalIntent.fragments.CrimeListFragment;

/**
 * Description
 * Date : 14-7-7
 * Time : 23:15
 * Author ： QS
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

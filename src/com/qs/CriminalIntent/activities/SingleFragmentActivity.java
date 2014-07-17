package com.qs.CriminalIntent.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.qs.CriminalIntent.R;
import com.qs.CriminalIntent.fragments.CrimeFragment;

public abstract class SingleFragmentActivity extends FragmentActivity {

    protected abstract Fragment createFragment();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getSupportFragmentManager();
        //  如不考虑兼容性问题，可直接继承Activity并调用getFragmentManager()
        //  android.app.FragmentManager fragmentManager = getFragmentManager();

        //获取一个fragment交给FragmentManager管理
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
        if (fragment == null) {
            fragment = createFragment();
            fm.beginTransaction()
                    .add(R.id.fragmentContainer, fragment)
                    .commit();
        }
    }
}

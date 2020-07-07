package com.android.ct7liang.window.statusBar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.android.ct7liang.window.R;
import com.android.ct7liang.window.statusBar.fragment.FragmentA;
import com.android.ct7liang.window.statusBar.fragment.FragmentB;
import com.android.ct7liang.window.statusBar.fragment.FragmentC;
import com.android.ct7liang.window.statusBar.fragment.FragmentD;
import com.ct7liang.translatestatusbar.TranslateStatusBar;

public class Test2Activity extends AppCompatActivity {

    private Fragment[] frgs = { null, null, null, null };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_test2);

        TranslateStatusBar.work(this);

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        private MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            if(frgs[i] == null){
                switch (i){
                    case 0:
                        frgs[i] = new FragmentA();
                        break;
                    case 1:
                        frgs[i] = new FragmentB();
                        break;
                    case 2:
                        frgs[i] = new FragmentC();
                        break;
                    case 3:
                        frgs[i] = new FragmentD();
                        break;
                }
            }
            return frgs[i];
        }

        @Override
        public int getCount() {
            return frgs.length;
        }
    }
}

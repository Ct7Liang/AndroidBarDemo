package com.android.ct7liang.window.statusBar;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;

import com.android.ct7liang.window.R;
import com.ct7liang.translatestatusbar.TranslateStatusBar;

public class Test1Activity extends AppCompatActivity {

    private int [] imgs = { R.mipmap.vp_1, R.mipmap.vp_2, R.mipmap.vp_3, R.mipmap.vp_4 };

    private ImageView [] ivs = {null, null, null, null};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_test1);

        TranslateStatusBar.work(this);

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new MyPagerAdapter());
    }

    /**
     * 轮播图适配器
     */
    private class MyPagerAdapter extends PagerAdapter{

        @Override
        public int getCount() {
            return imgs.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
            return view == o;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            if(ivs[position] == null){
                ivs[position] = new ImageView(Test1Activity.this);
                ivs[position].setScaleType(ImageView.ScaleType.CENTER_CROP);
                ivs[position].setImageResource(imgs[position]);
            }
            container.addView(ivs[position]);
            return ivs[position];
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((View) object);
        }
    }
}

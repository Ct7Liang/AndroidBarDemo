package com.android.ct7liang.window.statusBar.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.android.ct7liang.window.R;
import com.android.ct7liang.window.statusBar.Test1Activity;
import com.ct7liang.translatestatusbar.TranslateStatusBar;

public class FragmentB extends Fragment {

    private int [] imgs = { R.mipmap.vp_1, R.mipmap.vp_2, R.mipmap.vp_3, R.mipmap.vp_4 };

    private ImageView [] ivs = {null, null, null, null};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      return View.inflate(getActivity(), R.layout.fragment_b, null);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ViewPager viewPager = view.findViewById(R.id.view_pager);
        viewPager.setAdapter(new MyPagerAdapter());
    }

    /**
     * 轮播图适配器
     */
    private class MyPagerAdapter extends PagerAdapter {

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
                ivs[position] = new ImageView(getActivity());
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

package com.android.ct7liang.neatmusic.songList;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.ct7liang.tangyuan.utils.LogUtils;

public class TranslateLayout extends RelativeLayout {

    private int[] mInsets = new int[4];

    public TranslateLayout(Context context) {
        super(context);
    }

    public TranslateLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TranslateLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public final int[] getInsets() {
        return mInsets;
    }

    @Override
    protected boolean fitSystemWindows(Rect insets) {

        LogUtils.write("fitSystemWindow");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            // Intentionally do not modify the bottom inset. For some reason,
            // if the bottom inset is modified, window resizing stops working.
            // TODO: Figure out why.

            mInsets[0] = insets.left;
            mInsets[1] = insets.top;
            mInsets[2] = insets.right;

            insets.left = 0;
            insets.top = 0;
            insets.right = 0;
        }

        return super.fitSystemWindows(insets);
    }
}

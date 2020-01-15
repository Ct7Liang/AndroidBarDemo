package com.android.ct7liang.neatmusic.songList;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.android.ct7liang.neatmusic.R;
import com.android.ct7liang.neatmusic.base.BaseActivity;
import com.ct7liang.tangyuan.utils.ScreenUtil;

public class DetailActivity extends BaseActivity {

//    https://www.jianshu.com/p/d32c6a0a4310

    @Override
    public int setLayout() {
        return R.layout.activity_detail;
    }

    @Override
    public void initSurface() {

//        SoftHideKeyBoardUtil.assistActivity(this);

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
            return;
        }
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            int option = window.getDecorView().getSystemUiVisibility() | View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN;
            window.getDecorView().setSystemUiVisibility(option);
            window.setStatusBarColor(Color.TRANSPARENT);
        } else {
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }

//        setStatusBarLightMode(this, false);

        findViewById(R.id.top_bar).setPadding(0, ScreenUtil.getUtils().getStatusHeight(this), 0, 0);

    }

    @Override
    public void onClick(View view) {

    }

//    public static void setStatusBarLightMode(Activity activity, boolean isLightMode) {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            Window window = activity.getWindow();
//            int option = window.getDecorView().getSystemUiVisibility();
//            if (isLightMode) {
//                option |= View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
//            } else {
//                option &= ~View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
//            }
//            window.getDecorView().setSystemUiVisibility(option);
//        }
//    }

}

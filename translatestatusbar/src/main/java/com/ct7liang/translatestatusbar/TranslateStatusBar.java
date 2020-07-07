package com.ct7liang.translatestatusbar;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class TranslateStatusBar {

    private static int statusBarHeight = 0;

    /**
     * 设置透明状态栏
     * @param activity Context
     */
    public static void work(Activity activity){

        if(Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT){
            //Android4.4 9 以下不做处理
            Log.i("TranslateStatusBar", "不支持Android4.4以下系统");
        }else if(Build.VERSION.SDK_INT == Build.VERSION_CODES.KITKAT){
            //Android4.4 API19
            Window window = activity.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS | WindowManager.LayoutParams.FLAG_FULLSCREEN | WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
        }else if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            //Android5.0 API21
            Window window = activity.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN | WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
        }

    }

    /**
     * 设置透明状态栏
     * @param activity Context
     * @param topViews Views padding-top属性有效的的view
     */
    public static void work(Activity activity, View... topViews){

        if(statusBarHeight == 0){
            statusBarHeight = getStatusBarHeight(activity);
        }

        if(Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT){
            //Android4.4 9 以下不做处理
            Log.i("TranslateStatusbar", "不支持Android4.4以下系统");
        }else if(Build.VERSION.SDK_INT == Build.VERSION_CODES.KITKAT){
            //Android4.4 API19
            Window window = activity.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS | WindowManager.LayoutParams.FLAG_FULLSCREEN | WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
            setTopPadding(topViews);
        }else if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            //Android5.0 API21
            Window window = activity.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN | WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
            setTopPadding(topViews);
        }

    }

    /**
     * 取消透明状态栏
     * @param activity Context
     */
    public static void cancel(Activity activity){
        Window window = activity.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        window.clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
    }

    /**
     * 获取状态栏高度
     * @param context Context
     */
    private static int getStatusBarHeight(Context context) {
        Resources resources = context.getResources();
        int resourceId = resources.getIdentifier("status_bar_height", "dimen", "android");
        int height = resources.getDimensionPixelSize(resourceId);
        return height;
    }

    /**
     * 设置padding-top的值
     */
    private static void setTopPadding(View... views){
        for (View view: views) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + statusBarHeight, view.getPaddingRight(), view.getPaddingBottom());
        }
    }
}

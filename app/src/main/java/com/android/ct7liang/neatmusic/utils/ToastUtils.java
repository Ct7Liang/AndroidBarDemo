package com.android.ct7liang.neatmusic.utils;


import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

public class ToastUtils {

    public static void init(Context ctx){
        context = ctx;
    }

    private static Context context;

    private static Toast toast;

    public static void show(String text){
        if (toast == null){
            toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
        }
        toast.setText(text);
        toast.show();
    }
}

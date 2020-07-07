package com.android.ct7liang.window.child;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;

import com.android.ct7liang.window.R;

public class Main15Activity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    private Window window;
    private Dialog ad1;
    private Window ad1Window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        getSupportActionBar().setTitle("FLAG_SPLIT_TOUCH");

        window = getWindow();



        window.getDecorView().setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    Log.i("ct7liang123", "window: down");
                }
                return false;
            }
        });

        ((CheckBox)findViewById(R.id.isUse)).setOnCheckedChangeListener(this);

        findViewById(R.id.btn).setOnClickListener(this);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, 500);
        View view1 = View.inflate(this, R.layout.window_dialog_15, null);
        ad1 = new Dialog(this);
        ad1.addContentView(view1, layoutParams);
        ad1Window = ad1.getWindow();
//        ad1Window.addFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL);

        ad1Window.getDecorView().setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    Log.i("ct7liang123", "dialogWindow: down");
                }
                return false;
            }
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId()){
            case R.id.isUse:
                if(b){
                    window.addFlags(WindowManager.LayoutParams.FLAG_SPLIT_TOUCH);
                    ad1Window.addFlags(WindowManager.LayoutParams.FLAG_SPLIT_TOUCH);
                }else {
                    window.clearFlags(WindowManager.LayoutParams.FLAG_SPLIT_TOUCH);
                    ad1Window.clearFlags(WindowManager.LayoutParams.FLAG_SPLIT_TOUCH);
                }
                break;
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn:
                ad1.show();
                break;
        }
    }

}

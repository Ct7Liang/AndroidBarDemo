package com.android.ct7liang.neatmusic.child;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;

import com.android.ct7liang.neatmusic.R;

public class Main3Activity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    private Window window;
    private Dialog ad1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        getSupportActionBar().setTitle("FLAG_ALT_FOCUSABLE_IM");

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, 800);
        View view = View.inflate(this, R.layout.window_dialog_3, null);
        view.findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ad1.dismiss();
            }
        });
        ad1 = new Dialog(this);
        ad1.addContentView(view, layoutParams);
        window = ad1.getWindow();


        ((CheckBox)findViewById(R.id.isUse)).setOnCheckedChangeListener(this);
        ((CheckBox)findViewById(R.id.isSet)).setOnCheckedChangeListener(this);
        findViewById(R.id.btn1).setOnClickListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId()){
            case R.id.isUse:
                if(b){
                    window.addFlags(WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM);
                }else{
                    window.clearFlags(WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM);
                }
                break;
            case R.id.isSet:
                if(b){
                    window.addFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE);
                }else{
                    window.clearFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE);
                }
                break;
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                ad1.show();
                break;
        }
    }
}

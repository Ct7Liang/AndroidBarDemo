package com.android.ct7liang.window.child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.android.ct7liang.window.R;

public class Main10Activity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    private Window window;
    private int width;
    private int height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        getSupportActionBar().setTitle("FLAG_LAYOUT_NO_LIMITS");

        window = getWindow();
        width = window.getAttributes().width;
        height = window.getAttributes().height;

        findViewById(R.id.resume).setOnClickListener(this);
        findViewById(R.id.set1).setOnClickListener(this);
        findViewById(R.id.set2).setOnClickListener(this);

        ((CheckBox)findViewById(R.id.isUse)).setOnCheckedChangeListener(this);
    }

    @Override
    public void onClick(View view) {
        WindowManager.LayoutParams attributes;
        switch (view.getId()){
            case R.id.resume:
                attributes = window.getAttributes();
                attributes.width = width;
                attributes.height = height;
                window.setAttributes(attributes);
                break;
            case R.id.set1:
                attributes = window.getAttributes();
                attributes.width = 600;
                attributes.height = 1200;
                window.setAttributes(attributes);
                break;
            case R.id.set2:
                attributes = window.getAttributes();
                attributes.width = 1480;
                attributes.height = 1920;
                window.setAttributes(attributes);
                break;
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId()){
            case R.id.isUse: //是否启用该属性
                if(b){
                    window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
                }else{
                    window.clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
                }
                break;
        }
    }
}

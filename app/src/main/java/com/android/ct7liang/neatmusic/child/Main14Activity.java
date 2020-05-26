package com.android.ct7liang.neatmusic.child;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;

import com.android.ct7liang.neatmusic.MainActivity;
import com.android.ct7liang.neatmusic.R;

public class Main14Activity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        getSupportActionBar().setTitle("FLAG_SECURE");

        window = getWindow();

        ((CheckBox)findViewById(R.id.isUse)).setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId()){
            case R.id.isUse: //是否启用该属性
                if(b){
                    window.addFlags(WindowManager.LayoutParams.FLAG_SECURE);
                }else{
                    window.clearFlags(WindowManager.LayoutParams.FLAG_SECURE);
                }
                break;
        }
    }
}

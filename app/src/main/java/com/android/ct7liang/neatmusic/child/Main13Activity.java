package com.android.ct7liang.neatmusic.child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.android.ct7liang.neatmusic.R;

public class Main13Activity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        getSupportActionBar().setTitle("FLAG_FORCE_NOT_FULLSCREEN");

        window = getWindow();

        ((CheckBox)findViewById(R.id.isSet)).setOnCheckedChangeListener(this);
        ((CheckBox)findViewById(R.id.isUse)).setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId()){
            case R.id.isSet: //是否启用该属性
                if(b){
                    window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
                }else{
                    window.clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
                }
                break;
            case R.id.isUse: //是否启用该属性
                if(b){
                    window.addFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
                }else{
                    window.clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
                }
                break;
        }
    }

}

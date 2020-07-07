package com.android.ct7liang.window.child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.android.ct7liang.window.R;

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

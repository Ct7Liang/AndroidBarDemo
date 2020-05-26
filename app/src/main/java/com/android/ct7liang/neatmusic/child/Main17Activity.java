package com.android.ct7liang.neatmusic.child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.android.ct7liang.neatmusic.R;

public class Main17Activity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        getSupportActionBar().setTitle("FLAG_LAYOUT_INSET_DECOR");

        window = getWindow();

        ((CheckBox)findViewById(R.id.cb1)).setOnCheckedChangeListener(this);
        ((CheckBox)findViewById(R.id.cb2)).setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId()){
            case R.id.cb1:
                if(b){
                    window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);
                }else{
                    window.clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);
                }
                break;
            case R.id.cb2:
                if(b){
                    window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_INSET_DECOR);
                }else{
                    window.clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_INSET_DECOR);
                }
                break;
        }
    }
}

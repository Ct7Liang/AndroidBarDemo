package com.android.ct7liang.neatmusic.child;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import com.android.ct7liang.neatmusic.R;

public class Main11Activity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        getSupportActionBar().setTitle("FLAG_FULLSCREEN");

        window = getWindow();

        ((CheckBox)findViewById(R.id.isUse)).setOnCheckedChangeListener(this);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main11Activity.this, Main12Activity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId()){
            case R.id.isUse: //是否启用该属性
                if(b){
                    window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
                }else{
                    window.clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
                }
                break;
        }
    }
}
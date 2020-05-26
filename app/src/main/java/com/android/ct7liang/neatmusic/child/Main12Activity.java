package com.android.ct7liang.neatmusic.child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.android.ct7liang.neatmusic.R;

public class Main12Activity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private View decorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main12);

        final RadioGroup rg = findViewById(R.id.rg);

        decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            @Override
            public void onSystemUiVisibilityChange(int i) {
                if(i == 0){
                    rg.check(R.id.b1);
                }
            }
        });

        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("ct7liang123", decorView.getSystemUiVisibility() + "");
            }
        });

        ((RadioButton)findViewById(R.id.b1)).setOnCheckedChangeListener(this);
        ((RadioButton)findViewById(R.id.b2)).setOnCheckedChangeListener(this);
        ((RadioButton)findViewById(R.id.b3)).setOnCheckedChangeListener(this);
        ((RadioButton)findViewById(R.id.b4)).setOnCheckedChangeListener(this);
        ((RadioButton)findViewById(R.id.b5_1)).setOnCheckedChangeListener(this);
        ((RadioButton)findViewById(R.id.b5_2)).setOnCheckedChangeListener(this);
        ((RadioButton)findViewById(R.id.b5_3)).setOnCheckedChangeListener(this);
        ((RadioButton)findViewById(R.id.b6)).setOnCheckedChangeListener(this);
        ((RadioButton)findViewById(R.id.b7)).setOnCheckedChangeListener(this);
        ((RadioButton)findViewById(R.id.b8_1)).setOnCheckedChangeListener(this);
        ((RadioButton)findViewById(R.id.b8_2)).setOnCheckedChangeListener(this);
        ((RadioButton)findViewById(R.id.b8_3)).setOnCheckedChangeListener(this);
        ((RadioButton)findViewById(R.id.b9)).setOnCheckedChangeListener(this);
        ((RadioButton)findViewById(R.id.b10)).setOnCheckedChangeListener(this);
        ((RadioButton)findViewById(R.id.b11)).setOnCheckedChangeListener(this);
        ((RadioButton)findViewById(R.id.b12)).setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(!b){
            return;
        }
        switch (compoundButton.getId()){
            case R.id.b1:
                decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);
                break;
            case R.id.b2:
                decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
                break;
            case R.id.b3:
                decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
                break;
            case R.id.b4:
                decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE);
                break;
            case R.id.b5_1:
                decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_FULLSCREEN);
                break;
            case R.id.b5_2:
                decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
                break;
            case R.id.b5_3:
                decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN);
                break;
            case R.id.b6:
                decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
                break;
            case R.id.b7:
                decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
                break;
            case R.id.b8_1:
                decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_FULLSCREEN);
                break;
            case R.id.b8_2:
                decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
                break;
            case R.id.b8_3:
                decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
                break;
            case R.id.b9:
                decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
                break;
            case R.id.b10:
                decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR);
                break;
            case R.id.b11:
                decorView.setSystemUiVisibility(View.SYSTEM_UI_LAYOUT_FLAGS);
                break;
            case R.id.b12:
                decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE);
                break;
        }
    }

}
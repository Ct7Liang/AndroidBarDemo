package com.android.ct7liang.window.statusBar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

import com.android.ct7liang.window.R;
import com.ct7liang.translatestatusbar.TranslateStatusBar;

public class TranslateBarTestActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_translate_bar_test);

        TranslateStatusBar.work(this, findViewById(R.id.top_view));

        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                startActivity(new Intent(this, Test1Activity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(this, Test2Activity.class));
                break;
            case R.id.btn3:
                startActivity(new Intent(this, Test3Activity.class));
                break;
            case R.id.btn4:
                startActivity(new Intent(this, Test4Activity.class));
                break;
        }
    }




}

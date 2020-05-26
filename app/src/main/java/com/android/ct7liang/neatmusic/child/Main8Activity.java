package com.android.ct7liang.neatmusic.child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.android.ct7liang.neatmusic.R;

public class Main8Activity extends AppCompatActivity implements View.OnClickListener {

    private Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        getSupportActionBar().setTitle("FLAG_KEEP_SCREEN_ON");

        window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        findViewById(R.id.btn_clear).setOnClickListener(this);
        findViewById(R.id.btn_add).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_clear:
                window.clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
                Toast.makeText(this, "属性已清除", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_add:
                window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
                Toast.makeText(this, "属性已添加", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
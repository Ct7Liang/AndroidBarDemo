package com.android.ct7liang.neatmusic.child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.android.ct7liang.neatmusic.R;

public class Main16Activity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);

        getSupportActionBar().setTitle("FLAG_IGNORE_CHEEK_PRESSES");

        window = getWindow();

        ((CheckBox)findViewById(R.id.isUse)).setOnCheckedChangeListener(this);
//        findViewById(R.id.btn).setOnClickListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId()){
            case R.id.isUse: //是否启用该属性
                if(b){
                    window.addFlags(WindowManager.LayoutParams.FLAG_IGNORE_CHEEK_PRESSES);
                }else{
                    window.clearFlags(WindowManager.LayoutParams.FLAG_IGNORE_CHEEK_PRESSES);
                }
                break;
        }
    }

//    @Override
//    public void onClick(View view) {
//        switch (view.getId()){
//            case R.id.btn:
//                Toast.makeText(this, "点击了按钮", Toast.LENGTH_SHORT).show();
//                break;
//        }
//    }




    @Override
    public boolean onTouchEvent(MotionEvent event) {
//        MotionEvent.ACTION_CANCEL == 3
//        MotionEvent.ACTION_DOWN == 0
//        MotionEvent.ACTION_MOVE == 2
//        MotionEvent.ACTION_UP == 1
        Log.i("ct7liang123", "action: " + event.getAction());
        return super.onTouchEvent(event);
    }
}

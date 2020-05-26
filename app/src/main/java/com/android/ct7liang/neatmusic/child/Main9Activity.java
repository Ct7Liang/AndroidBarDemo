package com.android.ct7liang.neatmusic.child;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.android.ct7liang.neatmusic.R;
import com.android.ct7liang.neatmusic.utils.ToastUtils;

public class Main9Activity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {


    private Dialog ad1;
    private Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        getSupportActionBar().setTitle("FLAG_WATCH_OUTSIDE_TOUCH");

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, 800);
        View view = View.inflate(this, R.layout.window_dialog_9, null);
        view.findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ad1.dismiss();
            }
        });
        ad1 = new Dialog(this);
        ad1.addContentView(view, layoutParams);

        window = ad1.getWindow();
        window.getDecorView().setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.i("ct7liang123", "action: " + motionEvent.getAction());
                switch (motionEvent.getAction()){
                    case 0:
                        Toast.makeText(Main9Activity.this, "ACTION_DOWN", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(Main9Activity.this, "ACTION_UP", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(Main9Activity.this, "ACTION_OUTSIDE", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });

        ((CheckBox)findViewById(R.id.isSet)).setOnCheckedChangeListener(this);
        ((CheckBox)findViewById(R.id.isUse)).setOnCheckedChangeListener(this);
        findViewById(R.id.btn).setOnClickListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId()){
            case R.id.isSet: //是否启用该属性
                if(b){
                    window.addFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL);
                }else{
                    window.clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL);
                }
                break;
            case R.id.isUse: //是否启用该属性
                if(b){
                    window.addFlags(WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH);
                }else{
                    window.clearFlags(WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH);
                }
                break;
        }
    }

    @Override
    public void onClick(View view) {
        ad1.show();
    }

}

package com.android.ct7liang.neatmusic.child;

import android.app.Dialog;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.ct7liang.neatmusic.R;


public class Main4Activity extends AppCompatActivity {

    private Dialog ad1;
    private Dialog ad2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        getSupportActionBar().setTitle("FLAG_NOT_FOCUSABLE");

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, 500);

        View view1 = View.inflate(this, R.layout.window_dialog_4, null);
        ((TextView)view1.findViewById(R.id.tv)).setText("默认弹窗");
        view1.findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ad1.dismiss();
            }
        });
        ad1 = new Dialog(this);
        ad1.addContentView(view1, layoutParams);

        View view2 = View.inflate(this, R.layout.window_dialog_4, null);
        ((TextView)view2.findViewById(R.id.tv)).setText("测试弹窗");
        view2.findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ad2.dismiss();
            }
        });
        ad2 = new Dialog(this);
        ad2.getWindow().addFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE);
        ad2.addContentView(view2, layoutParams);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.tv1:
                //跳转进入FLAG_NOT_TOUCH_MODAL
                break;
            case R.id.tv2:
                //跳转进入FLAG_ALT_FOCUSABLE_IM
                break;
            case R.id.btn1:
                Toast.makeText(this, "点击了测试按钮", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                if (ad1.isShowing()){
                    ad1.dismiss();
                }else {
                    ad1.show();
                }
                break;
            case R.id.btn3:
                if (ad2.isShowing()){
                    ad2.dismiss();
                }else {
                    ad2.show();
                }
                break;
            case R.id.btn4:
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        SystemClock.sleep(3000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                ad1.show();
                            }
                        });
                    }
                }).start();
                break;
            case R.id.btn5:
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        SystemClock.sleep(3000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                ad2.show();
                            }
                        });
                    }
                }).start();
                break;
        }
    }
}

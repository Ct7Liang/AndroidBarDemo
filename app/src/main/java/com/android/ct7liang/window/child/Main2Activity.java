package com.android.ct7liang.window.child;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import com.android.ct7liang.window.R;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private Dialog ad1;
    private Dialog ad2;
    private Dialog ad3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setTitle("FLAG_DIM_BEHIND");

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, 500);

        View view1 = View.inflate(Main2Activity.this, R.layout.window_dialog_2, null);
        ad1 = new Dialog(this);
        ad1.addContentView(view1, layoutParams);

        View view2 = View.inflate(Main2Activity.this, R.layout.window_dialog_2, null);
        ad2 = new Dialog(this);
        ad2.addContentView(view2, layoutParams);

        View view3 = View.inflate(Main2Activity.this, R.layout.window_dialog_2, null);
        ad3 = new Dialog(this);
        ad3.addContentView(view3, layoutParams);

        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                if (ad1.isShowing()){
                    ad1.dismiss();
                }else{
                    ad1.show();
                }
                break;
            case R.id.btn2:
                if (ad2.isShowing()){
                    ad2.dismiss();
                }else{
                    //修改当前window后面的window的透明度 方法1
                    ad2.getWindow().setDimAmount(0.3f);

//                  //修改当前window后面的window的透明度 方法2
//                  WindowManager.LayoutParams attributes = ad2.getWindow().getAttributes();
//                  attributes.dimAmount = 0.3f;
//                  ad2.getWindow().setAttributes(attributes);

                    ad2.show();
                }
                break;
            case R.id.btn3:
                if (ad3.isShowing()){
                    ad3.dismiss();
                }else{
                    ad3.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
                    ad3.show();
                }
                break;
        }
    }
}

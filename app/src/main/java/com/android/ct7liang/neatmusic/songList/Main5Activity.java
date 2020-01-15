package com.android.ct7liang.neatmusic.songList;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

import com.android.ct7liang.neatmusic.R;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog ad = new Dialog(Main5Activity.this);

                View view = View.inflate(Main5Activity.this, R.layout.window_dialog, null);

                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

                ad.addContentView(view, layoutParams);

                ad.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
                ad.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);


                ad.getWindow().setDimAmount(0.3f);

                WindowManager.LayoutParams attributes = ad.getWindow().getAttributes();
                attributes.dimAmount = 0.3f;
                ad.getWindow().setAttributes(attributes);


                ad.show();

            }
        });

        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupWindow popupWindow = new PopupWindow(Main5Activity.this);

                View view = View.inflate(Main5Activity.this, R.layout.window_dialog, null);

                popupWindow.setContentView(view);

                popupWindow.setOutsideTouchable(true);

                popupWindow.setBackgroundDrawable(null);

                popupWindow.showAsDropDown(view, 0, -150);

            }
        });

        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Main5Activity.this, Main6Activity.class));

            }
        });
    }
}

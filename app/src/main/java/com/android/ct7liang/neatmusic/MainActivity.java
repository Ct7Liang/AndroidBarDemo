package com.android.ct7liang.neatmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.android.ct7liang.neatmusic.child.Main2Activity;
import com.android.ct7liang.neatmusic.child.Main4Activity;
import com.android.ct7liang.neatmusic.child.Main5Activity;
import com.android.ct7liang.neatmusic.child.Main6Activity;

public class MainActivity extends AppCompatActivity {

    public static final int UNCLEAR = 1;
    public static final int DISCARD = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn1:
                showToast(UNCLEAR);
                break;
            case R.id.btn2:
                startActivity(new Intent(this, Main2Activity.class));
                break;
            case R.id.btn3:
                showToast(DISCARD);
                break;
            case R.id.btn4:
                startActivity(new Intent(this, Main4Activity.class));
                break;
            case R.id.btn5:
                startActivity(new Intent(this, Main5Activity.class));
                break;
            case R.id.btn6:
                startActivity(new Intent(this, Main6Activity.class));
                break;
            case R.id.btn7:
                showToast(DISCARD);
                break;
            case R.id.btn8:
                showToast(0);
                break;
            case R.id.btn9:
                showToast(0);
                break;
            case R.id.btn10:
                showToast(0);
                break;
            case R.id.btn11:
                showToast(0);
                break;
            case R.id.btn12:
                showToast(0);
                break;
            case R.id.btn13:
                showToast(0);
                break;
            case R.id.btn14:
                showToast(0);
                break;
            case R.id.btn15:
                showToast(0);
                break;
            case R.id.btn16:
                showToast(0);
                break;
            case R.id.btn17:
                showToast(0);
                break;
            case R.id.btn18:
                showToast(0);
                break;
            case R.id.btn19:
                showToast(0);
                break;
            case R.id.btn20:
                showToast(0);
                break;
            case R.id.btn21:
                showToast(0);
                break;
            case R.id.btn22:
                showToast(0);
                break;
            case R.id.btn23:
                showToast(0);
                break;
            case R.id.btn24:
                showToast(0);
                break;
            case R.id.btn25:
                showToast(0);
                break;
            case R.id.btn26:
                showToast(0);
                break;
            case R.id.btn27:
                showToast(0);
                break;
            case R.id.btn28:
                showToast(0);
                break;
            case R.id.btn29:
                showToast(0);
                break;
            case R.id.btn30:
                showToast(0);
                break;
            case R.id.btn31:
                showToast(0);
                break;
            case R.id.btn32:
                showToast(0);
                break;
            case R.id.btn33:
                showToast(0);
                break;
        }
    }

    private void showToast(int type){
        switch (type){
            case 0:
                Toast.makeText(this, "学习中", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(this, "我也没搞懂", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "该属性已废弃", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

package com.android.ct7liang.window;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.android.ct7liang.window.child.Main10Activity;
import com.android.ct7liang.window.child.Main11Activity;
import com.android.ct7liang.window.child.Main13Activity;
import com.android.ct7liang.window.child.Main14Activity;
import com.android.ct7liang.window.child.Main17Activity;
import com.android.ct7liang.window.child.Main18Activity;
import com.android.ct7liang.window.child.Main2Activity;
import com.android.ct7liang.window.child.Main3Activity;
import com.android.ct7liang.window.child.Main4Activity;
import com.android.ct7liang.window.child.Main5Activity;
import com.android.ct7liang.window.child.Main6Activity;
import com.android.ct7liang.window.child.Main7Activity;
import com.android.ct7liang.window.child.Main8Activity;
import com.android.ct7liang.window.child.Main9Activity;

public class MainActivity extends AppCompatActivity {

    public static final int UNCLEAR = 1;
    public static final int DISCARD = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
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
                startActivity(new Intent(this, Main8Activity.class));
                break;
            case R.id.btn9:
                startActivity(new Intent(this, Main17Activity.class));
                break;
            case R.id.btn10:
                startActivity(new Intent(this, Main10Activity.class));
                break;
            case R.id.btn11:
                startActivity(new Intent(this, Main11Activity.class));
                break;
            case R.id.btn12:
                startActivity(new Intent(this, Main13Activity.class));
                break;
            case R.id.btn13:
                showToast(DISCARD);
                break;
            case R.id.btn14:
                startActivity(new Intent(this, Main14Activity.class));
                break;
            case R.id.btn15:
                showToast(0);
                break;
            case R.id.btn16:
                showToast(UNCLEAR);
                break;
            case R.id.btn17:
                startActivity(new Intent(this, Main17Activity.class));
                break;
            case R.id.btn18:
                startActivity(new Intent(this, Main9Activity.class));
                break;
            case R.id.btn19:
                startActivity(new Intent(this, Main3Activity.class));
                break;
            case R.id.btn20:
                startActivity(new Intent(this, Main7Activity.class));
                break;
            case R.id.btn21:
                showToast(0);
                break;
            case R.id.btn22:
                showToast(UNCLEAR);
                break;
            case R.id.btn23:
                showToast(DISCARD);
                break;
            case R.id.btn24:
                showToast(DISCARD);
                break;
            case R.id.btn25:
                showToast(UNCLEAR);
//                startActivity(new Intent(this, Main15Activity.class));
                break;
            case R.id.btn26:
                showToast(0);
                break;
            case R.id.btn27:
                showToast(DISCARD);
                break;
            case R.id.btn28:
                startActivity(new Intent(this, Main18Activity.class));
                break;
            case R.id.btn29:
                startActivity(new Intent(this, Main18Activity.class));
                break;
            case R.id.btn30:
                showToast(UNCLEAR);
                break;
//            case R.id.btn31:
//                showToast(0);
//                break;
            case R.id.btn32:
                showToast(UNCLEAR);
                break;
        }
    }

    private void showToast(int type) {
        switch (type) {
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

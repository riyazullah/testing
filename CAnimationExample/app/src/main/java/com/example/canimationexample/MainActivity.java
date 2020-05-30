package com.example.canimationexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button btn1,btn2,btn3,btn4,btn5,btn6;
    ImageView iv;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        iv=(ImageView)findViewById(R.id.iv);
        tv1=(TextView)findViewById(R.id.tv1);

    }


    public void clockwise(View view){
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this,
                R.anim.clockwise);
        tv1.startAnimation(animation);
    }
    public void zoom(View view){
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.zoom);
        tv1.startAnimation(animation1);
    }

    public void fade(View view){

        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fade);
        tv1.startAnimation(animation1);
    }

    public void blink(View view){
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.blink);
        tv1.startAnimation(animation1);
    }

    public void move(View view){

        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        tv1.startAnimation(animation1);
    }

    public void slide(View view){
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
        tv1.startAnimation(animation1);
    }

}

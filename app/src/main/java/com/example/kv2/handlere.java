package com.example.kv2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.widget.TextView;

public class handlere extends AppCompatActivity {
    int j;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_handlere);
        tv=(TextView) findViewById(R.id.seco);
                        tv.setText("dfusbdfhweb");

//        j=5;


        new CountDownTimer(6000, 1000) {

            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onTick(long millisUntilFinished) {
                NumberFormat f=new DecimalFormat("00");
                long sec =(millisUntilFinished/1000)%60;


                tv.setText(f.format(sec));
//
//                j--;
            }

            @Override
            public void onFinish() {
                tv.setText("00");
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }
        }.start();




//        Handler h = new Handler();
//        h.postDelayed(new Runnable() {
//            @Override
//
//            public void run() {
//                Intent i = new Intent(getApplicationContext(),MainActivity.class);
//                startActivity(i);
//
//            } },5000);
    }
}
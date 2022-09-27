package com.example.kv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.widget.TextView;

public class handlere extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tv=findViewById(R.id.sec);
        setContentView(R.layout.activity_handlere);

//        new CountDownTimer(7000, 1000) {
//            @Override
//            public void onTick(long millisUntilFinished) {
//                int j=5;
//                tv.setText("kwdnkw");
//
//                j--;
//            }
//
//            @Override
//            public void onFinish() {
//
//            }
//        }.start();


        Handler h = new Handler();
        h.postDelayed(new Runnable() {
            @Override

            public void run() {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            } },5000);
    }
}
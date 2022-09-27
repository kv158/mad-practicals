package com.example.kv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class prlast1 extends AppCompatActivity {
    TextView tv;
    ImageView im1, im2, im3, im4, im5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prlast1);
        tv=findViewById(R.id.tvd);
        im1 = findViewById(R.id.c);
        im2 = findViewById(R.id.cpp);
        im3 = findViewById(R.id.java);
        im4 = findViewById(R.id.js);
        im5 = findViewById(R.id.py);

        im1.setVisibility(View.INVISIBLE);
        im2.setVisibility(View.INVISIBLE);
        im3.setVisibility(View.INVISIBLE);
        im4.setVisibility(View.INVISIBLE);
        im5.setVisibility(View.INVISIBLE);

//        Bundle b=getIntent().getExtras();
//        String ss =b.getString("TATA ");
//        "C", "C++", "JAVA","JavaScript", "Python"

        Intent i = getIntent();
        String ss = getIntent().getExtras().getString("TATA");
        tv.setText(ss);
        if(ss.equals("C"))
        {
            tv.setText("Language : C \nDevloper : Dennis Ritchie  \nRelese Date : 1972 \nExtension : .c,.h");
            im1.setVisibility(View.VISIBLE);
            im2.setVisibility(View.INVISIBLE);
            im3.setVisibility(View.INVISIBLE);
            im4.setVisibility(View.INVISIBLE);
            im5.setVisibility(View.INVISIBLE);
        }
        if(ss.equals("C++"))
        {
            tv.setText("Language : C++ \nDevloper : Bjarne Stroustrup  \nRelese Date : 1985 \nExtension : .cpp");
            im1.setVisibility(View.INVISIBLE);
            im2.setVisibility(View.VISIBLE);
            im3.setVisibility(View.INVISIBLE);
            im4.setVisibility(View.INVISIBLE);
            im5.setVisibility(View.INVISIBLE);
        }
        if(ss.equals("JAVA"))
        {
            tv.setText("Language : JAVA \nDevloper : James Gosling \nRelese Date : May 23,1995 \nExtension : .java");
            im1.setVisibility(View.INVISIBLE);
            im2.setVisibility(View.INVISIBLE);
            im3.setVisibility(View.VISIBLE);
            im4.setVisibility(View.INVISIBLE);
            im5.setVisibility(View.INVISIBLE);
        }
        if(ss.equals("JavaScript"))
        {
            tv.setText("Language : JavaScript \nDevloper : Brendan Eich \nRelese Date :December 4, 1995 \nExtension : .js");
            im1.setVisibility(View.INVISIBLE);
            im2.setVisibility(View.INVISIBLE);
            im3.setVisibility(View.INVISIBLE);
            im4.setVisibility(View.VISIBLE);
            im5.setVisibility(View.INVISIBLE);
        }
        if(ss.equals("Python"))
        {
            tv.setText("Language : Python \nDevloper : Guido van Rossum  \nRelese Date : February 20,1991 \nExtension : .py");
            im1.setVisibility(View.INVISIBLE);
            im2.setVisibility(View.INVISIBLE);
            im3.setVisibility(View.INVISIBLE);
            im4.setVisibility(View.INVISIBLE);
            im5.setVisibility(View.VISIBLE);
        }

    }
}
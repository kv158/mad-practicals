package com.example.kv2;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class Spinnerp extends AppCompatActivity {
    Spinner sp;
    ImageView im1, im2, im3, im4, im5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_spinner);
        sp = findViewById(R.id.spr);
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.kvlist, android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        sp.setAdapter(adapter);


        im1 = findViewById(R.id.k1);
        im2 = findViewById(R.id.k2);
        im3 = findViewById(R.id.k3);
        im4 = findViewById(R.id.k4);
        im5 = findViewById(R.id.k5);

        im1.setVisibility(View.INVISIBLE);
        im2.setVisibility(View.INVISIBLE);
        im3.setVisibility(View.INVISIBLE);
        im4.setVisibility(View.INVISIBLE);
        im5.setVisibility(View.INVISIBLE);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String nm=adapterView.getItemAtPosition(i).toString();
                if(nm.equals("wallpaper1")) {
                    im1.setVisibility(View.VISIBLE);
                    im2.setVisibility(View.INVISIBLE);
                    im3.setVisibility(View.INVISIBLE);
                    im4.setVisibility(View.INVISIBLE);
                    im5.setVisibility(View.INVISIBLE);
                }
                if(nm.equals("wallpaper2")) {
                    im1.setVisibility(View.INVISIBLE);
                    im2.setVisibility(View.VISIBLE);
                    im3.setVisibility(View.INVISIBLE);
                    im4.setVisibility(View.INVISIBLE);
                    im5.setVisibility(View.INVISIBLE);
                }
                if(nm.equals("wallpaper3")) {
                    im1.setVisibility(View.INVISIBLE);
                    im2.setVisibility(View.INVISIBLE);
                    im3.setVisibility(View.VISIBLE);
                    im4.setVisibility(View.INVISIBLE);
                    im5.setVisibility(View.INVISIBLE);
                }
                if(nm.equals("wallpaper4")) {
                    im1.setVisibility(View.INVISIBLE);
                    im2.setVisibility(View.INVISIBLE);
                    im3.setVisibility(View.INVISIBLE);
                    im4.setVisibility(View.VISIBLE);
                    im5.setVisibility(View.INVISIBLE);
                }
                if(nm.equals("wallpaper5")) {
                    im1.setVisibility(View.INVISIBLE);
                    im2.setVisibility(View.INVISIBLE);
                    im3.setVisibility(View.INVISIBLE);
                    im4.setVisibility(View.INVISIBLE);
                    im5.setVisibility(View.VISIBLE);
                }
                if(nm.equals("select")) {
                    im1.setVisibility(View.INVISIBLE);
                    im2.setVisibility(View.INVISIBLE);
                    im3.setVisibility(View.INVISIBLE);
                    im4.setVisibility(View.INVISIBLE);
                    im5.setVisibility(View.INVISIBLE);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
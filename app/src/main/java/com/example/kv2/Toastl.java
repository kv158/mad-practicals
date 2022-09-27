package com.example.kv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class Toastl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toastl);
        Toast.makeText(this, "short", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "long", Toast.LENGTH_LONG).show();

//        Toast.makeText(this, "long", 50).show();

        LayoutInflater li = getLayoutInflater();
        View layout = li.inflate(R.layout.customtoast,(ViewGroup) findViewById(R.id.custom_toast_layout));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 5, 0);
        toast.setView(layout);
        toast.show();
    }
}
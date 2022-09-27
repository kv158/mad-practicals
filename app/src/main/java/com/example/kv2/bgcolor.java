package com.example.kv2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import com.example.kv2.R.id;

public class bgcolor extends AppCompatActivity {
    RelativeLayout rl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bgcolor);
        rl=findViewById(R.id.back);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;

    }
    @SuppressLint("ResourceAsColor")
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case id.red:
                rl.setBackgroundColor(Color.RED);
                return true;
            case id.green:
                rl.setBackgroundColor(Color.GREEN);
                return true;
            case id.blue:
                rl.setBackgroundColor(Color.BLUE);
                return true;
            case id.black:
                rl.setBackgroundColor(Color.BLACK);
                return true;
            case id.wdemoe:
                rl.setBackgroundColor(Color.argb(21,35,62,54));
                return true;
            default:
                throw new IllegalStateException("Unexpected value: " + item.getItemId());
        }
    }
}

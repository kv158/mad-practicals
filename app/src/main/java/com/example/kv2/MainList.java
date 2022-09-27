package com.example.kv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);
        ListView lv;
        lv=findViewById(R.id.li);
        ArrayList list = new ArrayList();
        list.add("practical 1");
        list.add("practical 2");
        list.add("practical 3");
        list.add("practical 4");
        list.add("practical 5");
        list.add("practical 6");
        list.add("practical 7");
        list.add("practical 8");
        list.add("practical 9");
        list.add("practical 10");
        ArrayAdapter adp = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,list);
        lv.setAdapter(adp);
        lv.setClickable(true);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                Object o = lv.getItemAtPosition(position);

                if(o.equals("practical 1")) {
                    Intent in = new Intent(getApplicationContext(),HelloWorld.class);
                    startActivity(in);
                }
                if(o.equals("practical 2")) {
                    Intent in = new Intent(getApplicationContext(),prc2.class);
                    startActivity(in);
                }
                if(o.equals("practical 3")) {
                    Intent in = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(in);
                }
                if(o.equals("practical 4")) {
                    Intent in = new Intent(getApplicationContext(),OpenBrowser.class);
                    startActivity(in);
                }
                if(o.equals("practical 5")) {
                    Intent in = new Intent(getApplicationContext(),ListByNumber.class);
                    startActivity(in);
                }
                if(o.equals("practical 6")) {
                    Intent in = new Intent(getApplicationContext(),Spinnerp.class);
                    startActivity(in);
                }
                if(o.equals("practical 7")) {
                    Intent in = new Intent(getApplicationContext(),bgcolor.class);
                    startActivity(in);
                }
                if(o.equals("practical 8")) {
                    Intent in = new Intent(getApplicationContext(),Toastl.class);
                    startActivity(in);
                }
                if(o.equals("practical 9")) {
                    Intent in = new Intent(getApplicationContext(),handlere.class);
                    startActivity(in);
                }
                if(o.equals("practical 10")) {
                    Intent in = new Intent(getApplicationContext(),prclast.class);
                    startActivity(in);
                }
            }
        });

    }
}
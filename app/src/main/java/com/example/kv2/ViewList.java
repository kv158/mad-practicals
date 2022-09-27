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

public class ViewList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_list);

        ListView lv;
        lv=findViewById(R.id.list);
        ArrayList list = new ArrayList();
        Intent int1=this.getIntent();
        int val=Integer.parseInt(int1.getStringExtra("val"));

        for (int i=1;i<=val;i++) {
            list.add("hi"+i);
        }

        ArrayAdapter adp = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,list);
        lv.setAdapter(adp);
        String h= (String) list.get(3);

    }

}
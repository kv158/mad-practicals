package com.example.kv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ListByNumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_by_number);

        EditText ed;
        Button b;


        ed=findViewById(R.id.num);
        b=findViewById(R.id.ok);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ss = ed.getText().toString();

                Intent in = new Intent(getApplicationContext(),ViewList.class);

                if (Integer.parseInt(ss) <= 0) {
                    Toast.makeText(getApplicationContext(),"Place Enter Value Greater Than 1", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    in.putExtra("val",ss);
                    startActivity(in);
                }
            }
        });
    }
}
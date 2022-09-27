package com.example.kv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TextWatcher {
    EditText un,pw;

    String us,ps;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        un=findViewById(R.id.un);
        pw=findViewById(R.id.ps);

        b=findViewById(R.id.b);


        us=un.getText().toString();
        ps=pw.getText().toString();
        b.setEnabled(false);


        un.addTextChangedListener(this);
        pw.addTextChangedListener(this);

         b.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                     Intent in = new Intent(getApplicationContext(),MainActivity.class);
                     startActivity(in);
//                     b.setEnabled(true);
                     Toast.makeText(MainActivity.this, "welcome kv", Toast.LENGTH_SHORT).show();
             }
         });
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        if(un.getText().toString().equals("admin") && pw.getText().toString().equals("admin")) {
//            Intent in = new Intent(getApplicationContext(),MainActivity.class);
//            startActivity(in);
            b.setEnabled(true);
        }

    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
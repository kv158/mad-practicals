package com.example.kv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OpenBrowser extends AppCompatActivity implements TextWatcher {
    EditText un,pw;

    String us,ps;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_browser);

        un=findViewById(R.id.unb);
        pw=findViewById(R.id.psb);

        b=findViewById(R.id.bb);


        us=un.getText().toString();
        ps=pw.getText().toString();
        b.setEnabled(false);


        un.addTextChangedListener(this);
        pw.addTextChangedListener(this);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(in);
//                     b.setEnabled(true);
                Toast.makeText(getApplicationContext(), "welcome kv", Toast.LENGTH_SHORT).show();
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
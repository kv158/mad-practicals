package com.example.kv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class prclast extends AppCompatActivity {
    String[] lang = {"C", "C++", "JAVA","JavaScript", "Python"};
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prclast);
        lv = findViewById(R.id.carslist);
        ArrayAdapter<String> adptr = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, lang);
        lv.setAdapter(adptr);
        lv.setClickable(true);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (lang[i].equals("C")) {
                    Intent am = new Intent(getApplicationContext(), prlast1.class);
                    am.putExtra("TATA", "C");
                    startActivity(am);
                }


                if (lang[i].equals("C++")) {
                    Intent am = new Intent(getApplicationContext(), prlast1.class);
                    am.putExtra("TATA", "C++");
                    startActivity(am);
                }

                if (lang[i].equals("JAVA")) {
                    Intent am = new Intent(getApplicationContext(), prlast1.class);
                    am.putExtra("TATA", "JAVA");
                    startActivity(am);
                }

                if (lang[i].equals("JavaScript")) {
                    Intent am = new Intent(getApplicationContext(), prlast1.class);
                    am.putExtra("TATA", "JavaScript");
                    startActivity(am);
                }
                if (lang[i].equals("Python")) {
                    Intent am = new Intent(getApplicationContext(), prlast1.class);
                    am.putExtra("TATA", "Python");
                    startActivity(am);
                }



            }
        });
    }
}
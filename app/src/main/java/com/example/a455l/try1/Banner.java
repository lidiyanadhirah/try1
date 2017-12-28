package com.example.a455l.try1;

/**
 * Created by A455L on 21/12/2017.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Banner extends AppCompatActivity {

    Button pe;
    Button psa;
    Button trio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);

        pe = (Button) findViewById(R.id.expert);
        pe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Banner.this, PrintExpertDetails.class);
                startActivity(intent);

            }
        });

        psa = (Button) findViewById(R.id.psa);
        psa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Banner.this, PSADetails.class);
                startActivity(intent);

            }
        });

       trio = (Button) findViewById(R.id.trio);
       trio.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Banner.this, TrioPrintingDetails.class);
                startActivity(intent);

            }
        });
    }
}


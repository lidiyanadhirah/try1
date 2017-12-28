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

public class Bunting extends AppCompatActivity {
   Button psa;
    Button expert;
    Button trio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bunting);

        expert=(Button) findViewById(R.id.expert);
        expert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Bunting.this, PrintExpertDetails.class);
                startActivity(intent);
            }
        });

        psa=(Button) findViewById(R.id.psa);
        psa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Bunting.this, PSADetails.class);
                startActivity(intent);
            }
        });
        trio=(Button) findViewById(R.id.trio);
        trio.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Bunting.this, TrioPrintingDetails.class);
                startActivity(intent);
            }
        });

    }
}

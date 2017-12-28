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

public class PhotostatShop extends AppCompatActivity {

    Button psa, trio, expert, barokah, my;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photostat_shop);

        expert=(Button) findViewById(R.id.expert);
        expert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(PhotostatShop.this,  PrintExpertDetails.class);
                startActivity(intent);
            }
        });
        psa=(Button) findViewById(R.id.psa);
        psa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(PhotostatShop.this,  PSADetails.class);
                startActivity(intent);
            }
        });
        trio =(Button) findViewById(R.id.trio);
        trio.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(PhotostatShop.this, TrioPrintingDetails.class);
                startActivity(intent);
            }
        });


        barokah=(Button) findViewById(R.id.barokah);
        barokah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(PhotostatShop.this, BarokahDetails.class);
                startActivity(intent);
            }
        });


        my=(Button) findViewById(R.id.my);
       my.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(PhotostatShop.this, MYPrintDetails.class);
                startActivity(intent);
            }
        });
    }
}


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

public class Card extends AppCompatActivity {
Button psa, barokah, expert, trio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        expert=(Button) findViewById(R.id.expert);
        expert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Card.this, PrintExpertDetails.class);
                startActivity(intent);
            }
        });
        psa=(Button) findViewById(R.id.psa);
        psa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Card.this, PSADetails.class);
                startActivity(intent);
            }
        });
        trio =(Button) findViewById(R.id.trio);
        trio.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Card.this, TrioPrintingDetails.class);
                startActivity(intent);
            }
        });


        barokah=(Button) findViewById(R.id.barokah);
       barokah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Card.this, BarokahDetails.class);
                startActivity(intent);
            }
        });

    }
}

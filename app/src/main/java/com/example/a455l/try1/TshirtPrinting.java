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

public class TshirtPrinting extends AppCompatActivity {
Button mrj, rf, ideal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tshirt_printing);

        ideal=(Button) findViewById(R.id.ideal);
        ideal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(TshirtPrinting.this,IdealMasterDetails.class);
                startActivity(intent);
            }
        });
        mrj =(Button) findViewById(R.id.mrj);
       mrj.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(TshirtPrinting.this, MRJDetails.class);
                startActivity(intent);
            }
        });


        rf=(Button) findViewById(R.id.rf);
        rf.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(TshirtPrinting.this, RFdetails.class);
                startActivity(intent);
            }
        });
    }
}

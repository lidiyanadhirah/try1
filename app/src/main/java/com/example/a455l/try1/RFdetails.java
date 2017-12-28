package com.example.a455l.try1;

/**
 * Created by A455L on 21/12/2017.
 */

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class RFdetails extends AppCompatActivity {
    Button call;
    Button go;
    Button review;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rfprinting);

        call = (Button) findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:017-3267477"));

                if (ActivityCompat.checkSelfPermission(RFdetails.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);

            }
        });

        go=(Button) findViewById(R.id.go);
        go.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(RFdetails.this,RfMap.class);
                startActivity(intent);
            }
        });

        review=(Button) findViewById(R.id.review);
        review.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(RFdetails.this,ReviewRF.class);
                startActivity(intent);
            }
        });

    }

}

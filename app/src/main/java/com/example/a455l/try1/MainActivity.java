package com.example.a455l.try1;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    private Button bunting;
    private Button card;
    private Button tshirt;
    private Button photobook;
    private Button banner;
    private Button photostat;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        banner=(Button) findViewById(R.id.banner1);
        banner.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Banner.class);
                startActivity(intent);
            }
        });

        bunting=(Button) findViewById(R.id.bunting);
        bunting.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Bunting.class);
                startActivity(intent);
            }
        });

        card=(Button) findViewById(R.id.card);
        card.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Card.class);
                startActivity(intent);
            }
        });

        photobook=(Button) findViewById(R.id.book);
        photobook.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PhotoBook.class);
                startActivity(intent);
            }
        });

        photostat=(Button) findViewById(R.id.copy);
        photostat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PhotostatShop.class);
                startActivity(intent);
            }
        });

        tshirt=(Button) findViewById(R.id.tshirt);
       tshirt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TshirtPrinting.class);
                startActivity(intent);
            }
        });

    }


}
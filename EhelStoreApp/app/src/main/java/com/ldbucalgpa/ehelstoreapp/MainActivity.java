package com.ldbucalgpa.ehelstoreapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ehel);


        CardView eleccard = findViewById(R.id.eleccard);


        eleccard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        CardView clothingCard = findViewById(R.id.clothingCard);


        clothingCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, thirdact.class);
                startActivity(intent);
            }
        });

        RelativeLayout groceryLayout = findViewById(R.id.groceryLayout);


        groceryLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HtmlViewerActivity.class);
                startActivity(intent);
            }
        });



        RelativeLayout pharmaLayout = findViewById(R.id.pharmaLayout);


        pharmaLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, indexHtmlViewer.class);
                startActivity(intent);
            }
        });
        RelativeLayout homeLayout = findViewById(R.id.homeLayout);


        homeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, indexHtmlViewer.class);
                startActivity(intent);
            }
        });
        RelativeLayout beautyLayout= findViewById(R.id.beautyLayout);


       beautyLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, indexHtmlViewer.class);
                startActivity(intent);
            }
        });
    }
}

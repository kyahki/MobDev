package com.example.activitycollectionproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MapsExercise extends AppCompatActivity {

    ImageButton btnMaps1, btnMaps2, btnMaps3, btnMaps4, btnMaps5;
    View screenView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_exercise);

        btnMaps1 = findViewById(R.id.btnMaps1);
        btnMaps2 = findViewById(R.id.btnMaps2);
        btnMaps3 = findViewById(R.id.btnMaps3);
        btnMaps4 = findViewById(R.id.btnMaps4);
        btnMaps5 = findViewById(R.id.btnMaps5);
        screenView = findViewById(R.id.MapsMenu);

        btnMaps1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:35.907757,127.766922"));
                startActivity(intent);
                screenView.setBackgroundResource(R.drawable.first);
            }
        });

        btnMaps2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:36.1909285,128.2306587"));
                startActivity(intent);
                screenView.setBackgroundResource(R.drawable.ab);
            }
        });

        btnMaps3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:36.1555891,128.1964019"));
                startActivity(intent);
                screenView.setBackgroundResource(R.drawable.abc);
            }
        });

        btnMaps4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:35.6716259,127.0134339"));
                startActivity(intent);
                screenView.setBackgroundResource(R.drawable.abcd);
            }
        });

        btnMaps5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:35.6277944,127.1470884"));
                startActivity(intent);
                screenView.setBackgroundResource(R.drawable.abcde);
            }
        });
    }
}

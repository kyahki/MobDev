package com.example.activitycollectionproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3,btn4,btn5,btn6,btn7,btn8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btnInstagram);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, activity_instagramlayout.class);
                startActivity(intent1);
            }
        });

        btn2 = (Button) findViewById(R.id.btnBtnExercise);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, com.example.activitycollectionproject.ButtonActivity.class);
                startActivity(intent2);
            }
        });
        btn3 = (Button) findViewById(R.id.btnCalculator);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, Calculator.class);
                startActivity(intent3);
            }
        });
        btn4 = (Button) findViewById(R.id.btnMidterm);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, Midterm.class);
                startActivity(intent4);
            }
        });
        btn5 = (Button) findViewById(R.id.btnConnect3);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(MainActivity.this, Connect3.class);
                startActivity(intent5);
            }
        });
        btn6 = (Button) findViewById(R.id.btnPassingIntent);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(MainActivity.this, PassingIntentsExercise.class);
                startActivity(intent5);
            }
        });
        btn7 = (Button) findViewById(R.id.btnMenuExercise);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(MainActivity.this, MenuExercise.class);
                startActivity(intent5);
            }
        });
        btn8= (Button) findViewById(R.id.btnMap);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(MainActivity.this, MapsExercise.class);
                startActivity(intent5);
            }
        });
    }
}
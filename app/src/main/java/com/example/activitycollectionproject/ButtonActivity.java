package com.example.activitycollectionproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6;
    ConstraintLayout parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        parent = findViewById(R.id.parent);
        btn1 = (Button) findViewById(R.id.BtnActivity1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ButtonActivity.this, Activity1.class);
                startActivity(intent1);
            }
        });

        btn2 = (Button) findViewById(R.id.BtnActivity2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonActivity.this, "Error Message!", Toast.LENGTH_SHORT).show();
            }
        });

        btn3 = (Button) findViewById(R.id.BtnActivity3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn3.setAlpha(0);
            }
        });

        btn5 = (Button) findViewById(R.id.BtnActivity5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = 0;
                if(i == 0){
                    parent.setBackgroundResource(R.color.teal_700);
                    i++;
                }else{
                    parent.setBackgroundResource(R.color.white);
                    i = 0;
                }


            }
        });

        btn6 = (Button) findViewById(R.id.BtnActivity6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = 0;
                if(i == 0) {
                    btn6.setBackgroundColor(Color.GREEN);
                    i++;
                }else{
                    btn6.setBackgroundColor(Color.RED);
                    i = 0;
                }

            }
        });
    }
}
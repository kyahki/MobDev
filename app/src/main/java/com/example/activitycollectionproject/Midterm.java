package com.example.activitycollectionproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class Midterm extends AppCompatActivity {

    Button box_1, box_2, box_3, box_4, box_5, box_6, box_7, box_8 ,box_9;

    TextView playerturn;

    Boolean player1 = true;

    TableLayout tableLayout;
    TableRow tablerow;

    int activePlayer =0;


//




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midterm);

        playerturn  = (TextView) findViewById(R.id.textView);
        box_1 = (Button) findViewById(R.id.box1);
        box_2 = (Button) findViewById(R.id.box2);
        box_3 = (Button) findViewById(R.id.box3);
        box_4 = (Button) findViewById(R.id.box4);
        box_5 = (Button) findViewById(R.id.box5);
        box_6 = (Button) findViewById(R.id.box6);
        box_7 = (Button) findViewById(R.id.box7);
        box_8 = (Button) findViewById(R.id.box8);
        box_9 = (Button) findViewById(R.id.box9);

        box_1 = (Button) findViewById(R.id.box1);
        box_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                box_1.setTextColor(Color.GRAY);
                if(player1){
                    box_1.setText("O");
                    box_1.setClickable(false);
                    player1 = false;
                    box_1.setBackgroundColor(Color.BLUE);
                    box_2.setBackgroundColor(Color.BLUE);
                    box_3.setBackgroundColor(Color.BLUE);
                    box_4.setBackgroundColor(Color.BLUE);
                    box_5.setBackgroundColor(Color.BLUE);
                    box_6.setBackgroundColor(Color.BLUE);
                    box_7.setBackgroundColor(Color.BLUE);
                    box_8.setBackgroundColor(Color.BLUE);
                    box_9.setBackgroundColor(Color.BLUE);
                    playerturn.setText("PLAYER X TURN");
                }else{
                    box_1.setText("X");
                    box_1.setClickable(false);
                    player1 = true;
                    box_1.setBackgroundColor(Color.RED);
                    box_2.setBackgroundColor(Color.RED);
                    box_3.setBackgroundColor(Color.RED);
                    box_4.setBackgroundColor(Color.RED);
                    box_5.setBackgroundColor(Color.RED);
                    box_6.setBackgroundColor(Color.RED);
                    box_7.setBackgroundColor(Color.RED);
                    box_8.setBackgroundColor(Color.RED);
                    box_9.setBackgroundColor(Color.RED);
                    playerturn.setText("PLAYER O TURN");
                }
            }
        });
        box_2 = (Button) findViewById(R.id.box2);
        box_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                box_2.setTextColor(Color.GRAY);
                if(player1){
                    box_2.setText("O");
                    box_2.setClickable(false);
                    player1 = false;
                    box_1.setBackgroundColor(Color.BLUE);
                    box_2.setBackgroundColor(Color.BLUE);
                    box_3.setBackgroundColor(Color.BLUE);
                    box_4.setBackgroundColor(Color.BLUE);
                    box_5.setBackgroundColor(Color.BLUE);
                    box_6.setBackgroundColor(Color.BLUE);
                    box_7.setBackgroundColor(Color.BLUE);
                    box_8.setBackgroundColor(Color.BLUE);
                    box_9.setBackgroundColor(Color.BLUE);
                    playerturn.setText("PLAYER X TURN");
                }else{
                    box_2.setText("X");
                    box_2.setClickable(false);
                    player1 = true;
                    box_1.setBackgroundColor(Color.RED);
                    box_2.setBackgroundColor(Color.RED);
                    box_3.setBackgroundColor(Color.RED);
                    box_4.setBackgroundColor(Color.RED);
                    box_5.setBackgroundColor(Color.RED);
                    box_6.setBackgroundColor(Color.RED);
                    box_7.setBackgroundColor(Color.RED);
                    box_8.setBackgroundColor(Color.RED);
                    box_9.setBackgroundColor(Color.RED);
                    playerturn.setText("PLAYER O TURN");
                }
            }
        });
        box_3 = (Button) findViewById(R.id.box3);
        box_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                box_3.setTextColor(Color.GRAY);

                if(player1){
                    box_3.setText("O");
                    box_3.setClickable(false);
                    player1 = false;
                    box_1.setBackgroundColor(Color.BLUE);
                    box_2.setBackgroundColor(Color.BLUE);
                    box_3.setBackgroundColor(Color.BLUE);
                    box_4.setBackgroundColor(Color.BLUE);
                    box_5.setBackgroundColor(Color.BLUE);
                    box_6.setBackgroundColor(Color.BLUE);
                    box_7.setBackgroundColor(Color.BLUE);
                    box_8.setBackgroundColor(Color.BLUE);
                    box_9.setBackgroundColor(Color.BLUE);
                    playerturn.setText("PLAYER X TURN");
                }else{
                    box_3.setText("X");
                    box_3.setClickable(false);
                    player1 = true;
                    box_1.setBackgroundColor(Color.RED);
                    box_2.setBackgroundColor(Color.RED);
                    box_3.setBackgroundColor(Color.RED);
                    box_4.setBackgroundColor(Color.RED);
                    box_5.setBackgroundColor(Color.RED);
                    box_6.setBackgroundColor(Color.RED);
                    box_7.setBackgroundColor(Color.RED);
                    box_8.setBackgroundColor(Color.RED);
                    box_9.setBackgroundColor(Color.RED);
                    playerturn.setText("PLAYER O TURN");
                }
            }
        });
        box_4 = (Button) findViewById(R.id.box4);
        box_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                box_4.setTextColor(Color.GRAY);
                if(player1){
                    box_4.setText("O");
                    box_4.setClickable(false);
                    player1 = false;
                    box_1.setBackgroundColor(Color.BLUE);
                    box_2.setBackgroundColor(Color.BLUE);
                    box_3.setBackgroundColor(Color.BLUE);
                    box_4.setBackgroundColor(Color.BLUE);
                    box_5.setBackgroundColor(Color.BLUE);
                    box_6.setBackgroundColor(Color.BLUE);
                    box_7.setBackgroundColor(Color.BLUE);
                    box_8.setBackgroundColor(Color.BLUE);
                    box_9.setBackgroundColor(Color.BLUE);
                    playerturn.setText("PLAYER X TURN");
                }else{
                    box_4.setText("X");
                    box_4.setClickable(false);
                    player1 = true;
                    box_1.setBackgroundColor(Color.RED);
                    box_2.setBackgroundColor(Color.RED);
                    box_3.setBackgroundColor(Color.RED);
                    box_4.setBackgroundColor(Color.RED);
                    box_5.setBackgroundColor(Color.RED);
                    box_6.setBackgroundColor(Color.RED);
                    box_7.setBackgroundColor(Color.RED);
                    box_8.setBackgroundColor(Color.RED);
                    box_9.setBackgroundColor(Color.RED);
                    playerturn.setText("PLAYER O TURN");
                }
            }
        });
        box_5 = (Button) findViewById(R.id.box5);
        box_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                box_5.setTextColor(Color.GRAY);
                if(player1){
                    box_5.setText("O");
                    box_5.setClickable(false);
                    player1 = false;
                    box_1.setBackgroundColor(Color.BLUE);
                    box_2.setBackgroundColor(Color.BLUE);
                    box_3.setBackgroundColor(Color.BLUE);
                    box_4.setBackgroundColor(Color.BLUE);
                    box_5.setBackgroundColor(Color.BLUE);
                    box_6.setBackgroundColor(Color.BLUE);
                    box_7.setBackgroundColor(Color.BLUE);
                    box_8.setBackgroundColor(Color.BLUE);
                    box_9.setBackgroundColor(Color.BLUE);
                    playerturn.setText("PLAYER X TURN");
                }else{
                    box_5.setText("X");
                    box_5.setClickable(false);
                    player1 = true;
                    box_1.setBackgroundColor(Color.RED);
                    box_2.setBackgroundColor(Color.RED);
                    box_3.setBackgroundColor(Color.RED);
                    box_4.setBackgroundColor(Color.RED);
                    box_5.setBackgroundColor(Color.RED);
                    box_6.setBackgroundColor(Color.RED);
                    box_7.setBackgroundColor(Color.RED);
                    box_8.setBackgroundColor(Color.RED);
                    box_9.setBackgroundColor(Color.RED);
                    playerturn.setText("PLAYER O TURN");
                }
            }
        });
        box_6 = (Button) findViewById(R.id.box6);
        box_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                box_6.setTextColor(Color.GRAY);
                if(player1){
                    box_6.setText("O");
                    box_6.setClickable(false);
                    player1 = false;
                    box_1.setBackgroundColor(Color.BLUE);
                    box_2.setBackgroundColor(Color.BLUE);
                    box_3.setBackgroundColor(Color.BLUE);
                    box_4.setBackgroundColor(Color.BLUE);
                    box_5.setBackgroundColor(Color.BLUE);
                    box_6.setBackgroundColor(Color.BLUE);
                    box_7.setBackgroundColor(Color.BLUE);
                    box_8.setBackgroundColor(Color.BLUE);
                    box_9.setBackgroundColor(Color.BLUE);
                    playerturn.setText("PLAYER X TURN");
                }else{
                    box_6.setText("X");
                    box_6.setClickable(false);
                    player1 = true;
                    box_1.setBackgroundColor(Color.RED);
                    box_2.setBackgroundColor(Color.RED);
                    box_3.setBackgroundColor(Color.RED);
                    box_4.setBackgroundColor(Color.RED);
                    box_5.setBackgroundColor(Color.RED);
                    box_6.setBackgroundColor(Color.RED);
                    box_7.setBackgroundColor(Color.RED);
                    box_8.setBackgroundColor(Color.RED);
                    box_9.setBackgroundColor(Color.RED);
                    playerturn.setText("PLAYER O TURN");
                }
            }
        });
        box_7 = (Button) findViewById(R.id.box7);
        box_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                box_7.setTextColor(Color.GRAY);
                if(player1){
                    box_7.setText("O");
                    box_7.setClickable(false);
                    player1 = false;
                    box_1.setBackgroundColor(Color.BLUE);
                    box_2.setBackgroundColor(Color.BLUE);
                    box_3.setBackgroundColor(Color.BLUE);
                    box_4.setBackgroundColor(Color.BLUE);
                    box_5.setBackgroundColor(Color.BLUE);
                    box_6.setBackgroundColor(Color.BLUE);
                    box_7.setBackgroundColor(Color.BLUE);
                    box_8.setBackgroundColor(Color.BLUE);
                    box_9.setBackgroundColor(Color.BLUE);
                    playerturn.setText("PLAYER X TURN");
                }else{
                    box_7.setText("X");
                    box_7.setClickable(false);
                    player1 = true;
                    box_1.setBackgroundColor(Color.RED);
                    box_2.setBackgroundColor(Color.RED);
                    box_3.setBackgroundColor(Color.RED);
                    box_4.setBackgroundColor(Color.RED);
                    box_5.setBackgroundColor(Color.RED);
                    box_6.setBackgroundColor(Color.RED);
                    box_7.setBackgroundColor(Color.RED);
                    box_8.setBackgroundColor(Color.RED);
                    box_9.setBackgroundColor(Color.RED);
                    playerturn.setText("PLAYER O TURN");
                }
            }
        });
        box_8 = (Button) findViewById(R.id.box8);
        box_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                box_8.setTextColor(Color.GRAY);
                if(player1){
                    box_8.setText("O");
                    box_8.setClickable(false);
                    player1 = false;
                    box_1.setBackgroundColor(Color.BLUE);
                    box_2.setBackgroundColor(Color.BLUE);
                    box_3.setBackgroundColor(Color.BLUE);
                    box_4.setBackgroundColor(Color.BLUE);
                    box_5.setBackgroundColor(Color.BLUE);
                    box_6.setBackgroundColor(Color.BLUE);
                    box_7.setBackgroundColor(Color.BLUE);
                    box_8.setBackgroundColor(Color.BLUE);
                    box_9.setBackgroundColor(Color.BLUE);
                    playerturn.setText("PLAYER X TURN");
                }else{
                    box_8.setText("X");
                    box_8.setClickable(false);
                    player1 = true;
                    box_1.setBackgroundColor(Color.RED);
                    box_2.setBackgroundColor(Color.RED);
                    box_3.setBackgroundColor(Color.RED);
                    box_4.setBackgroundColor(Color.RED);
                    box_5.setBackgroundColor(Color.RED);
                    box_6.setBackgroundColor(Color.RED);
                    box_7.setBackgroundColor(Color.RED);
                    box_8.setBackgroundColor(Color.RED);
                    box_9.setBackgroundColor(Color.RED);
                    playerturn.setText("PLAYER O TURN");
                }
            }
        });
        box_9 = (Button) findViewById(R.id.box9);
        box_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                box_9.setTextColor(Color.GRAY);
                if(player1){
                    box_9.setText("O");
                    box_9.setClickable(false);
                    player1 = false;
                    box_1.setBackgroundColor(Color.BLUE);
                    box_2.setBackgroundColor(Color.BLUE);
                    box_3.setBackgroundColor(Color.BLUE);
                    box_4.setBackgroundColor(Color.BLUE);
                    box_5.setBackgroundColor(Color.BLUE);
                    box_6.setBackgroundColor(Color.BLUE);
                    box_7.setBackgroundColor(Color.BLUE);
                    box_8.setBackgroundColor(Color.BLUE);
                    box_9.setBackgroundColor(Color.BLUE);
                    playerturn.setText("PLAYER X TURN");
                }else{
                    box_9.setText("X");
                    box_9.setClickable(false);
                    player1 = true;
                    box_1.setBackgroundColor(Color.RED);
                    box_2.setBackgroundColor(Color.RED);
                    box_3.setBackgroundColor(Color.RED);
                    box_4.setBackgroundColor(Color.RED);
                    box_5.setBackgroundColor(Color.RED);
                    box_6.setBackgroundColor(Color.RED);
                    box_7.setBackgroundColor(Color.RED);
                    box_8.setBackgroundColor(Color.RED);
                    box_9.setBackgroundColor(Color.RED);
                    playerturn.setText("PLAYER O TURN");
                }
            }
        });
    }
}
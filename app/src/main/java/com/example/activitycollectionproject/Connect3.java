package com.example.activitycollectionproject;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Connect3 extends AppCompatActivity {
    Button button1, button2 , button3 , button4, button5, button6, button7, button8, button9, button10,
            button11, button12 , button13 , button14, button15, button16, button17, button18, button19, button20,
            button21, button22 , button23 , button24, button25, btnreset;
    TextView playerturn;
    final int[][] score = { {0, 0, 0, 0,0}, {0, 0, 0,0,0},
            {0, 0, 0, 0,0}, {0, 0, 0,0,0},
            {0, 0, 0, 0,0}
    };

    Boolean player1 = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect3);
        playerturn  = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);
        button20 = (Button) findViewById(R.id.button20);
        button21 = (Button) findViewById(R.id.button21);
        button22 = (Button) findViewById(R.id.button22);
        button23 = (Button) findViewById(R.id.button23);
        button24 = (Button) findViewById(R.id.button24);
        button25 = (Button) findViewById(R.id.button25);
        final int[] i = {0};
        final int[] j = {0};
        final int[] k = {0};
        final int[] l = {0};
        final int[] g = {0};
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player1){

                    if(i[0] == 0){
                        button21.setBackgroundColor(Color.RED);
                        score[4][0] = 1;
                    }
                    if(i[0] == 1){
                        button16.setBackgroundColor(Color.RED);
                        score[3][0] = 1;
                    }
                    else if(i[0] == 2){
                        button11.setBackgroundColor(Color.RED);
                        score[2][0] = 1;
                    }
                    else if(i[0] == 3){
                        button6.setBackgroundColor(Color.RED);
                        score[1][0] = 1;
                    }
                    else if(i[0] == 4){
                        button1.setBackgroundColor(Color.RED);
                        button1.setEnabled(false);
                        score[0][0] = 1;
                    }
                    if(checker(score,1)){
                        playerturn.setText("PLAYER 1 WIN!!!");
                        playerturn.setBackgroundColor(Color.RED);
                        disableAllButtons();
                    }else{
                        player1 = false;
                        playerturn.setText("PLAYER 2 TURN");
                        i[0]++;
                    }


                }else{

                    if(i[0] == 0){
                        button21.setBackgroundColor(Color.BLACK);
                        score[4][0] = 2;
                    }
                    if(i[0] == 1){
                        button16.setBackgroundColor(Color.BLACK);
                        score[3][0] = 2;
                    }
                    if(i[0] == 2){
                        button11.setBackgroundColor(Color.BLACK);
                        score[2][0] = 2;
                    }
                    if(i[0] == 3){
                        button6.setBackgroundColor(Color.BLACK);
                        score[1][0] = 2;
                    }
                    if(i[0] == 4){
                        button1.setBackgroundColor(Color.BLACK);
                        button1.setEnabled(false);
                        score[0][0] = 2;
                    }
                    if(checker(score,2)){
                        playerturn.setText("PLAYER 2 WIN!!!");
                        playerturn.setTextColor(Color.WHITE);
                        playerturn.setBackgroundColor(Color.BLACK);
                        disableAllButtons();
                    }else{
                        player1 = true;
                        playerturn.setText("PLAYER 1 TURN");
                        i[0]++;
                    }

                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (player1) {

                    if (j[0] == 0) {
                        button22.setBackgroundColor(Color.RED);
                        score[4][1] = 1;
                    }
                    if (j[0] == 1) {
                        button17.setBackgroundColor(Color.RED);
                        score[3][1] = 1;
                    } else if (j[0] == 2) {
                        button12.setBackgroundColor(Color.RED);
                        score[2][1] = 1;
                    } else if (j[0] == 3) {
                        button7.setBackgroundColor(Color.RED);
                        score[1][1] = 1;
                    } else if (j[0] == 4) {
                        button2.setBackgroundColor(Color.RED);
                        button2.setEnabled(false);
                        score[0][1] = 1;
                    }
                    if(checker(score,1)){
                        playerturn.setText("PLAYER 1 WIN!!!");
                        playerturn.setBackgroundColor(Color.RED);
                        disableAllButtons();
                    }else{
                        player1 = false;
                        playerturn.setText("PLAYER 2 TURN");
                        j[0]++;
                    }
                } else {
                    if (j[0] == 0) {
                        button22.setBackgroundColor(Color.BLACK);
                        score[4][1] = 2;
                    }
                    if (j[0] == 1) {
                        button17.setBackgroundColor(Color.BLACK);
                        score[3][1] = 2;
                    }
                    if (j[0] == 2) {
                        button12.setBackgroundColor(Color.BLACK);
                        score[2][1] = 2;
                    }
                    if (j[0] == 3) {
                        button7.setBackgroundColor(Color.BLACK);
                        score[1][1] = 2;
                    }
                    if (j[0] == 4) {
                        button2.setBackgroundColor(Color.BLACK);
                        button2.setEnabled(false);
                        score[0][1] = 2;
                    }
                    if(checker(score,2)){
                        playerturn.setText("PLAYER 2 WIN!!!");
                        playerturn.setTextColor(Color.WHITE);
                        playerturn.setBackgroundColor(Color.BLACK);
                        disableAllButtons();
                    }else{
                        player1 = true;
                        playerturn.setText("PLAYER 1 TURN");
                        j[0]++;
                    }
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (player1) {

                    if (k[0] == 0) {
                        button23.setBackgroundColor(Color.RED);
                        score[4][2] = 1;
                    }
                    if (k[0] == 1) {
                        button18.setBackgroundColor(Color.RED);
                        score[3][2] = 1;
                    } else if (k[0] == 2) {
                        button13.setBackgroundColor(Color.RED);
                        score[2][2] = 1;
                    } else if (k[0] == 3) {
                        button8.setBackgroundColor(Color.RED);
                        score[1][2] = 1;
                    } else if (k[0] == 4) {
                        button3.setBackgroundColor(Color.RED);
                        button3.setEnabled(false);
                        score[0][2] = 1;
                    }
                    if(checker(score,1)){
                        playerturn.setText("PLAYER 1 WIN!!!");
                        playerturn.setBackgroundColor(Color.RED);
                        disableAllButtons();
                    }else{
                        player1 = false;
                        playerturn.setText("PLAYER 2 TURN");
                        k[0]++;
                    }
                } else {

                    if (k[0] == 0) {
                        button23.setBackgroundColor(Color.BLACK);
                        score[4][2] = 2;
                    }
                    if (k[0] == 1) {
                        button18.setBackgroundColor(Color.BLACK);
                        score[3][2] = 2;
                    }
                    if (k[0] == 2) {
                        button13.setBackgroundColor(Color.BLACK);
                        score[2][2] = 2;
                    }
                    if (k[0] == 3) {
                        button8.setBackgroundColor(Color.BLACK);
                        score[1][2] = 2;
                    }
                    if (k[0] == 4) {
                        button3.setBackgroundColor(Color.BLACK);
                        button3.setEnabled(false);
                        score[0][2] = 2;
                    }
                    if(checker(score,2)){
                        playerturn.setText("PLAYER 2 WIN!!!");
                        playerturn.setTextColor(Color.WHITE);
                        playerturn.setBackgroundColor(Color.BLACK);
                        disableAllButtons();
                    }else{
                        player1 = true;
                        playerturn.setText("PLAYER 1 TURN");
                        k[0]++;
                    }
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (player1) {

                    if (l[0] == 0) {
                        button24.setBackgroundColor(Color.RED);
                        score[4][3] = 1;
                    }
                    if (l[0] == 1) {
                        button19.setBackgroundColor(Color.RED);
                        score[3][3] = 1;
                    } else if (l[0] == 2) {
                        button14.setBackgroundColor(Color.RED);
                        score[2][3] = 1;
                    } else if (l[0] == 3) {
                        button9.setBackgroundColor(Color.RED);
                        score[1][3] = 1;
                    } else if (l[0] == 4) {
                        button4.setBackgroundColor(Color.RED);
                        button4.setEnabled(false);
                        score[0][3] = 1;
                    }
                    if(checker(score,1)){
                        playerturn.setText("PLAYER 1 WIN!!!");
                        playerturn.setBackgroundColor(Color.RED);
                        disableAllButtons();
                    }else{
                        player1 = false;
                        playerturn.setText("PLAYER 2 TURN");
                        l[0]++;
                    }
                } else {

                    if (l[0] == 0) {
                        button24.setBackgroundColor(Color.BLACK);
                        score[4][3] = 2;
                    }
                    if (l[0] == 1) {
                        button19.setBackgroundColor(Color.BLACK);
                        score[3][3] = 2;
                    }
                    if (l[0] == 2) {
                        button14.setBackgroundColor(Color.BLACK);
                        score[2][3] = 2;
                    }
                    if (l[0] == 3) {
                        button9.setBackgroundColor(Color.BLACK);
                        score[1][3] = 2;
                    }
                    if (l[0] == 4) {
                        button4.setBackgroundColor(Color.BLACK);
                        button4.setEnabled(false);
                        score[0][3] = 2;
                    }
                    if(checker(score,2)){
                        playerturn.setText("PLAYER 2 WIN!!!");
                        playerturn.setTextColor(Color.WHITE);
                        playerturn.setBackgroundColor(Color.BLACK);
                        disableAllButtons();
                    }else{
                        player1 = true;
                        playerturn.setText("PLAYER 1 TURN");
                        l[0]++;
                    }
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (player1) {

                    if (g[0] == 0) {
                        button25.setBackgroundColor(Color.RED);
                        score[4][4] = 1;
                    }
                    if (g[0] == 1) {
                        button20.setBackgroundColor(Color.RED);
                        score[3][4] = 1;
                    } else if (g[0] == 2) {
                        button15.setBackgroundColor(Color.RED);
                        score[2][4] = 1;
                    } else if (g[0] == 3) {
                        button10.setBackgroundColor(Color.RED);
                        score[1][4] = 1;
                    } else if (g[0] == 4) {
                        button5.setBackgroundColor(Color.RED);
                        button5.setEnabled(false);
                        score[0][4] = 1;
                    }
                    if(checker(score,1)){
                        playerturn.setText("PLAYER 1 WIN!!!");
                        playerturn.setBackgroundColor(Color.RED);
                        disableAllButtons();
                    }else{
                        player1 = false;
                        playerturn.setText("PLAYER 2 TURN");
                        g[0]++;
                    }
                } else {

                    if (g[0] == 0) {
                        button25.setBackgroundColor(Color.BLACK);
                        score[4][4] = 2;
                    }
                    if (g[0] == 1) {
                        button20.setBackgroundColor(Color.BLACK);
                        score[3][4] = 2;
                    }
                    if (g[0] == 2) {
                        button15.setBackgroundColor(Color.BLACK);
                        score[2][4] = 2;
                    }
                    if (g[0] == 3) {
                        button10.setBackgroundColor(Color.BLACK);
                        score[1][4] = 2;
                    }
                    if (g[0] == 4) {
                        button5.setBackgroundColor(Color.BLACK);
                        button5.setEnabled(false);
                        score[0][4] = 2;
                    }
                    if(checker(score,2)){
                        playerturn.setText("PLAYER 2 WIN!!!");
                        playerturn.setTextColor(Color.WHITE);
                        playerturn.setBackgroundColor(Color.BLACK);
                        disableAllButtons();
                    }else{
                        player1 = true;
                        playerturn.setText("PLAYER 1 TURN");
                        g[0]++;
                    }
                }
            }
        });
        btnreset = (Button) findViewById(R.id.btnreset);
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Connect3.this, Connect3.class);
                startActivity(intent1);

            }
        });

    }

    //    { {1, 2, 0, 0, 0},
//      {1, 0, 0, 0, 0},
//      {1, 1, 0, 0, 0},
//      {2, 2, 1, 0, 0},
//      {2, 2, 2, 0, 0}
//    };
    public boolean checker(int[][] array, int player) {
        //HORIZONTAL
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == player && array[i][j] == array[i][j + 1] && array[i][j] == array[i][j + 2]) {
                    return true;
                }
            }
        }

        //VERTICAL
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 3; i++) {
                if (array[i][j] == player && array[i][j] == array[i + 1][j] && array[i][j] == array[i + 2][j]) {
                    return true;
                }
            }
        }

        //DIAGONAL TOPLEFT TO BOTTOMLEFT
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == player && array[i][j] == array[i + 1][j + 1] && array[i][j] == array[i + 2][j + 2]) {
                    return true;
                }
            }
        }

        //DIAGONAL TOPRIGHT TO BOTTOMRIGHT
        for (int i = 4; i >= 2; i--) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == player && array[i][j] == array[i - 1][j + 1] && array[i][j] == array[i - 2][j + 2]) {
                    return true;
                }
            }
        }

        return false;
    }
    private void disableAllButtons() {
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);

    }


}
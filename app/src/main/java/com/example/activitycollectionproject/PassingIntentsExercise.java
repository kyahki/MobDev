package com.example.activitycollectionproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class PassingIntentsExercise extends AppCompatActivity {

    EditText eFName, eLName, eBdate, eNum,eMail,eCName,eCNum,eAllergy;

    RadioButton rdbtnMale, rdbtnFemale, rdbtnOthers, rdbtnCit, rdbtnUsjr, rdbtnUsc, rdbtnotherschool,
    rdbtnSingle,rdbtnMarried;


    Button btnSubmit, btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);

        eFName = findViewById(R.id.eFname);
        eLName = findViewById(R.id.eLName);
        eBdate = findViewById(R.id.eBDate);
        eNum = findViewById(R.id.eNum);
        eMail = findViewById(R.id.eMail);
        eCName = findViewById(R.id.eCName);
        eCNum = findViewById(R.id.eCNum);
        eAllergy = findViewById(R.id.eAllergy);


        rdbtnMale = findViewById(R.id.rdbtnMale);
        rdbtnFemale = findViewById(R.id.rdbtnFemale);
        rdbtnOthers = findViewById(R.id.rdbtnOthers);
        rdbtnCit = findViewById(R.id.rdbtnCit);
        rdbtnUsjr = findViewById(R.id.rdbtnUsjr);
        rdbtnUsc = findViewById(R.id.rdbtnUsc);
        rdbtnotherschool = findViewById(R.id.rdbtnotherschool);
        rdbtnSingle = findViewById(R.id.rdbtnSingle);
        rdbtnMarried = findViewById(R.id.rdbtnMarried);


        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fName = eFName.getText().toString();
                String LName = eLName.getText().toString();

                String gender;
                if (rdbtnMale.isChecked()){
                    gender = "Male";
                }else if (rdbtnFemale.isChecked()){
                    gender = "Male";
                }else if (rdbtnOthers.isChecked()){
                    gender = "Others";
                }else{
                    gender = "Unknown";
                }

                String bDate = eBdate.getText().toString();
                String pNumber = eNum.getText().toString();
                String emailAdd = eMail.getText().toString();

                String prevschool;
                if (rdbtnCit.isChecked()){
                    prevschool = "CIT-U";
                }else if (rdbtnUsjr.isChecked()){
                    prevschool = "USJ-R";
                }else if (rdbtnUsc.isChecked()){
                    prevschool = "USC";
                }else if (rdbtnotherschool.isChecked()){
                    prevschool = "Other school";
                }else{
                    prevschool = "Unknown";
                }

                String status;
                if (rdbtnSingle.isChecked()){
                    status = "Single";
                }else if (rdbtnMarried.isChecked()){
                    status = "Married";
                }else{
                    status = "Unknown";
                }

                String cName = eCName.getText().toString();
                String cPNum = eCNum.getText().toString();
                String allergy = eAllergy.getText().toString();

                Intent intent = new Intent(PassingIntentsExercise.this, PassingIntentsExercise2.class);
                intent.putExtra("fname_key",fName); intent.putExtra("lname_key",LName);
                intent.putExtra("gender_key",gender); intent.putExtra("bdate_key",bDate);
                intent.putExtra("pnum_key",pNumber); intent.putExtra("eadd_key",emailAdd);
                intent.putExtra("prevschool_key",prevschool); intent.putExtra("status_key",status);
                intent.putExtra("cname_key",cName); intent.putExtra("cpnum_key",cPNum);
                intent.putExtra("allergy_key",allergy);
                startActivity(intent);

            }
        });
        btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(PassingIntentsExercise.this, PassingIntentsExercise.class);
                startActivity(intent1);

            }
        });
    }
}
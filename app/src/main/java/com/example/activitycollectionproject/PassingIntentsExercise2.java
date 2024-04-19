package com.example.activitycollectionproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PassingIntentsExercise2 extends AppCompatActivity {

    Button btnReturn;

    TextView txtFName,txtLName,txtGender,txtPNum,txtBirthDate,txteMail,txtPrevSchool,txtStatus,txtEPerson,
            txtCNum,txtAllergy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise2);

        txtFName = findViewById(R.id.txtFName);

                txtLName = findViewById(R.id.txtLName);
                txtGender = findViewById(R.id.txtGender);
                txtBirthDate = findViewById(R.id.txtBirthDate);
                txtPNum = findViewById(R.id.txtPNum);
                txteMail = findViewById(R.id.txteMail);
                txtPrevSchool = findViewById(R.id.txtPrevSchool);
                txtStatus = findViewById(R.id.txtStatus);
                txtEPerson = findViewById(R.id.txtEPerson);
                txtCNum = findViewById(R.id.txtCNum);
                txtAllergy = findViewById(R.id.txtAllergy);
        Intent intent = getIntent();

        String fname = intent.getStringExtra("fname_key");
        String lname = intent.getStringExtra("lname_key");
        String gender = intent.getStringExtra("gender_key");
        String bdate = intent.getStringExtra("bdate_key");
        String pnum = intent.getStringExtra("pnum_key");
        String eadd = intent.getStringExtra("eadd_key");
        String prevschool = intent.getStringExtra("prevschool_key");
        String status = intent.getStringExtra("status_key");
        String cname = intent.getStringExtra("cname_key");
        String cpnum = intent.getStringExtra("cpnum_key");
        String allergy = intent.getStringExtra("allergy_key");

        txtFName.setText(fname);
        txtLName.setText(lname);
        txtGender.setText(gender);
        txtBirthDate.setText(bdate);
        txtPNum.setText(pnum);
        txteMail.setText(eadd);
        txtPrevSchool.setText(prevschool);
        txtStatus.setText(status);
        txtEPerson.setText(cname);
        txtCNum.setText(cpnum);
        txtAllergy.setText(allergy);


        btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(PassingIntentsExercise2.this, PassingIntentsExercise.class);
                startActivity(intent1);

            }
        });
        };
    }

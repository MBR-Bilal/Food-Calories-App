package com.example.caloriesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton btn1,btn2, btn3, btn4, btn5;
    TextView tv;
    Button ans;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        tv=findViewById(R.id.tv);
        ans=findViewById(R.id.ans);
        //radioGroup=findViewById(R.id.radioGroup);


        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn1.isChecked()){
                tv.setText("Choose b/w cheese and fraiche");
                }
                if(btn1.isChecked() && btn4.isChecked()) {
                    tv.setText("27 Calories");
                }
                if (btn1.isChecked() && btn5.isChecked()){
                    tv.setText("31 Calories");
                }
                if(btn2.isChecked()){
                    tv.setText("Choose b/w cheese and fraiche");
                }
                if(btn2.isChecked() && btn4.isChecked()) {
                    tv.setText("32 Calories");
                }
                if (btn2.isChecked() && btn5.isChecked()){
                    tv.setText("36 Calories");
            }
                if(btn3.isChecked()){
                    tv.setText("Choose b/w cheese and fraiche");
                }
                if(btn3.isChecked() && btn4.isChecked()) {
                    tv.setText("18 Calories");
                }
                if (btn3.isChecked() && btn5.isChecked()) {
                    tv.setText("22 Calories");
                }





        }







            });
        }}

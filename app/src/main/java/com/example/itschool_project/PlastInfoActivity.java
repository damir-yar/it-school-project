package com.example.itschool_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PlastInfoActivity extends AppCompatActivity {

    private Button plastOne;
    private Button plastTwo;
    private Button plastThree;
    private Button plastFour;
    private Button plastFive;
    private Button plastSix;
    private Button plastSeven;
    private Button plastABC;

    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plast_info);

        plastOne = findViewById(R.id.but_plast_info_one);
        plastTwo = findViewById(R.id.but_plast_info_two);
        plastThree = findViewById(R.id.but_plast_info_three);
        plastFour = findViewById(R.id.but_plast_info_four);
        plastFive = findViewById(R.id.but_plast_info_five);
        plastSix = findViewById(R.id.but_plast_info_six);
        plastSeven = findViewById(R.id.but_plast_info_seven);
        plastABC = findViewById(R.id.but_plast_info_abc);

        info = findViewById(R.id.text_info);

        info.setText(R.string.plast_info);
        getSupportActionBar().setTitle("Пластик");

        plastOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(R.string.plast_one);
            }
        });
        plastTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(R.string.plast_two);
            }
        });
        plastThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(R.string.plast_three);
            }
        });
        plastFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(R.string.plast_four);
            }
        });
        plastFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(R.string.plast_five);
            }
        });
        plastSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(R.string.plast_six);
            }
        });
        plastSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(R.string.plast_seven);
            }
        });
        plastABC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(R.string.plast_abc);
            }
        });
    }
}
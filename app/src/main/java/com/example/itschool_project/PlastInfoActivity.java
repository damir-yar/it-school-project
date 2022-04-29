package com.example.itschool_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class PlastInfoActivity extends AppCompatActivity {

    private ImageButton plastOne;
    private ImageButton plastTwo;
    private ImageButton plastThree;
    private ImageButton plastFour;
    private ImageButton plastFive;
    private ImageButton plastSix;
    private ImageButton plastSeven;
    private ImageButton plastABC;

    private TextView info;
    private TextView info2;

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
        info2 = findViewById(R.id.text_info2);

        info.setText(R.string.plast_info);
        getSupportActionBar().setTitle("Пластик");

        plastOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setTextColor(getResources().getColor(R.color.purple_500));
                info.setText(R.string.plast_one1);
                info2.setText(R.string.plast_one2);
            }
        });
        plastTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setTextColor(getResources().getColor(R.color.purple_500));
                info.setText(R.string.plast_two1);
                info2.setText(R.string.plast_two2);
            }
        });
        plastThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setTextColor(getResources().getColor(R.color.red));
                info.setText(R.string.plast_three1);
                info2.setText(R.string.plast_three2);
            }
        });
        plastFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setTextColor(getResources().getColor(R.color.yellow));
                info.setText(R.string.plast_four1);
                info2.setText(R.string.plast_four2);
            }
        });
        plastFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setTextColor(getResources().getColor(R.color.yellow));
                info.setText(R.string.plast_five1);
                info2.setText(R.string.plast_five2);
            }
        });
        plastSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setTextColor(getResources().getColor(R.color.red));
                info.setText(R.string.plast_six1);
                info2.setText(R.string.plast_six2);
            }
        });
        plastSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setTextColor(getResources().getColor(R.color.red));
                info.setText(R.string.plast_seven1);
                info2.setText(R.string.plast_seven2);
            }
        });
        plastABC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setTextColor(getResources().getColor(R.color.purple_500));
                info.setText(R.string.plast_abs1);
                info2.setText(R.string.plast_abs2);
            }
        });
    }
}
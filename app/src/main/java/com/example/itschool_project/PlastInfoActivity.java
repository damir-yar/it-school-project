package com.example.itschool_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class PlastInfoActivity extends AppCompatActivity {

    private ImageButton plastOne;
    private ImageButton plastTwo;
    private ImageButton plastThree;
    private ImageButton plastFour;
    private ImageButton plastFive;
    private ImageButton plastSix;
    private ImageButton plastSeven;
    private ImageButton plastABS;

    private TextView info;
    private TextView info2;

    private ImageView image;

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
        plastABS = findViewById(R.id.but_plast_info_abs);



        image = findViewById(R.id.im_plast);

        setTitle("Пластик");

        plastOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.p1);
            }
        });
        plastTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.p2);
            }
        });
        plastThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.p3);
            }
        });
        plastFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.p4);
            }
        });
        plastFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.p5);
            }
        });
        plastSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.p6);
            }
        });
        plastSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.p7);
            }
        });
        plastABS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.p9);
            }
        });
    }
}
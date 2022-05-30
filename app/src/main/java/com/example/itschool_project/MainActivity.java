package com.example.itschool_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button plast;
    private Button met;
    private Button mak;
    private Button interest;

    private Button chisto;
    private Button ecor;
    private Button map;
    private Button bat;
    private Button batMap;
    private Button chistoMap;
    private Button plast_n;
    private Button about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().hide();

        plast = findViewById(R.id.but_plast);
        met = findViewById(R.id.but_met);
        mak = findViewById(R.id.but_mak);
        interest = findViewById(R.id.but_int);

        map = findViewById(R.id.but_map);
        chisto = findViewById(R.id.but_chisto);
        ecor = findViewById(R.id.but_ecor);
        bat = findViewById(R.id.but_bat);
        batMap = findViewById(R.id.but_bat_map);
        chistoMap = findViewById(R.id.but_chisto_map);
        plast_n = findViewById(R.id.but_plast_n);
        about = findViewById(R.id.but_about);

        plast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlastInfoActivity.class);
                startActivity(intent);
            }
        });
        met.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MetInfoActivity.class);
                startActivity(intent);
            }
        });
        mak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MakInfoActivity.class);
                startActivity(intent);
            }
        });
        interest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IntActivity.class);
                startActivity(intent);
            }
        });


        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });
        chisto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChistoInfoActivity.class);
                startActivity(intent);
            }
        });
        ecor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EcorInfoActivity.class);
                startActivity(intent);
            }
        });
        bat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BatActivity.class);
                startActivity(intent);
            }
        });
        batMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EcorMapActivity.class);
                startActivity(intent);
            }
        });
        chistoMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChistoMapActivity.class);
                startActivity(intent);
            }
        });
        plast_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlastActivity.class);
                startActivity(intent);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
    }
}
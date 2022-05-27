package com.example.itschool_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button plast;
    private Button bat;
    private Button mak;

    private Button chisto;
    private Button ecor;
    private Button map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().hide();

        plast = findViewById(R.id.but_plast);
        bat = findViewById(R.id.but_bat);
        mak = findViewById(R.id.but_mak);

        map = findViewById(R.id.but_map);
        chisto = findViewById(R.id.but_chisto);
        ecor = findViewById(R.id.but_ecor);

        plast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlastInfoActivity.class);
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

        bat.setOnClickListener(new View.OnClickListener() {
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
    }
}
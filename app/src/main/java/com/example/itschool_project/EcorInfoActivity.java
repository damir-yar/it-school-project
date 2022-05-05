package com.example.itschool_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class EcorInfoActivity extends AppCompatActivity {

    private ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecor_info);

        setTitle("Экор");

        im = findViewById(R.id.im_ecor);

        im.setImageResource(R.drawable.ecor);
    }
}
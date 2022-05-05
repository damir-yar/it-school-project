package com.example.itschool_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ChistoInfoActivity extends AppCompatActivity {

    private ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chisto_info);

        setTitle("#чистопоудмуртски");

        im = findViewById(R.id.im_chisto);

        im.setImageResource(R.drawable.chisto);
    }
}
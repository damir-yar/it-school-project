package com.example.itschool_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MakInfoActivity extends AppCompatActivity {

    private ImageView im;

    private Button a;
    private Button b;
    private Button v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mak_info);

        setTitle("Макулатура");

        im = findViewById(R.id.im_mak);

        a = findViewById(R.id.but_mak_info_a);
        b = findViewById(R.id.but_mak_info_b);
        v = findViewById(R.id.but_mak_info_v);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im.setImageResource(R.drawable.m_a);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im.setImageResource(R.drawable.m_b);
            }
        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im.setImageResource(R.drawable.m_v);
            }
        });
    }
}
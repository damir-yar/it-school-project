package com.example.itschool_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IntActivity extends AppCompatActivity {

    private TextView text;

    private Button but;

    int inter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_int);

        setTitle("Интересное");

        text = findViewById(R.id.text_int);

        but = findViewById(R.id.but_int_v);



        text.setText(R.string.interest1);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inter+=1;
                if (inter == 11)
                    inter = 1;
                switch (inter){
                    case 1:
                        text.setText(R.string.interest1);
                        break;
                    case 2:
                        text.setText(R.string.interest2);
                        break;
                    case 3:
                        text.setText(R.string.interest3);
                        break;
                    case 4:
                        text.setText(R.string.interest4);
                        break;
                    case 5:
                        text.setText(R.string.interest5);
                        break;
                    case 6:
                        text.setText(R.string.interest6);
                        break;
                    case 7:
                        text.setText(R.string.interest7);
                        break;
                    case 8:
                        text.setText(R.string.interest8);
                        break;
                    case 9:
                        text.setText(R.string.interest9);
                        break;
                    case 10:
                        text.setText(R.string.interest10);
                        break;
                }
            }
        });


    }
}
package com.example.itschool_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    private Button git;
    private Button quest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        setTitle("О проекте");


        git = findViewById(R.id.but_git);
        quest = findViewById(R.id.but_quest);


        git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/damir-yar/it-school-project"));
                startActivity(browserIntent);
            }
        });
        quest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "yar.damir23@gmailcom" });
                intent.putExtra(Intent.EXTRA_SUBJECT, "ЭКО справочник");
                intent.putExtra(Intent.EXTRA_TEXT, "Ваше сообщение...");
                startActivity(Intent.createChooser(intent, ""));
            }
        });
    }
}
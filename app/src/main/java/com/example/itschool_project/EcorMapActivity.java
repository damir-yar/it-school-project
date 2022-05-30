package com.example.itschool_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class EcorMapActivity extends AppCompatActivity {

    private WebView web;

    private ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecor_map);

        progress =findViewById(R.id.progressBar);

        setTitle("Карта Экор");

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                progress.setVisibility(View.INVISIBLE);
            }
        }, 3000);


        WebView web = (WebView) findViewById(R.id.web_ecor);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setDomStorageEnabled(true);
        web.loadUrl("https://2gis.ru/izhevsk/search/%D1%8D%D0%BA%D0%BE%D1%80?m=53.229885%2C56.856899%2F12.4");

    }
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if (Uri.parse(url).getHost().equals("www.example.com")) {
                return false;
            }
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
            return true;
        }
    }
}
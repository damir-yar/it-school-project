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

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;

public class MapActivity extends AppCompatActivity {

    private WebView web;

    private ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        progress =findViewById(R.id.progressBar);

        setTitle("Карта");

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                progress.setVisibility(View.INVISIBLE);
            }
        }, 3000);


        WebView web = (WebView) findViewById(R.id.web);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setDomStorageEnabled(true);
        web.loadUrl("https://2gis.ru/izhevsk/search/%D0%BF%D1%80%D0%B8%D0%B5%D0%BC%20%D0%B2%D1%82%D0%BE%D1%80%D1%81%D1%8B%D1%80%D1%8C%D1%8F/rubricId/110523?m=53.220404%2C56.852085%2F12.67");

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
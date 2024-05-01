package com.ldbucalgpa.ehelstoreapp;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class indexHtmlViewer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html_viewer);


        WebView webView = findViewById(R.id.htmlWebView);


        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


        webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);


        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });


        webView.loadUrl("file:///android_asset/index.html");
    }
}
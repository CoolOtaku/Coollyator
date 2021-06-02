package com.example.coollyator;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Main5Activity extends AppCompatActivity {
    WebView wb;
    @Override
    public void onBackPressed() {
        if(wb.canGoBack()) {
            wb.goBack();
        } else {
            super.onBackPressed();
        }
    }
    @SuppressLint({"SetJavaScriptEnabled", "JavascriptInterface"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        wb = (WebView)findViewById(R.id.wb);
        wb.loadUrl("https://www1.oanda.com/currency/converter/");//http://cuex.com/ru/uah-uah
        /// URL To Binding Test Website is https://raghuveer-singh-bhardwaj.github.io/ss.html
        WebSettings webSettings = wb.getSettings();
        webSettings.setJavaScriptEnabled(true); //Enables JavaScript
        webSettings.setBuiltInZoomControls(true);
        wb.addJavascriptInterface(this,"Android"); //Binds Android app with Website

        wb.setWebViewClient(new MyWebViewClient());
    }
    private class MyWebViewClient extends android.webkit.WebViewClient implements WebViewClient {
        @TargetApi(Build.VERSION_CODES.N)
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(request.getUrl().toString());
            return true;
        }

        // Для старых устройств
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}

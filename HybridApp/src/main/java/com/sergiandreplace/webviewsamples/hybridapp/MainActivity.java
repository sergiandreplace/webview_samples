package com.sergiandreplace.webviewsamples.hybridapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;


public class MainActivity extends ActionBarActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        webView=new WebView(this);
        setContentView(webView);
        webView.loadUrl("file:///android_asset/index.html");
    }




}

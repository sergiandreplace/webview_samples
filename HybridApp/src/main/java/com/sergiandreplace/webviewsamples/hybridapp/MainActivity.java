package com.sergiandreplace.webviewsamples.hybridapp;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import java.net.URI;


public class MainActivity extends ActionBarActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        webView=new WebView(this);
        setContentView(webView);
        webView.loadUrl("file:///android_asset/index.html");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new InjectableJava(this), "Android");
        webView.setWebViewClient(new MyWebViewClient());
        webView.loadUrl("javascript:changeBackground()");
    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Uri uri=Uri.parse(url);
            if ("sample".equalsIgnoreCase(uri.getHost())) {
                Toast.makeText(MainActivity.this,uri.getPathSegments().get(0),Toast.LENGTH_LONG).show();
            }else {
                view.loadUrl(url);
            }
            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            webView.loadUrl("javascript:changeBackground ()");

        }
    }




}

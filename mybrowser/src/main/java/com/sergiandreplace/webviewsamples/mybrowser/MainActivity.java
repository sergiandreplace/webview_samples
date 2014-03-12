package com.sergiandreplace.webviewsamples.mybrowser;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private View go;
    private EditText url;
    private WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListeners();
    }

    private void findViews() {
        go=findViewById(R.id.go);
        url=(EditText) findViewById(R.id.url);
        browser=(WebView) findViewById(R.id.browser);
    }

    private void setListeners() {
        go.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        browser.loadUrl(url.getText().toString());
    }


}

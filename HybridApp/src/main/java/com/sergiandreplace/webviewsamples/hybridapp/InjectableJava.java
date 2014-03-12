package com.sergiandreplace.webviewsamples.hybridapp;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;


public class InjectableJava {
        Context context;

    InjectableJava(Context context) {
        this.context=context;
    }

    @JavascriptInterface
    public void showToast(String toast) {
        Toast.makeText(context, toast, Toast.LENGTH_SHORT).show();
    }

}

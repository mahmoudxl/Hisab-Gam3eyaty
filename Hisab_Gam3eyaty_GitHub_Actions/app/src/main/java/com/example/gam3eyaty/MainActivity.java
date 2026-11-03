package com.example.gam3eyaty;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.view.Window;
import android.graphics.Color;
public class MainActivity extends Activity {
 @Override public void onCreate(Bundle b) {
  super.onCreate(b);
  getWindow().setStatusBarColor(Color.rgb(18,60,53));
  WebView w = new WebView(this);
  w.setBackgroundColor(Color.rgb(243,246,245));
  WebSettings s = w.getSettings();
  s.setJavaScriptEnabled(true);
  s.setDomStorageEnabled(true);
  s.setAllowFileAccess(true);
  w.setWebViewClient(new WebViewClient());
  setContentView(w);
  w.loadUrl("file:///android_asset/index.html");
 }
 @Override public void onBackPressed() { super.onBackPressed(); }
}

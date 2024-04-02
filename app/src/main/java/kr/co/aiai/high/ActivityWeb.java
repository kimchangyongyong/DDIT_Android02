package kr.co.aiai.high;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class ActivityWeb extends AppCompatActivity {
    EditText et_text;
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        Button btn = findViewById(R.id.btn);
        Button btn2 = findViewById(R.id.btn2);
        et_text = findViewById(R.id.et_text);
        wv = findViewById(R.id.wv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClick();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClick2();
            }
        });
    }

    private void myClick() {
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl(et_text.getText().toString());
    }

    private void myClick2() {
        wv.setWebViewClient(new WebViewClient());
        String webUrl = "file:///android_asset/index.html";
        wv.loadUrl(webUrl);
    }
}
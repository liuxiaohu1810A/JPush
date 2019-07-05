package com.example.jpush;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import cn.jpush.android.api.JPushInterface;

public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);

        setContentView(textView);
//        title = bundle.getString(JPushInterface.EXTRA_NOTIFICATION_TITLE);
//        content = bundle.getString(JPushInterface.EXTRA_ALERT);

        Bundle bundle = getIntent().getExtras();
        String title = bundle.getString(JPushInterface.EXTRA_NOTIFICATION_TITLE);
        String content = bundle.getString(JPushInterface.EXTRA_ALERT);


        textView.setText(title+"---"+content);
    }
}

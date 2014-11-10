package com.example.helloworldtwowindows;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class Result extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        Bundle bundle = getIntent().getExtras();
        
        TextView textMessage = (TextView) findViewById(R.id.result_text);
        textMessage.setText("Welcome to Android " + bundle.getString("NAME"));
    }
}

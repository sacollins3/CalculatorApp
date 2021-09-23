package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView3 = (TextView) findViewById(R.id.textView3);
        Intent intent = getIntent();
        String value = intent.getStringExtra("val");
        textView3.setText(value);
    }
}
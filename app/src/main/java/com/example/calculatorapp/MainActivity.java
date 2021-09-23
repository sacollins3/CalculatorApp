package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void addFunction(View view) {
        EditText textView1 = (EditText) findViewById(R.id.textView1);
        EditText textView2 = (EditText) findViewById(R.id.textView2);
        int num1 = Integer.parseInt(textView1.getText().toString());
        int num2 = Integer.parseInt(textView2.getText().toString());
        int val = num1 + num2;
        String value = String.valueOf((val));
        goToActivity2(value);
    }

    public void subFunction(View view) {
        EditText textView1 = (EditText) findViewById(R.id.textView1);
        EditText textView2 = (EditText) findViewById(R.id.textView2);
        int num1 = Integer.parseInt(textView1.getText().toString());
        int num2 = Integer.parseInt(textView2.getText().toString());
        int val = num1 - num2;
        String value = String.valueOf((val));
        goToActivity2(value);
    }

    public void multFunction(View view) {
        EditText textView1 = (EditText) findViewById(R.id.textView1);
        EditText textView2 = (EditText) findViewById(R.id.textView2);
        int num1 = Integer.parseInt(textView1.getText().toString());
        int num2 = Integer.parseInt(textView2.getText().toString());
        int val = num1 * num2;
        String value = String.valueOf((val));
        goToActivity2(value);
    }

    public void divFunction(View view) {
        EditText textView1 = (EditText) findViewById(R.id.textView1);
        EditText textView2 = (EditText) findViewById(R.id.textView2);
        int num1 = Integer.parseInt(textView1.getText().toString());
        int num2 = Integer.parseInt(textView2.getText().toString());
        int val = num1 / num2;
        String value = String.valueOf((val));
        goToActivity2(value);
    }

    public void goToActivity2(String val) {
        Intent intent = new Intent (this, MainActivity2.class);
        intent.putExtra("val", val);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
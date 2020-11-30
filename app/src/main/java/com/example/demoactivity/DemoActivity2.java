package com.example.demoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class DemoActivity2 extends AppCompatActivity {
    TextView textView,textview1,textView2,textView3,textView4;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);
        textView=(TextView) findViewById(R.id.userName);
        textview1=(TextView) findViewById(R.id.emailuser);
        textView2=(TextView) findViewById(R.id.address);
        textView3=(TextView) findViewById(R.id.ItemName);
        textView4=(TextView) findViewById(R.id.itmprice);
        textView.setText("Name:          "+getIntent().getStringExtra("Key"));
        textview1.setText("Email:        "+getIntent().getStringExtra("Email"));
        textView2.setText("Address:      "+getIntent().getStringExtra("Address"));
       textView3.setText("Item Name:     "+getIntent().getStringExtra("ItemV"));
       textView4.setText("Item Price:    "+getIntent().getStringExtra("Price"));
    }
}
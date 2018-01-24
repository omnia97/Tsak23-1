package com.example.asus.task23;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        TextView name = (TextView) findViewById(R.id.text1);
        TextView number = (TextView) findViewById(R.id.textView2);
        name.setText(getIntent().getExtras().getString("name"));
        number.setText(getIntent().getExtras().getString("number"));

    }
}

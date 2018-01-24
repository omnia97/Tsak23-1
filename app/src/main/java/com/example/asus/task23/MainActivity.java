package com.example.asus.task23;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final  EditText et = (EditText) findViewById(R.id.edit1);
       final  EditText et1 = (EditText) findViewById(R.id.editText2);

        final Button showData = (Button) findViewById(R.id.button);

        showData.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this, FirstActivity.class);
                    i.putExtra("name", et.getText().toString());
                    i.putExtra("number", et1.getText().toString());
                    startActivity(i);


                }

                                    }

        );
    }
    }
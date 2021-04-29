package com.cookandroid.myapplication0423_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Main2Activity extends AppCompatActivity {
    Button pre1, next1;
    ViewFlipper vf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        pre1 = (Button) findViewById(R.id.pre1);
        next1 = (Button) findViewById(R.id.next1);
        vf = (ViewFlipper) findViewById(R.id.vf);
        pre1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vf.showPrevious();
            }
        });
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vf.showNext();
            }
        });

        Button backbtn1 = (Button) findViewById(R.id.Btn2Back);
        backbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

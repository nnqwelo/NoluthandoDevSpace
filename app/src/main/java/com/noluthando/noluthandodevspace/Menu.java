package com.noluthando.noluthandodevspace;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {
    Button btn1, btn2,btn3, btn4;
    TextView textView1,textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        textView1 = findViewById(R.id.textView4);
        textView1.setText("Dear");

        textView3 = findViewById(R.id.textView);
        textView3.setText(getIntent().getStringExtra("KEY"));

        textView2 = findViewById(R.id.textView5);

        btn1 = findViewById(R.id.btnHome);
        btn2 = findViewById(R.id.btnCalculation);
        btn3 = findViewById(R.id.btnAboutMe);
        btn4 = findViewById(R.id.btnMyDevProfile);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, MainActivity.class);
                startActivity(intent);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Calculation.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, AboutMe.class);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, MyDevProfile.class);
                startActivity(intent);

            }
        });

    }

}


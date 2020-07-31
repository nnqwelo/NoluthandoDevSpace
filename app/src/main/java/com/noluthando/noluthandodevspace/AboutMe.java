package com.noluthando.noluthandodevspace;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutMe extends AppCompatActivity {
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        ImageButton imageButton = findViewById(R.id.imageButton2);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutMe.this, Menu.class);
                startActivity(intent);

            }
        });

        textView = findViewById(R.id.textViewAboutMe);
        textView.setText("Good day. My name is Noluthando  Nqwelo. " +
                "I am a part time student at CPUT." +
                "I major in Applications Development and doing my final year. " +
                "In future, I hope I inspire more black females to be coders as well. " +
                "I love learning knew things about myself and the world around me.");

    }
}



package com.noluthando.noluthandodevspace;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class Calculation extends AppCompatActivity {

    Button btn;
    EditText mValueOne, mValueTwo;
    ImageButton imageButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);

        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calculation.this, Menu.class);
                startActivity(intent);

            }
        });

        btn = findViewById(R.id.btnCalculation);
        mValueOne = findViewById(R.id.editText3);
        mValueTwo = findViewById(R.id.editText2);

        btn.setOnClickListener(new View.OnClickListener(){
                @Override
                    public void onClick(View v) {
                    int result = Integer.parseInt(mValueTwo.getText().toString()) / Integer.parseInt(mValueOne.getText().toString());
                    Log.v("EditText", "result is " + result);

                    Toast.makeText(getApplicationContext(), "result is " + result,
                            Toast.LENGTH_LONG).show();
                }

                        });

                }




}





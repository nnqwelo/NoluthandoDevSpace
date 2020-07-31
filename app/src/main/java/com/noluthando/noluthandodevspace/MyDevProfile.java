package com.noluthando.noluthandodevspace;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MyDevProfile extends AppCompatActivity {

    ListView listView;
    Context context;
    ArrayList proName;

    public static final Integer[] proImages = {
            R.drawable.profile, R.drawable.telephone, R.drawable.email, R.drawable.instagram, R.drawable.linkedin
    };

    public static String[] proNames = new String[]{
            "Noluthando Nqwelo", "0624572320", "noluthando.nqwelo@gmail.com", "thando_nqwelo", "Noluthando Nqwelo"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dev_profile);

        ImageButton imageButton = findViewById(R.id.imageButton3);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyDevProfile.this, Menu.class);
                startActivity(intent);
            }
        });


        MyListViewAdapter adapter = new MyListViewAdapter(this, proNames, proImages);
        listView = findViewById(R.id.listView2);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MyDevProfile.this, "You clicked on:" + proNames[position], Toast.LENGTH_SHORT).show();

            }
        });

    }
}






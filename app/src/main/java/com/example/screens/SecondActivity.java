package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String name = extras.getString("name");
            int number = extras.getInt("number");
            String text = extras.getString("text");
            TextView myText = findViewById(R.id.myActivityText);
            myText.setText(name+ " " + number);

            TextView getText = findViewById(R.id.textR);
            getText.setText(text);
        }


    }
}
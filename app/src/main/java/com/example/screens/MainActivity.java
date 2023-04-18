package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.myButton);
        final EditText txt = findViewById(R.id.editTextBox);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getText = txt.getText().toString();
                Intent startNewActivity = new Intent(MainActivity.this, SecondActivity.class);
                startNewActivity.putExtra("name", "Fia");
                startNewActivity.putExtra("number", 3);
                startNewActivity.putExtra("text", getText);
                startActivity(startNewActivity);
            }
        });
    }
}

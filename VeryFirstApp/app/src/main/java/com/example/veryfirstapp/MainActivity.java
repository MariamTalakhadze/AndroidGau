package com.example.veryfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startSecondActivity();
        StartPercentage();
    }
    private void startSecondActivity(){
        Button button = findViewById(R.id.Calculator);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, calculatorActivity.class);
                startActivity(intent);
            }

        });
    }
    private void StartPercentage(){
        Button button = findViewById(R.id.percentage);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, percentageActivity.class);
                startActivity(intent);
            }

        });
    }
}

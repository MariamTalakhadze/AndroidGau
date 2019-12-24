package com.example.md2mariamtalakhadze;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn  = findViewById(R.id.start);
        btn.setOnClickListener(v->{
            Intent intent = new Intent(this, GameActivity.class);
            intent.putExtra("score" , 100);
            startActivity(intent);
        });

    }
}

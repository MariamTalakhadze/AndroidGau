package com.example.md2mariamtalakhadze;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class GameoverActivity extends AppCompatActivity {
    private String score;
    private TextView Score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameover);

        Bundle extras = getIntent().getExtras();
        score = extras.getString("score");
        Score = findViewById(R.id.gameoverscorefinal);
        Score.setText(score+"");

    }
}

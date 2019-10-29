package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = findViewById(R.id.Name);
        Login = findViewById(R.id.Login);
        if(Name.getText().toString()!= null ){
            Login.setOnClickListener(v->{
                Intent intent = new Intent(this, QuizActivity.class);
                startActivity(intent);
            });
        }else{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }



}


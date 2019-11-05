package com.example.midtermapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.midtermapplication.Model.Persons;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LoginForActivity extends AppCompatActivity {
    private EditText email, password;
    private Button Login;
    private String Email, Password;
    private ArrayList<Persons> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_for);
        email = findViewById(R.id.LoginEmail);
        password = findViewById(R.id.PasswordLogin);
        Login = findViewById(R.id.Login_ID);
        Email = getIntent().getStringExtra("Email")+"";
        Password = getIntent().getStringExtra("Password")+"";
        Toast.makeText(getApplicationContext(),Password,Toast.LENGTH_SHORT).show();
        Login.setOnClickListener(v->{
            if(Email.equals(email.getText().toString()+"") && Password.equals(password.getText().toString()+"")){
            Intent intent = new Intent(this, ActionActivity.class);
            startActivity(intent);
//                Toast.makeText(getApplicationContext(),"Fill All fields Correctly",Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(getApplicationContext(),"wrong email or password" ,Toast.LENGTH_SHORT).show();
            }
        });





    }
}

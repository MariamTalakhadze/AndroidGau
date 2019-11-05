package com.example.midtermapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.midtermapplication.Model.Persons;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private EditText Email, Name, Password, Password2;
    private Button RegisterBtn, male, female;
    private String Gender;
    private ArrayList<Persons> List = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Email = findViewById(R.id.Email);
        Name = findViewById(R.id.Name);
        Password = findViewById(R.id.password);
        Password2 = findViewById(R.id.password2);
        RegisterBtn = findViewById(R.id.RegisterButton);
        male = findViewById(R.id.male);
        female= findViewById(R.id.Female);
        male.setOnClickListener(v->{
            Gender = "male";
            female.setBackgroundColor(Color.RED);
            male.setBackgroundColor(Color.GREEN);
        });
        female.setOnClickListener(v->{
            Gender = "Female";
            female.setBackgroundColor(Color.GREEN);
            male.setBackgroundColor(Color.RED);
        });
        RegisterBtn.setOnClickListener(v-> {
            SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
            Date date = new Date(System.currentTimeMillis());
            String datetime = formatter.format(date);


//            System.out.println(formatter.format(date));
            Boolean EmailVerification = Email.getText().toString().indexOf('@')>=0;
            if(EmailVerification &&  Password.getText().toString().equals(Password2.getText().toString()) && Gender!= null ){
                List.add(new Persons( Email.getText().toString(), Name.getText().toString(), Password.getText().toString(), datetime, Gender));
                Intent intent = new Intent(this, LoginForActivity.class);
                Persons data = List.get(0);
                String data1= ""+data.getEmail()+"" ;
                String data2 = ""+data.getPassword()+"";
                intent.putExtra("Email", data1);
                intent.putExtra("Password", data2);
                startActivity(intent);
            }else{
                Toast.makeText(getApplicationContext(),"Fill All fields Correctly",Toast.LENGTH_SHORT).show();
            }
//            if(EmailVerification &&  Password.getText().toString().equals(Password2.getText().toString()) && Gender!=null){
////                List.add(new Persons( email, Name.toString(), Password.toString(), datetime, Gender));
//                Intent intent  = new Intent(this, LoginForActivity.class);
////                intent.putExtra("persons", List);
//                startActivity(intent);
//            }else{
//                Toast.makeText(getApplicationContext(),"Fill All fields Correctly",Toast.LENGTH_SHORT).show();
//            }



        });






    }
}

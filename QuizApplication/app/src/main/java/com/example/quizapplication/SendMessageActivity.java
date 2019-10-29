package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SendMessageActivity extends AppCompatActivity {
    private Button Send;
    private EditText MobileNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        MobileNumber = findViewById(R.id.MobileNumber);
        Send = findViewById(R.id.SendInfo);
        Send.setOnClickListener(v->{
            Uri uri = Uri.parse("smsto:"+MobileNumber.getText().toString());
            Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
            intent.putExtra("sms_body", "Succesfully Passed , Score: "+getIntent().getSerializableExtra("score")+"");
            startActivity(intent);
        });


    }
}

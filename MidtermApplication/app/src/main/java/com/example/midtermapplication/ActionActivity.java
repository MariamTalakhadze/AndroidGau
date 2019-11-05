package com.example.midtermapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ActionActivity extends AppCompatActivity {
    private Button Call, Text;
    private EditText number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);
        Call = findViewById(R.id.call);
        Text = findViewById(R.id.text);
        number = findViewById(R.id.number);
        Call.setOnClickListener(v->{
            String number2 = number.getText().toString();
            Uri call = Uri.parse("tel:" + number2);
            Intent intent = new Intent(Intent.ACTION_DIAL, call);
            startActivity(intent);

        });
        Text.setOnClickListener(v->{
            Uri uri = Uri.parse("smsto:"+number.getText().toString());
            Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
            intent.putExtra("sms_body", "Succesfully Passed");
            startActivity(intent);
        });

    }
}

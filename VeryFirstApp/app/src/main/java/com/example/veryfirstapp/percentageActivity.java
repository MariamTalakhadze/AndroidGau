package com.example.veryfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class percentageActivity extends AppCompatActivity{
    EditText month;
    Integer monthinp;
    EditText percent;
    Integer percentinp;
    TextView result;
    EditText money;
    Integer moneyinp;
    Button btn;
    int res1;
    int res2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentage);
        month = (EditText)findViewById(R.id.month);
        percent = (EditText)findViewById(R.id.percent);
        money = (EditText)findViewById(R.id.money);
        result = (TextView)findViewById(R.id.result);
        btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    monthinp = Integer.valueOf(month.getText().toString());
                    moneyinp = Integer.valueOf(money.getText().toString());
                    percentinp = Integer.valueOf(percent.getText().toString());
                    res1 = moneyinp+((moneyinp*percentinp/100)*monthinp);
                    res2 = moneyinp;
                    for(int i=0; i<monthinp; i++){
                        res2+=(res2*percentinp/100);
                    }
                    result.setText(res1+" მარტივი"+" --"+" რთული"+res2);

            }
        });

    }

}

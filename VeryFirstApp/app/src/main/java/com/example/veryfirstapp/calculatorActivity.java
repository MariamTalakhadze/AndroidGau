package com.example.veryfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class calculatorActivity extends AppCompatActivity implements View.OnClickListener {
    private boolean ispressed = false;
    private double  firstnumber = 0;
    private int secondnumberindex  =0;
    private char currentop ;
    private String screenContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        calculatoraction();
    }

    private void calculatoraction() {
        Button n0 = findViewById(R.id.n0);
        Button n1 = findViewById(R.id.n1);
        Button n2 = findViewById(R.id.n2);
        Button n3 = findViewById(R.id.n3);
        Button n4 = findViewById(R.id.n4);
        Button n5 = findViewById(R.id.n5);
        Button n6 = findViewById(R.id.n6);
        Button n7 = findViewById(R.id.n7);
        Button n8 = findViewById(R.id.n8);
        Button n9 = findViewById(R.id.n9);
        Button clear = findViewById(R.id.clear);
        Button square = findViewById(R.id.square);
        Button pow = findViewById(R.id.pow);
        Button devide = findViewById(R.id.divide);
        Button multiply = findViewById(R.id.multiply);
        Button minus = findViewById(R.id.minus);
        Button plus = findViewById(R.id.plus);
        Button equals = findViewById(R.id.equals);
        Button dot = findViewById(R.id.dot);
        Button plusminus = findViewById(R.id.plusminus);
        TextView Calculatorscreen = findViewById(R.id.calculatorscreen);
        n0.setOnClickListener(this);
        n1.setOnClickListener(this);
        n2.setOnClickListener(this);
        n3.setOnClickListener(this);
        n4.setOnClickListener(this);
        n5.setOnClickListener(this);
        n6.setOnClickListener(this);
        n7.setOnClickListener(this);
        n8.setOnClickListener(this);
        n9.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        plusminus.setOnClickListener(this);
        equals.setOnClickListener(this);
        multiply.setOnClickListener(this);
        devide.setOnClickListener(this);
        pow.setOnClickListener(this);
        square.setOnClickListener(this);
        clear.setOnClickListener(this);
        dot.setOnClickListener(this);

    }
        @Override
        public void onClick(View v) {
            TextView calculatorscreen = findViewById(R.id.calculatorscreen);
            switch (v.getId()) {
                case R.id.n0:
                    calculatorscreen.append("0");
                    break;
                case R.id.n1:
                    calculatorscreen.append("1");
                    break;

                case R.id.n2:
                    calculatorscreen.append("2");
                    break;
                case R.id.n3:
                    calculatorscreen.append("3");
                    break;
                case R.id.n4:
                    calculatorscreen.append("4");
                    break;
                case R.id.n5:
                    calculatorscreen.append("5");
                    break;
                case R.id.n6:
                    calculatorscreen.append("6");
                    break;
                case R.id.n7:
                    calculatorscreen.append("7");
                    break;
                case R.id.n8:
                    calculatorscreen.append("8");
                    break;
                case R.id.n9:
                    calculatorscreen.append("9");
                    break;
                case R.id.clear:
                    calculatorscreen.setText("");
                    break;
                case R.id.square:
                    screenContext = calculatorscreen.getText().toString();
                    firstnumber = Double.parseDouble(screenContext);
                    secondnumberindex = screenContext.length()+1;
                    calculatorscreen.append("^2");
                    ispressed = true;
                    currentop = ']';
                    break;
                case R.id.pow:
                    screenContext = calculatorscreen.getText().toString();
                    firstnumber = Double.parseDouble(screenContext);
                    secondnumberindex = screenContext.length()+1;
                    calculatorscreen.append("^");
                    ispressed = true;
                    currentop = '^';
                    break;
                case R.id.divide:
                    screenContext = calculatorscreen.getText().toString();
                    firstnumber = Double.parseDouble(screenContext);
                    secondnumberindex = screenContext.length()+1;
                    calculatorscreen.append("/");
                    ispressed = true;
                    currentop = '/';
                    break;
                case R.id.multiply:
                    screenContext = calculatorscreen.getText().toString();
                    firstnumber = Double.parseDouble(screenContext);
                    secondnumberindex = screenContext.length()+1;
                    calculatorscreen.append("X");
                    ispressed = true;
                    currentop = '*';
                    break;
                case R.id.minus:
                    screenContext = calculatorscreen.getText().toString();
                    firstnumber = Double.parseDouble(screenContext);
                    secondnumberindex = screenContext.length()+1;
                    calculatorscreen.append("-");
                    ispressed = true;
                    currentop = '-';
                    break;
                case R.id.plus:
                    screenContext = calculatorscreen.getText().toString();
                    firstnumber = Double.parseDouble(screenContext);
                    secondnumberindex = screenContext.length()+1;
                    calculatorscreen.append("+");
                    ispressed = true;
                    currentop = '+';
                    break;
                case R.id.equals:
                    if(ispressed){
                        screenContext = calculatorscreen.getText().toString();
                        double secondnumber = Double.parseDouble(screenContext.substring(secondnumberindex, screenContext.length()));
                        if(currentop=='+'){
                            secondnumber+=firstnumber;
                            calculatorscreen.setText(String.valueOf(secondnumber));
                        }else if(currentop=='-'){
                                firstnumber-=secondnumber;
                                calculatorscreen.setText(String.valueOf(firstnumber));
                        }else if(currentop=='*'){

                            firstnumber*=secondnumber;
                            calculatorscreen.setText(String.valueOf(firstnumber));
                        }else if(currentop=='/'){

                            firstnumber/=secondnumber;
                            calculatorscreen.setText(String.valueOf(firstnumber));
                        }else if(currentop=='^'){

                            firstnumber=Math.pow(firstnumber, secondnumber);
                            calculatorscreen.setText(String.valueOf(firstnumber));
                        }else if(currentop==']'){

                            firstnumber=Math.pow(firstnumber, 2);
                            calculatorscreen.setText(String.valueOf(firstnumber));
                        }
                    }
                    break;
                case R.id.dot:
                    calculatorscreen.append(".");
                    break;
                case R.id.plusminus:
                    calculatorscreen.append("-");
                    break;

            }
        }
}

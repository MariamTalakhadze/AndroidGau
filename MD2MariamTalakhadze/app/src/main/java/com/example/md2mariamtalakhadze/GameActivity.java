package com.example.md2mariamtalakhadze;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Random;

public class GameActivity extends AppCompatActivity {
    private int score;
    private TextView Score;
    private Button n1;
    private Button n2;
    private Button n3;
    private Button n4;
    private Button n5;
    private Button n6;
    private Button n7;
    private Button n8;
    private Button n9;
    private Button Finish;
    private String[] WNL= new String[]{"W", "N", "L"};
    Random r = new Random();
    int random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        int random ;
        Bundle extras = getIntent().getExtras();
        score = extras.getInt("score");
        Score = findViewById(R.id.Score);
        Score.setText("score: "+score);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);
        n5 = findViewById(R.id.n5);
        n6 = findViewById(R.id.n6);
        n7 = findViewById(R.id.n7);
        n8 = findViewById(R.id.n8);
        n9 = findViewById(R.id.n9);
        Finish  = findViewById(R.id.finish);

        n1.setOnClickListener(v->{
            makeRandomText();

        });
        n1.setOnClickListener(v->{
            makeRandomText();
            if(n1.getText()=="W"){
                score+=5;
                if(n2.getText()=="W"){
                    score+=5;
                }
                if(n4.getText()=="W"){
                    score+=5;
                }
            }
            if(n1.getText()=="L"){
                score-=5;
                if(score<5){
                    openintent(score+"Gela, Pay to Play More");
                }
                if(n2.getText()=="L"){
                    score-=5;
                }
                if(n4.getText()=="L"){
                    score-=5;
                }
            }
            if(n1.getText()=="N"){
                score-=1;
                if(n2.getText()=="N"){
                    score-=1;
                }
                if(n4.getText()=="N"){
                    score-=1;
                }
            }

            Score.setText("score: "+score);
            clearnumbers();
        });
        n2.setOnClickListener(v->{
            makeRandomText();
            if(n2.getText()=="W"){
                score+=5;
                if(n1.getText()=="W"){
                    score+=5;
                }
                if(n3.getText()=="W"){
                    score+=5;
                }
                if(n5.getText()=="W"){
                    score+=5;
                }
            }
            if(n2.getText()=="L"){
                score-=5;
                if(score<5){
                    openintent(score+"Gela, Pay to Play More");
                }
                if(n1.getText()=="L"){
                    score-=5;
                }
                if(n3.getText()=="L"){
                    score-=5;
                }
                if(n5.getText()=="L"){
                    score-=5;
                }
            }
            if(n2.getText()=="N"){
                score-=1;
                if(n1.getText()=="N"){
                    score-=1;
                }
                if(n3.getText()=="N"){
                    score-=1;
                }
                if(n5.getText()=="N"){
                    score-=1;
                }
            }
            Score.setText("score: "+score);
            clearnumbers();
        });
        n3.setOnClickListener(v->{
            makeRandomText();
            if(n3.getText()=="W"){
                score+=5;
                if(n2.getText()=="W"){
                    score+=5;
                }
                if(n6.getText()=="W"){
                    score+=5;
                }
            }
            if(n3.getText()=="L"){
                score-=5;
                if(score<5){
                    openintent(score+"Gela, Pay to Play More");
                }
                if(n2.getText()=="L"){
                    score-=5;
                }
                if(n6.getText()=="L"){
                    score-=5;
                }
            }
            if(n3.getText()=="N"){
                score-=1;
                if(n2.getText()=="N"){
                    score-=1;
                }
                if(n6.getText()=="N"){
                    score-=1;
                }
            }
            Score.setText("score: "+score);
            clearnumbers();
        });
        n4.setOnClickListener(v->{
            makeRandomText();
            if(n4.getText()=="W"){
                score+=5;
                if(n1.getText()=="W"){
                    score+=5;
                }
                if(n5.getText()=="W"){
                    score+=5;
                }
                if(n7.getText()=="W"){
                    score+=5;
                }
            }
            if(n4.getText()=="L"){
                score-=5;
                if(score<5){
                    openintent(score+"Gela, Pay to Play More");
                }
                if(n1.getText()=="L"){
                    score-=5;
                }
                if(n5.getText()=="L"){
                    score-=5;
                }
                if(n7.getText()=="L"){
                    score-=5;
                }
            }
            if(n4.getText()=="N"){
                score-=1;
                if(n1.getText()=="N"){
                    score-=1;
                }
                if(n5.getText()=="N"){
                    score-=1;
                }
                if(n7.getText()=="N"){
                    score-=1;
                }
            }
            Score.setText("score: "+score);
            clearnumbers();
        });
        n5.setOnClickListener(v->{
            makeRandomText();
            if(n5.getText()=="W"){
                score+=5;
                if(n4.getText()=="W" ){
                    score+=5;
                }
                if(n6.getText()=="W" ){
                    score+=5;
                }
                if(n2.getText()=="W" ){
                    score+=5;
                }
                if(n8.getText()=="W" ){
                    score+=5;
                }
            }
            if(n5.getText()=="L"){
                score-=5;
                if(score<5){
                    openintent(score+"Gela, Pay to Play More");
                }
                if(n4.getText()=="L" ){
                    score-=5;
                }
                if(n6.getText()=="L" ){
                    score-=5;
                }
                if(n2.getText()=="L" ){
                    score-=5;
                }
                if(n8.getText()=="L" ){
                    score-=5;
                }
            }
            if(n5.getText()=="N"){
                score-=1;
                if(n4.getText()=="N" ){
                    score-=1;
                }
                if(n6.getText()=="N" ){
                    score-=1;
                }
                if(n2.getText()=="N" ){
                    score-=1;
                }
                if(n8.getText()=="N" ){
                    score-=1;
                }
            }
            Score.setText("score: "+score);
            clearnumbers();
        });
        n6.setOnClickListener(v->{
            makeRandomText();
            if(n6.getText()=="W"){
                score+=5;
                if(n9.getText()=="W" ){
                    score+=5;
                }
                if(n3.getText()=="W" ){
                    score+=5;
                }
                if(n5.getText()=="W" ){
                    score+=5;
                }
            }
            if(n6.getText()=="L"){
                score-=5;
                if(score<5){
                    openintent(score+"Gela, Pay to Play More");
                }
                if(n9.getText()=="L" ){
                    score-=5;
                }
                if(n3.getText()=="L" ){
                    score-=5;
                }
                if(n5.getText()=="L" ){
                    score-=5;
                }
            }
            if(n6.getText()=="N"){
                score-=1;
                if(n9.getText()=="N" ){
                    score-=1;
                }
                if(n3.getText()=="N" ){
                    score-=1;
                }
                if(n5.getText()=="N" ){
                    score-=1;
                }
            }
            Score.setText("score: "+score);
            clearnumbers();
        });
        n7.setOnClickListener(v->{
            makeRandomText();
            if(n7.getText()=="W"){
                score+=5;
                if(n8.getText()=="W" ){
                    score+=5;
                }
                if(n4.getText()=="W" ){
                    score+=5;
                }
            }
            if(n7.getText()=="L"){
                score-=5;
                if(score<5){
                    openintent(score+"Gela, Pay to Play More");
                }
                if(n8.getText()=="L" ){
                    score-=5;
                }
                if(n4.getText()=="L" ){
                    score-=5;
                }
            }
            if(n7.getText()=="N"){
                score-=1;
                if(n8.getText()=="N" ){
                    score-=1;
                }
                if(n4.getText()=="N" ){
                    score-=1;
                }
            }
            Score.setText("score: "+score);
            clearnumbers();
        });
        n8.setOnClickListener(v->{
            makeRandomText();
            if(n8.getText()=="W"){
                score+=5;
                if(n7.getText()=="W" ){
                    score+=5;
                }
                if(n9.getText()=="W" ){
                    score+=5;
                }
                if(n5.getText()=="W" ){
                    score+=5;
                }
            }
            if(n8.getText()=="L"){
                score-=5;
                if(score<5){
                    openintent(score+"Gela, Pay to Play More");
                }
                if(n7.getText()=="L" ){
                    score-=5;
                }
                if(n9.getText()=="L" ){
                    score-=5;
                }
                if(n5.getText()=="L" ){
                    score-=5;
                }
            }
            if(n8.getText()=="N"){
                score-=1;
                if(n7.getText()=="N" ){
                    score-=1;
                }
                if(n9.getText()=="N" ){
                    score-=1;
                }
                if(n5.getText()=="N" ){
                    score-=1;
                }
            }
            Score.setText("score: "+score);
            clearnumbers();
        });
        n9.setOnClickListener(v->{
            makeRandomText();
            if(n9.getText()=="W"){
                score+=5;
                if(n8.getText()=="W" ){
                    score+=5;
                }
                if(n6.getText()=="W" ){
                    score+=5;
                }
            }
            if(n9.getText()=="L"){
                score-=5;
                if(score<5){
                    openintent(score+"Gela, Pay to Play More");
                }
                if(n8.getText()=="L" ){
                    score-=5;
                }
                if(n6.getText()=="L" ){
                    score-=5;
                }
            }
            if(n9.getText()=="N"){
                score-=1;
                if(n8.getText()=="N" ){
                    score-=1;
                }
                if(n6.getText()=="N" ){
                    score-=1;
                }
            }
            Score.setText("score: "+score);
            clearnumbers();
        });
        if(score<5){
            openintent(score+"Gela, Pay to Play More");
        }
        Finish.setOnClickListener(v->{
            openintent(score+"Gela");
        });
    }
    private void openintent(String text){
        Intent intent = new Intent(this, GameoverActivity.class);
        intent.putExtra("score", text+"");
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
    private void makeRandomText(){
        random = r.nextInt(3);
        n1.setText(WNL[random]);
        random = r.nextInt(3);
        n2.setText(WNL[random]);
        random = r.nextInt(3);
        n3.setText(WNL[random]);
        random = r.nextInt(3);
        n4.setText(WNL[random]);
        random = r.nextInt(3);
        n5.setText(WNL[random]);
        random = r.nextInt(3);
        n6.setText(WNL[random]);
        random = r.nextInt(3);
        n7.setText(WNL[random]);
        random = r.nextInt(3);
        n8.setText(WNL[random]);
        random = r.nextInt(3);
        n9.setText(WNL[random]);
    }
    private void clearnumbers(){
        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        n1.setText("1");
                        n2.setText("2");
                        n3.setText("3");
                        n4.setText("4");
                        n5.setText("5");
                        n6.setText("6");
                        n7.setText("7");
                        n8.setText("8");
                        n9.setText("9");
                    }
                },
                900);

    }

}

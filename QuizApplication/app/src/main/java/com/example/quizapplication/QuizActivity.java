package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.quizapplication.Models.QuizzModel;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {
    private ArrayList<QuizzModel> Quiz = new ArrayList<>();
    private TextView Question, questioncounter, correctanswer;
    private Button answer1;
    private Button answer2;
    private int counter;
    private int correct =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        questioncounter=findViewById(R.id.questioncounter);
        Question = findViewById(R.id.textid);
        answer2 = findViewById(R.id.answerbtn2);
        answer1 = findViewById(R.id.answerbtn1);
        correctanswer = findViewById(R.id.correct);
        Quiz.add(new QuizzModel(1, "kitxva1?", "sworipasuxi1", "arasworipasuxi1", "sworipasuxi1"));
        Quiz.add(new QuizzModel(2, "kitxva2?", "sworipasuxi1", "arasworipasuxi1", "sworipasuxi1"));
        Quiz.add(new QuizzModel(3, "kitxva3?", "arasworipasuxi1", "sworipasuxi1", "sworipasuxi1"));
        Quiz.add(new QuizzModel(4, "kitxva4?", "sworipasuxi1", "arasworipasuxi1", "sworipasuxi1"));
        Quiz.add(new QuizzModel(5, "kitxva5?", "arasworipasuxi1", "sworipasuxi1", "sworipasuxi1"));
        Quiz.add(new QuizzModel(6, "kitxva6?", "arasworipasuxi1", "sworipasuxi1", "sworipasuxi1"));
        Quiz.add(new QuizzModel(7, "kitxva7?", "sworipasuxi1", "arasworipasuxi1", "sworipasuxi1"));
        counter = 0;
        loadData(counter);



    }
    public void loadData(int n){
        QuizzModel  q = Quiz.get(n);
        if(q !=null){
            questioncounter.setText(""+(counter+1)+"/"+Quiz.size());
            correctanswer.setText("Correct: "+ correct+"");
            Question.setText(""+q.getQuestion()+"");
            answer1.setText(""+q.getAswer1()+"");
            answer2.setText(""+q.getAnswer2()+"");
            answer1.setOnClickListener(v->{
                if(answer1.getText().equals(q.getCorrectAnswerIndex())){
                    correct+=1;
                }
                counter++;
                if(counter<Quiz.size()){
                    loadData(counter);
                }else{
                    if(correct<5){
                        counter=0;
                        correct=0;
                        loadData(counter);
                    }else{
                        Intent intent = new Intent(this, SendMessageActivity.class);
                        intent.putExtra("score", correct);
                        startActivity(intent);

                    }
                }

            });
            answer2.setOnClickListener(v->{
                if(answer2.getText().equals(q.getCorrectAnswerIndex())){
                    correct+=1;
                }
                counter++;
                if(counter<Quiz.size()){
                    loadData(counter);
                }else{
                    if(correct<5){
                        counter=0;
                        correct=0;
                        loadData(counter);
                    }else{
                        Intent intent = new Intent(this, SendMessageActivity.class);
                        intent.putExtra("score", correct);
                        startActivity(intent);
//                        Uri uri = Uri.parse("smsto:"+555555555);
//                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
//                        intent.putExtra("sms_body", "Succesfully Passed");
//                        startActivity(intent);

                    }

                }

            });
        }

    }
}

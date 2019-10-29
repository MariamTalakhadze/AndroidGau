package com.example.quizapplication.Models;

import java.io.Serializable;

public class QuizzModel implements Serializable {
    private int id;
    private String Question;
    private String Aswer1;
    private String Answer2;
    private String CorrectAnswerIndex;

    public QuizzModel(int id, String question, String aswer1, String answer2, String correctAnswerIndex) {
        this.id = id;
        Question = question;
        Aswer1 = aswer1;
        Answer2 = answer2;
        CorrectAnswerIndex = correctAnswerIndex;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return Question;
    }

    public String getAswer1() {
        return Aswer1;
    }

    public String getAnswer2() {
        return Answer2;
    }

    public String getCorrectAnswerIndex() {
        return CorrectAnswerIndex;
    }
}

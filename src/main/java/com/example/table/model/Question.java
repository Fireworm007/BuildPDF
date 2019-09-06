package com.example.table.model;

import javax.persistence.*;

/**
 * @ClassName Question
 * @Description
 * @Author jianquan.liang
 * @Date 9/3/2019 3:10 PM
 * @Version 1.0
 **/
@Entity
@Table(name = "BRIEFING_ITEM_QUIZ")
public class Question {
    @Id
    @GeneratedValue
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "BRIEFING_ITEM_ID")
    private BriefingItem briefingItem;

    private String question;
    private String answer_1;
    private String answer_2;
    private String answer_3;
    private int correctAnswer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BriefingItem getBriefingItem() {
        return briefingItem;
    }

    public void setBriefingItem(BriefingItem briefingItem) {
        this.briefingItem = briefingItem;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer_1() {
        return answer_1;
    }

    public void setAnswer_1(String answer_1) {
        this.answer_1 = answer_1;
    }

    public String getAnswer_2() {
        return answer_2;
    }

    public void setAnswer_2(String answer_2) {
        this.answer_2 = answer_2;
    }

    public String getAnswer_3() {
        return answer_3;
    }

    public void setAnswer_3(String answer_3) {
        this.answer_3 = answer_3;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", briefingItem=" + briefingItem +
                ", question='" + question + '\'' +
                ", answer_1='" + answer_1 + '\'' +
                ", answer_2='" + answer_2 + '\'' +
                ", answer_3='" + answer_3 + '\'' +
                ", correctAnswer=" + correctAnswer +
                '}';
    }
}

package com.Override;

public class Student extends Person {
    private String id;
    private double score;

    public Student(String name,int age,String id, double score) {
        super(name,age);
        this.id=id;
        this.score=score;
    }
    public String say(){
        return super.say()+("id="+id+"成绩"+score);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

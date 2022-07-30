package com.think.oop.mortgage;

/**
 * @author
 * @version 1.0
 */
public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

   public String say(){
      return "学生"+super.say()+"score="+score;
   }
   public void study(){
       System.out.println("学生在学java......");
   }
}

package com.Homework03;

/**
 * @author
 * @version 1.0
 */
public class Text{
    public static void main(String[] args) {

        Doctor doctor1 = new Doctor("jack", 18, "学生", '男', 1000);
        Doctor doctor2 = new Doctor("jack", 18, "学生", '男', 1000);
        System.out.println(doctor1.equals(doctor2));

    }

}

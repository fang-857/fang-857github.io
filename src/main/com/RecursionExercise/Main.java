package com.RecursionExercise;

/**
 * @author
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("老头", 68);
        System.out.println(person.say());
        Student son = new Student("年轻人", 18, "123456", 89.7);
        System.out.println(son.say());
    }

}

package com.Override;

public class Main {
    public static void main(String[] args) {
        Person son =new Person("张三",18);
        System.out.println(son.say());
        Student su = new Student("老王",30,"123456",89.3);
        System.out.println(su.say());
    }
}

package com.think.oop.mortgage;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

/**
 * @author
 * @version 1.0
 */
public class Person {
    private String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String say(){
        return "name="+name+"age="+age;
    }
}

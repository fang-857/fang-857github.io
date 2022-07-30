package com.think.oop.mortgage;

/**
 * @author
 * @version 1.0
 */
public class Teacher extends Person {
    private int salary;

    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String say(){
        return "老师"+super.say()+"salary="+salary;
    }
    public void teach(){
        System.out.println("老师在交java.....");
    }
}

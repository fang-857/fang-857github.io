package com.Homework03;

/**
 * @author
 * @version 1.0
 */
public class Yuan {
    private double salary;
    private int month;
    private String name;

    public Yuan(double salary, int month, String name) {
        this.salary = salary;
        this.month = month;
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo(){
        System.out.println(name+"全年工资="+salary*month);
    }
}

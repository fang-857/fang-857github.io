package com.Homework03;

/**
 * @author
 * @version 1.0
 */
public class Teacher4 extends Yuan{
    private double bonus;
    private int day;

    public Teacher4(double salary, int month, String name) {
        super(salary, month, name);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }


    @Override
    public void showInfo() {
        System.out.println(getName()+"全年工资="+(getSalary()*getMonth() + bonus*day));
    }
}

package com.Homework03;

/**
 * @author
 * @version 1.0
 */
public class Scientist extends Yuan {
    private double YearBonus;

    public Scientist(double salary, int month, String name) {
        super(salary, month, name);
    }

    public double getYearBonus() {
        return YearBonus;
    }

    public void setYearBonus(double yearBonus) {
        YearBonus = yearBonus;
    }

    @Override
    public void showInfo() {
        System.out.println(getName()+"全年工资="+(getSalary()*getMonth()+getYearBonus()));
    }
}

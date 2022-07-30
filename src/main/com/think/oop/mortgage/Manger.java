package com.think.oop.mortgage;

/**
 * @author
 * @version 1.0
 */
public class Manger extends Employee {
    private int bonus;

    public Manger(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public void manage(){
        System.out.println(getName()+"经理正在制定管理方法。。");
    }

    @Override
    public int getAnnual() {
        return super.getAnnual()+bonus;
    }
}

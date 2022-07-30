package com.think.oop.mortgage;

/**
 * @author
 * @version 1.0
 */
public class P extends Employee {
    public P(String name, int salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println(getName()+"员工正在工作。。");
    }

    @Override
    public int getAnnual() {
        return super.getAnnual();
    }
}

package com.think.oop;

public class Emp {

    private String name;
    private int baseSalary;
    private int extraHours;
    private int hourRate; // 小时工资
    private int wage;

    public Emp (){

    }
    // public Emp(String name, int baseSalary, int extraHours, int hourRate) {
    //     this.name = name;
    //     this.baseSalary = baseSalary;
    //     this.extraHours = extraHours;
    //     this.hourRate = hourRate;
    // }

    public static Emp initEmp(String name, int baseSalary, int extraHours, int hourRate) {
        Emp emp = new Emp();
        emp.setName(name);
        // emp.setBaseSalary(baseSalary);
        // emp.setExtraHours(extraHours);
        // emp.setHourRate(hourRate);
        return emp;
        // return new Emp(name, baseSalary, extraHours, hourRate);
    }

    public void setName(String name) {
        this.name = name;
    }

    private int calcWage() {
        return baseSalary + extraHours * hourRate;
    }

    public void report() {
        System.out.println("Name: " + name);
        // System.out.println("Base Salary: " + baseSalary);
        // System.out.println("Extra Hours: " + extraHours);
        // System.out.println("Hour Rate: " + hourRate);
        System.out.println("Wage: " + calcWage());
    }


    public static void main(String[] args) {
        // Emp emp = new Emp("Jack", 1000, 10, 20);
        // emp.setName("Jack");
        // emp.setName("Jack");
        // emp.setName("Jack");
        Emp emp = Emp.initEmp("Jack", 1000, 10, 20);
        emp.report();
    }

}

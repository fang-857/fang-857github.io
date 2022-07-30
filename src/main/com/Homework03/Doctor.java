package com.Homework03;

/**
 * @author
 * @version 1.0
 */
public class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private int sal;

    public Doctor(String name, int age, String job, char gender, int sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj instanceof Doctor){
            Doctor doctor=(Doctor)obj;
            return this.name.equals(doctor.name) && this.age==doctor.age && this.job.equals(doctor.job) &&
                    this.gender==doctor.gender && this.sal==doctor.sal;
        }
        return false;
    }
}

package com.think.studentsys;

/**
 * 学生管理系统
 *
 * @author think
 */
public class StudentManager {

    private Student[] students; // 数组是Java中最基本的数据容器

    public StudentManager() {
        // students = new Student[10];
        this(10);
    }

    public StudentManager(int defaultSize) {
        students = new Student[defaultSize];
    }

    public StudentManager(int defaultSize, String msg) {
        students = new Student[defaultSize];
    }

    public void showMenu() {
        System.out.println("菜单....");
    }

    public void addStuInfo(){

    }

    public void del() {

    }

    public void run() {
        showMenu();

        // 先制造一些随机数据
        createRandomData();
        showData();
    }

    private void showData() {
        for (Student s : students) {
            // System.out.println(s.getName() + "-" + s.getAge());
            System.out.printf("[%s]:%-2d\r\n" , s.getName(), s.getAge());
        }
    }

    private void createRandomData() {
        for (int i = 0; i < students.length; i++) {
            // Student stu = new Student("学员" + i, i);
            // students[i] = stu;
            students[i] = new Student("学员" + i, i);
        }
    }
}

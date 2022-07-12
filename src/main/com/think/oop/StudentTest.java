package com.think.oop;

public class StudentTest {

    public static void changeValue(Student stu) {
        // 根据0x10，首先定位到堆当中的具体的地址
        // stu.setName("明明");
        stu = new Student();
        stu.setName("明明");
    }

    public static void changeValue(int num) {
        num = 0;
    }

    public static void main(String[] args) {
        // 创建学生这个类型的一个实例
        Student stu1 = new Student();
        // 朴素模式
        // stu.name = "张三";
        stu1.setName("张三");

        changeValue(stu1); // 传递的是一个reference（引用），它实际上就是一个内存地址

        System.out.println(stu1.getName());

        stu1.study("C09");


        int num = 10;
        changeValue(num); // 传递的是stack上这个值（这个值的一个副本）
        System.out.println(num);
        // Student stu2 = new Student();
        // // 朴素模式
        // // stu.name = "张三";
        // stu2.setName("李四");
        //
        // System.out.println(stu2.getName());

    }
}

package com.think.oop;

/**
 * 用来描述学生的类
 * 这个类封装了若干个成员变量（属性），同时也有服务于这两个属性的读和写方法
 * 这个类在Java中还有一些更专业的表述：JavaBean、Plain Original Java Object -> POJO
 * 充血模型（带有复杂算法逻辑的POJO）
 * 这种类型的作用：就是用来承载数据的（含读写数据的方法）
 */
public class Student {

    // 状态、属性、成员变量
    private String name;
    private int age;

    public void study (String roomNum) {
        System.out.println(this.name + "在" +roomNum+ "教室早自习");
    }

    // 读方法 getter
    public String getName() {
        return name;
    }

    // 写方法 setter
    public void setName(String name){
        // 指代当前new的这个学生对象
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

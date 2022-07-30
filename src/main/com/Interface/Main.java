package com.Interface;

public class Main {
    public static void main(String[] args) {
        //创建手机，相机对象
        final Camera camera = new Camera();
        final Phone phone = new Phone();
        //创建计算机
        final Computer computer = new Computer();
        computer.work(phone);//把手机接入计算机
        computer.work(camera);
    }

}

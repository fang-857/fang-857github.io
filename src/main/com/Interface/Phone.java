package com.Interface;

public class Phone implements Usb {
    @Override
    public void start() {
        System.out.println("手机开始工作。。。。");
    }

    @Override
    public void stop() {
        System.out.println("手机关机。。。。。。。。");
    }
}

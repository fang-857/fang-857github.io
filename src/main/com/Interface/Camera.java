package com.Interface;

public class Camera implements Usb{
    @Override
    public void start() {
        System.out.println("相机工作。。");
    }

    @Override
    public void stop() {
        System.out.println("相机没电。" );
    }
}

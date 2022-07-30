package com.think.oop;

/**
 * @author
 * @version 1.0
 */
public class Homework {
    public static void main(String[] args) {

    }
}

class Frock{
    private static  int currentNum=100000;
    private int serialNumber;

    public Frock() {
        serialNumber = getNextNum();
    }

    public static int getNextNum(){
        currentNum+=100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

}
class TextFrock{
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
    }
}
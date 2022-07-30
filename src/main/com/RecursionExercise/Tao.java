package com.RecursionExercise;

/**
 * @author
 * @version 1.0
 */
public class Tao {
    public static void main(String[] args) {
        int day=8;
        Tao ti = new Tao();
        int peachNum=ti.peach(day);
        if(peachNum !=-1){
            System.out.println("第"+day+"天有"+peachNum+"个桃");
        }
    }
    public int peach(int day){
        if(day==10){
            return 1;
        }else if(day>=1 && day<=9){
            return (peach(day+1)+1)*2;
        }else {
            System.out.println("day在1-10");
            return -1;
        }
    }
}

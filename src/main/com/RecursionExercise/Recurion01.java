package com.RecursionExercise;

/**
 * @author
 * @version 1.0
 */
public class Recurion01 {
    public static void main(String[] args) {


        //请使用递归方式求出斐波那契数1，1，2，3，5，8，13.。。。给你一个整数n，求出它的值
        //思路分析
        //当n=1斐波那契额数时1
        //当n=2 斐波那契数时1
        //当n>=3 斐波那契额数是前两个数的和
        //这就是一个递归的思路
        T t1 = new T();
        System.out.println("当n=7对应的斐波那契数="+t1.fibonacci(7));
    }
}
class T{
    public int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        } else {

            System.out.println("要求输入的n>=1的整数");
            return -1;
        }
    }
}
class A02{

}
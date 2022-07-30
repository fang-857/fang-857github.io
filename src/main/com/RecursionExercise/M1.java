package com.RecursionExercise;

/**
 * @author
 * @version 1.0
 */
public class M1 {
    public static void main(String[] args) {
        D d = new D();
        d.move(5,'A','B','C');
    }
}
class D{
    //num 表示要移动的个数 a,b,c分别表示A塔 b塔 c塔
    public void move(int num,char a,char b ,char c){
        //如果只有一个盘 num=1
        if(num==1){
            System.out.println(a+"->"+c);
        }else{
            //如果有多个盘，可以看成2个，最下面和上面所有盘
            //1 先移动上面所有盘到B 借助c
            move(num-1,a,c,b);
            //2  把最下面的盘移动到c
            System.out.println(a+"->"+c);
            //3 把b塔所有盘移动到c ，借助a
            move(num-1,b,a,c);
        }
    }
}

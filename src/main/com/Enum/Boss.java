package com.Enum;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;
import java.util.Scanner;

/**
 * @author fgy
 * @version 1.0
 */public class Boss{
    public static void main(String[] args) {
      //  Random random = new Random(101);
        //int rd = random.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个范围在（0-100）的整数:");
        int sr = scanner.nextInt();
        if(sr<0){
            System.out.println("输入的值不在范围内");
        }else if(sr>=90 && sr<=100){
            System.out.println("成绩优秀");
        }else if(sr>=80 && sr<90){
            System.out.println("成绩良好");
        }else if(sr>=60 && sr<80){
            System.out.println("成绩及格");
        }else{
            System.out.println("成绩不及格");
        }
    }
}
class B{
    public static void main(String[] args) {
        int sum1 = 0;//偶和
        int sum2 = 0;//奇数和
        for (int i = 1; i <=1000 ; i++) {
            if(i%2==0){
                sum1+=i;
            }else{
                sum2+=i;
            }
        }
        System.out.println("偶数和为："+sum1);
        System.out.println("奇数和为："+sum2);
        }
 }
 class A{
     public static void main(String[] args) {
         int  count = 0;
         for (int i = 1; i <=1000 ; i++) {
             if(i%5==0) {
                 System.out.print("\t" + i);
                 count++;

                 if (count % 5 == 0) {
                     System.out.println();
                 }
             }
         }
     }
 }
class C{
    public static void main(String[] args) {
            int count =0;
        for (int i = 10006; i < 100000; i++) {
            if(i%3==0 && i%10==6){
                count++;
            }
        }
        System.out.println(count);
        }
    }

class D {
    public static void main(String[] args) {
        for (int n = 1001; n <= 1111; n++) {
            int a = n % 10;//个
            int b = (n / 10) % 10;//十
            int c = n % 100;//百
            int d = n % 1000;//千
            int n1 = 1;
             while (n1 > 0) {
                  n1 = a * 1000 + b * 100 + c * 10 + d;//反
             }
                 if (n * 9 == n1 && a != 0) {
                    System.out.println(n);
                }
            }
        }
    }
  class E{
      public static void main(String[] args) {
          for (int n = 1000; n <=1111 ; n++) {
              int sum =0;//反序
              int i =n;
              while(i>0){
                  sum=sum*10+i%10;
                  i=i/10;
              }
              if(n*9==sum){
                  System.out.println(n);
              }
          }
      }
  }

       class Test {
          public static void main(String[] args) {
              int a=0;
              int c=0;
              do{
                  --c;
                  a=a-1;
              }while(a>0);
              System.out.println(a+"  "+c);
          }
          }

               class Demo9{

                  public static void main(String[] args){
                      //1.定义一个变量，来统计个数
                      int count=0;
                      String str="";//拼接水仙花数
                      //2.遍历100-999之间的数
                      for(int i=100;i<999;i++){
                          int unit = i%10;//个位数
                          int decade= i/10%10;//十位数
                          int hundred = i/100%10;//百位数
                          int threeSum = unit*unit*unit+decade*decade*decade+hundred*hundred*hundred;
                          if(threeSum==i){
                              //是水仙花数
                              count++;
                              str+=i+"\t";//字符串拼接
                          }
                      }
                      System.out.println("个数："+count+"  水仙花数："+str);

                  }
              }




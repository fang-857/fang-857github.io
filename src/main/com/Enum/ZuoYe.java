package com.Enum;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

/**
 * @author
 * @version 1.0
 */
public class ZuoYe {
    public static void main(String[] args) {
        int sum =0;//定义一个变量求和
        for (int i = 1; i <100 ; i++) {//遍历1-100
            if(i%3!=0){//比较不能被3整除
                sum+=i;//求和
            }
        }
        System.out.println(sum);
    }
}
class A1{
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1000; i <10000 ; i++) {
           int a = i/100;
           int b =i-100*a;
           sum=(a+b)*(a+b);
           if(sum==i){
               System.out.println(i);
           }
        }
    }
}
class A2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;//总和
        double num = 0;//单独
        double average=0;//平均分
        for (int i = 1; i <=5 ; i++) {
            System.out.print("请输入第"+i+"个学生的成绩");
            num= scanner.nextDouble();
            if(num>0){
                sum+=num;
                average=sum/i;
            }else{
                System.out.println("停止录入，录入的成绩错误");
                return;
            }
        }
        System.out.println("学生的平均分为:"+average);

    }
}
class A3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "FlipFlop";
        System.out.print("请输入（1-100)的整数：");
        int i = scanner.nextInt();
        if(i>=1 && i<=100) {
            if(i%3==0 && i%5==0){
                name="FlipFlop";
                System.out.println(name);
                return;
            }else if(i%5==0){
                name="Flop";
                System.out.println(name);
                return;
            }else if(i%3==0){
                name="Flip";
                System.out.println(name);
                return;
            }
        }else{
            System.out.println("输入范围错误，请输入（1-100)的整数：");
        }
    }
}
class A4 {
    public static void main(String[] args) {
        int count =0;
        int weight = 15;
        while (weight <50) {
            weight += 5;
            count++;
        }
        System.out.println("挑了第" + count + "次水才挑满");
    }
}
class A5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = scanner.nextInt();
        System.out.print("请输入月份：");
        int month = scanner.nextInt();
        if(month>=1 && month<=12){
            System.out.println(year+"年"+month+"月");
        }else{
            System.out.println("输出的月份不正确");
        }
    }
}


class A6{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String name = "fgy";
        int password=123456;
        for (int i = 3; i >=1 ; i--) {
            System.out.print("请输入户名:");
            String name1 = scanner.next();
            System.out.print("请输入密码:");
            int password1=scanner.nextInt();
            if(name1.equals(name) && password1==password){
                System.out.println("输入正确,已登录");
               break;
            }else if(i!=1){
                System.out.println("输入错误,请重新输入:");
            }else{
                System.out.println("3次输入错误，退出程序");
            }
        }
    }
}

class A7{
    public static void main(String[] args) {
        A(11);
    }
    public static void A(int num){
        int i =2;
        for (; i <num ; i++) {
            if(num%i==0){
                System.out.println(num+"不是一个质数");
                break;
            }
        }
            if(num==i){
                System.out.println(num+"是个质数");
            }
    }
}




class A8{
    public static void main(String[] args) {
         BB(33);
    }
    public static void BB(int num){
        int sum=0;
        for (int i = 2; i <num ; i++) {
            if (num % i == 0) {
                sum++;
            }
        }
            if(sum==0){
                System.out.println(num+"是质数");
            }else{
                System.out.println(num+"不是质数");
            }
    }
}


class B1{
    public static void main(String[] args) {
        for (int i = 1900; i <=2020 ; i++) {
            if((i%4==0 && i%100!=0) || (i%400==0)){
                System.out.println(i);
            }
        }
    }
}
class B2{
    public static void main(String[] args) {
        for (int i = 1; i <=20 ; i++) {
            for (int j = 0; j <=33 ; j++) {
                if(i*5+j*3+(100-i-j)/3==100 && (100-i-j)%3==0){
                    System.out.println("公鸡"+i+"母鸡"+j+"小鸡"+(100-i-j));
                }
            }
        }
    }
}
class B3{
    //、四个连续的3位自然数的和是一个在400到440之间的三位数，并且能被9整除，这四个自然数分别是多少？
    // 比如  123  124  125  126
    public static void main(String[] args) {
        for (int i = 100; i <200 ; i++) {
            int sum = i+(i+1)+(i+2)+(i+3);
            if(sum>=400 && sum<=440 && sum%9==0){
                System.out.println(i);
                System.out.println(i+1);
                System.out.println(i+2);
                System.out.println(i+3);
            }
        }
    }
}
class B4{
    //20、有如下十个数字：1/1，1/2，1/3，1/4，1/5，…………1/10请用java 代码实现其数列之和。
    public static void main(String[] args) {
        double sum=0;
        for (int i = 1; i <=10 ; i++) {
            sum+=1.0/i;
        }
        System.out.println(sum);
    }
}
class B5{
    //利用”异或”运算的性质,对几个字符 进行加密 并输出密文,然后再 解密。
    // 加密算法是：密钥是字符’8’，明文的每个字符和密钥进行异或运算，得到密文。
    // 密钥和密文的每个字符再次进行异或运算，重新得到明文。结果如图所示。
    public static void main(String[] args) {
        //1
        String str = "攻打美国";
        char my='8';
        System.out.println("原文："+str);
        String miwen=jiami(str,my);
        System.out.println("密文:"+miwen);
        String yuanwen = jiami(miwen,my);
        System.out.println("解密后："+yuanwen);
    }
    public static String jiami(String str,char my){
        //System.out.println("原文："+str);
        String miwen="";
        for (int i = 0; i <str.length() ; i++) {
                char c = str.charAt(i);
            //System.out.println(c);
            int x =c^my;
            char newChar = (char)x;
            //System.out.println(newChar);
            miwen = miwen+newChar;
        }
        return miwen;
    }
}
 class work2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonacci(8));
    }

    public static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if ((n == 2) || (n == 3)) {
            return 1;
        } else {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }
}











class work5{
    //输入年、月，输出月份日历。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********欢 迎 使 用 万 历 年**********");
        System.out.print("输入年份: ");
        int year = scanner.nextInt();
        System.out.print("输入月份（1-12): ");
        int month = scanner.nextInt();
        printMonth(year,month);
    }
    //先划分两个模块，一个作为标题，一个作为主题
    public static void printMonth(int year,int month){
        printMonthTitle(year,month);
        printMonthBody(year,month);
    }
    //先把简单的标题部分写好，一个月份名字，显示输入年份，以及分割线和星期，这里的空格和长度要对应好显示的日期
    public static void printMonthTitle(int year,int month){//printMonthTitle打印月份
        System.out.println("       "+getMonthName(month)+"    "+year);
        System.out.println("-------------------------");
        System.out.println(" 周日 星期一 星期三 星期三 星期四 星期五 星期六");
    }
    //年份直接获取输入数字即可，月份要转换一下，将输入的1-12转换成对应的英文显示
    public static String getMonthName(int month){
        String monthName="";
        switch (month){
            case 1:
            monthName="january";//january代表1月  以下同理
            break;
            case 2:
                monthName="February";
                break;
            case 3:
                monthName="March";
                break;
            case 4:
                monthName="April";
                break;
            case 5:
                monthName="May";
                break;
            case 6:
                monthName="June";
                break;
            case 7:
                monthName="July";
                break;
            case 8:
                monthName="August";
                break;
            case 9:
                monthName="September";
                break;
            case 10:
                monthName="October";
                break;
            case 11:
                monthName="November";
                break;
            case 12:
                monthName="December";
                break;
        }
        return monthName;
    }
    //具体日期内容，先是显示部分
    public static void printMonthBody(int year,int month){//startDay 开始天数
        int startDay = getStartDay(year,month);
        int numberDaysInMonth = getNumberOfDaysInMonths(year,month);//天数月份
        for (int i = 0; i <startDay ; i++) {
            System.out.print("       ");
        }
        for (int i = 1; i <numberDaysInMonth ; i++) {
            //i=0,则日期从0开始，numberOfDaysInMonth+1 不加1则少一天
            System.out.printf("%4d",i);
            if((i+startDay)%7==0){
                System.out.println();
            }
        }
        System.out.println();
    }
    //日历必须知道本月第一天是周几，从1900年1月1号开始算，通过求余知道当前是周几
    public static int getStartDay(int year,int month){
        final int START_DAY_FOR_JAN_1_1900=4;//原 3 时间慢了一天
        int totalNumberOfDay = getNumberOfDaysInMonths(year,month);
        return (totalNumberOfDay+START_DAY_FOR_JAN_1_1900)%7;
    }
    //计算当前输入时间距离19001月1号多少天
    public static int getTotalNumberOfDay(int year,int month){
        int total = 0;
        for (int i = 0; i <1900 ; i++) {
            if(isLeapYear(i)){
                total = total+366;
            }else{
                total = total+365;
            }
        }
        for (int i = 0; i <month ; i++) {
            total = total+getNumberOfDaysInMonths(year,month);
        }
        return total;
    }
    //月份有大小月，要分开处理大月小月；再统计总的天数
    public static int getNumberOfDaysInMonths(int year, int month) {
        if((month==1) || (month==3) || (month==5) || (month==7)
        || (month==8) || (month==10) || (month==12)){
            return 31;
        }
        if((month==4) || (month==6) || (month==9) || (month==11)) {
            return 30;
        }
            if(month==2){
                return isLeapYear(year)?29:28;
            }
            return 0;
    }
    //阳历还有闰年，根据是否闰年计算天数
    public static boolean isLeapYear(int year){
        return (year%400==0) || (year%4==0 && year%100!=0);
    }
}




class BBB{
    public static void main(String[] args) {
        int year;//年
        int month;//月
        boolean run;//是否闰年
        int days=0;//输入天数
        int totalDay;//总天数
        int week;//星期几
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********欢 迎 使 用 万 历 年**********");
        System.out.print("输入年份: ");
        year = scanner.nextInt();
        System.out.print("输入月份（1-12): ");
        month = scanner.nextInt();
        System.out.println("-------------------------");
        //判断是否闰年
        if(year%4==0 && year%100!=0 || year%400==0){
            run = true;
        }else{
            run = false;
        }
        totalDay=0;
        for (int i = 1990; i <year ; i++) {
            if(i%4==0 && i%100!=0 || i%400==0){
                totalDay+=366;
            }else{
                totalDay+=365;//累加天数
            }
        }
        for (int i = 1; i <=month ; i++) {
            switch (i){
                case 4:
                case 6:
                case 9:
                case 11:
                    days =30;
                    break;
                case 2:
                    days = run?29:28;
                    break;
                default:
                    days =31;
                    break;
            }
            if(i<month){
                totalDay+=days;
            }
        }
        //week = (totalDay+1)%7;
        week = totalDay%(7+1);

        System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
        for (int j = 0; j <week ; j++) {
            System.out.print("\t\t");
        }
        System.out.print("\t\t");
        for (int j = 1; j <=days ; j++) {
            System.out.print(j);
            if((week+j)%7==0){
                System.out.print("\n");
            }else{
                System.out.print("\t\t");
            }
        }
    }
}





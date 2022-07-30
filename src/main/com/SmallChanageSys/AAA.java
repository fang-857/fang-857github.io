package com.SmallChanageSys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author
 * @version 1.0
 */
public class AAA {
    //1.先完成显示菜单，并可以选择
    //2.完成零钱通明细
    //3.完成收益入账
    //4.消费
    //5.退出
    boolean loop = true;//控制显示菜单
    double money=0;
    double balance=0;//余额
    Date date = null;//date 表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化
    Scanner scanner = new Scanner(System.in);
    String key ="";
    String note="";//消费原因

    String detail ="--------零钱通明细----------";
    public void main1(){//显示菜单
        do{
            System.out.println("\n======显示零钱通菜单========");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消   费");
            System.out.println("\t\t\t4 退   出");
            System.out.print("输入(1-4):");
            key=scanner.next();
            switch (key){
                case "1":
                    this.ming();
                    break;
                case "2":
                    this.in();
                    break;
                case "3":
                    this.run();
                    break;
                case "4":
                    this.go();
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        }while(loop);

    }
    public void ming(){//零钱通明细
        System.out.println(detail);
    }
    public void in(){//收益入账
        System.out.print("输入收益金额：");
        money=scanner.nextDouble();
        //找出收益不正确的条件，给出提示后直接return
        if(money<=0){//判断
            System.out.println("收入金额应大于0");
            return;//退出方法  不在执行后面代码
        }
        balance+=money;//余额
        date = new Date();//获取当前日期
        detail +="\n收益入账\t+"+ money + "\t" + sdf.format(date)  + "\t" + balance;//可以用于日期格式化

    }
    public void run(){//消费金额
        System.out.print("输入消费金额：");
        money=scanner.nextDouble();
        System.out.print("输入消费原因：");
        note=scanner.next();
        //找出消费不正确的条件，给出提示后直接return
        if(money<0 || money>balance){
            System.out.println("消费有误，请重新检查");
            return;
        }
        balance-=money;
        date = new Date();//获取当前日期
        detail +="\n" + note + "\t-" + money + "\t" + sdf.format(date)  + "\t" + balance;//可以用于日期格式化


    }
    public void go(){//退出程序
        String cha = "";
        //用户输入4退出时，给出提示"你确定要退出吗？ y/n",必须输入正确的y/n.
        //否则循环输入指令，直到输入y 或者 n
        //思路分析
        //（1）定义一个变量 choice(选择)，接受用户的输入
        // (2)使用 while+break，处理接受到的输入是 y或者n
        // (3)退出while后，再判断choice是y还是n，就可以决定是否退出
        while(true) {
            System.out.println("您确定要退出吗？请输入y或者n");
            cha = scanner.next();//接受
            if ("y".equals(cha) || "n".equals(cha)) {//如果输入的不是y或者n 则一直循环
                break;
            }
        }
            //while结束后类型判断
            if(cha.equals("y")){//输入为Y 则退出
                loop = false;
                return;
            }


        System.out.println("选择有误，重新选择");
    }

}

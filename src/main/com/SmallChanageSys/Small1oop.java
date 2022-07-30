package com.SmallChanageSys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 这是完成零钱通各个功能的类
 * 使用oop面向对象编程
 * 将各个功能对应一个方法
 * @author 方
 * @version 1.0
 */
public class Small1oop {
    //1.先完成显示菜单，并可以选择
    //2.完成零钱通明细
    //3.完成收益入账
    //4.消费
    //5.退出
    //定义相关变量
    //loop 控制显示菜单
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key="";
    //2.完成零钱通明细  思路
    //（1）可以把收益入账和消费，保存到数组（2）可以使用对象（3）简单的话可以使用String 拼接
    String details = "------------零钱通明细-----------";
    //3.完成收益入账
    //定义新的变量
    double money = 0;
    double balance = 0;//余额
    Date date = null;//date 是java.util.Date 类型，表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化
    //4.消费
    //定义新变量保存消费的原因
    String note = "";
    //1.先完成显示菜单，并可以选择
    public void mainMenu(){
            do{
                System.out.println("\n=====oop零钱通菜单======");
                System.out.println("\t\t\t1 零钱通明细");
                System.out.println("\t\t\t2 收益入账");
                System.out.println("\t\t\t3 消   费");
                System.out.println("\t\t\t4 退   出");
                System.out.print("请选择（1-4）：");
                key = scanner.next();
                //使用switch分支控制
                switch(key){
                    case "1":
                        this.detail();
                        break;
                    case "2":
                        this.income();
                        break;
                    case "3":
                        this.pay();
                        break;
                    case "4":
                        this.exit();
                        break;
                    default:
                        System.out.println("选择有误，请重新选择");
                }
            }while(loop);
    }
    //2.完成零钱通明细
    public void detail(){
        System.out.println(details);
    }
    ////3.完成收益入账
    public void income(){
        System.out.print("收益入账金额：");
        money = scanner.nextDouble();
        //money 的值范围应该校验-》 一会在完善
        //(思路）
        //找出不正确的金额条件，然后给出提示，就直接return
        if(money<=0){
            System.out.println("收益入账金额范围需要大于0");
            return;//退出方法，不在执行后面代码
        }
        balance +=money;
        //拼接收益入账信息到details;
        date = new Date();//获取当前日期
        details +="\n收益入账\t+"+ money + "\t" + sdf.format(date)  + "\t" + balance;
    }
    //4.消费
    public void pay(){  System.out.println("消费金额:");
        money = scanner.nextDouble();
        //money 的值范围应该校验-》 一会在完善
        //找出消费不正确的条件，给出提示后直接return
        if(money>balance || money<=0){
            System.out.println("您的消费金额应该在0-"+balance+"元之间");
            return;
        }
        System.out.println("消费说明:");
        note =scanner.next();
        balance -=money;
        date = new Date();//获取当前日期
        details +="\n" + note + "\t-" + money + "\t" + sdf.format(date)  + "\t" + balance;
    }
    //5.退出
    public void exit(){
        //用户输入4退出时，给出提示"你确定要退出吗？ y/n",必须输入正确的y/n.
        //否则循环输入指令，直到输入y 或者 n
        //思路分析
        //（1）定义一个变量 choice(选择)，接受用户的输入
        // (2)使用 while+break，处理接受到的输入是 y或者n
        // (3)退出while后，再判断choice是y还是n，就可以决定是否退出
        String choice = "";
        while(true){//要求i客户输入必须是y或这n，否则就一直循环
            System.out.println("你确定要退出吗？y/n");
            choice = scanner.next();
            if("y".equals(choice) || "n".equals(choice)){
                break;
            }
        }
        //当用户退出while，进行判断
        if(choice.equals("y")){//输入的是Y则退出
            loop = false;
            return;
        }

        System.out.println("选择有误，请重新选择");
    }

}

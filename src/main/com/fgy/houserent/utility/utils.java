package com.fgy.houserent.utility;

import java.util.Scanner;

/**
 * @author
 * @version 1.0
 */
public class utils {
   static Scanner scanner = new Scanner(System.in);
    //读取键盘输入的一个字符
    public static char readChar(){
        String str = readKeyBoard(1,false);//就是一个字符
        return str.charAt(0);
    }
    //读取键盘输入的一个字符，如果直接按回车，则返回指定的默认值
    public static char readChar(char defaultValue){
        String str = readKeyBoard(1,true);//要么是空字符串
        return (str.length() == 0)? defaultValue : str.charAt(0);
    }
    //读取键盘输入的整形，长度小于10位
    public static int readInt(){
        int n;
        for(; ; ){
            String str = readKeyBoard(10,false);//一个整数，长度小于10
            try{
                n = Integer.parseInt(str);//将字符串转换成整数
                break;
            }catch (NumberFormatException e){
                System.out.println("数字输入错误，请重新输入:");
            }
        }
        return n;
    }
    //读取键盘输入的整数或默认值，如果直接回车，则返回默认值
    public static int readInt(int defaultValue) {//defaultValue指定的默认值
        int n;
        for (; ; ) {
            String str = readKeyBoard(10, true);
            if (str.equals("")) {
                return defaultValue;
            }
            //异常处理。。
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("数字输入错误，请重新输入:");
            }
        }
        return n;
    }
    //读取键盘输入的指定长度的字符串
    public static String readString(int limit){
        return readKeyBoard(limit,false);
    }
    //读取键盘输入的指定长度的字符串或默认值，如果直接按回车，则返回默认值
    //limit 限制的长度
    public  static String readString(int limit,String defaultValue){
        String str = readKeyBoard(limit,true);
        return str.equals("")? defaultValue : str;
    }
     //读取键盘输入的确认选项，Y或N
    //将小的功能，封装到一个方法中
    public static char readConfirmSelection(){
        System.out.println("请输入你的选择(Y/N):请小心选择");
        char c;
        for(; ; ){//无限循环
            //在这里，将接收到字符，转成了大写字母
            //y => Y n=>N
            String str = readKeyBoard(1,false).toUpperCase();
            c = str.charAt(0);
            if(c =='Y' || c =='N'){
                break;
            }else{
                System.out.println("选择错误，请重新输入:");
            }

        }
        return c;
    }
    //读取键盘输入的一个惨淡选项，值:1-5的范围
    public static char readMenuSelection(){
        char c;
        for(; ;){
            String str = readKeyBoard(1,false);//包含一个字符
            c = str.charAt(0);//将字符串转换成字符char类型
            if(c != '1' && c!= '2' && c!= '3'
                    && c!= '4' && c!= '5'){
                System.out.println("选择错误，请重新输入:");
            }else break;;
        }
        return c;
    }

    private static String readKeyBoard(int limit, boolean blankReturn){
        //定义了字符串
        String line = "";
        //scanner,hasNextLine() 判断有没有下一行
        while (scanner.hasNextLine()){
            line = scanner.nextLine();//读取这一行
            //如果line.length=0;即用户没有输入任何内容，直接回车
            if(line.length()==0){
                //如果blankReturn=true;可以返回空串
                if(blankReturn)return line;
                //如果blankReturn=false,不接受空串，必须输入内容
                else continue;
            }
            //如果用户输入的内容大于了limit,就提示重写输入
            //如果用户输入的内容>0  <=limit,我就接收
            if(line.length()<1 || line.length()>limit){
                System.out.println("输入长度(不能大于"+limit+")错误，请重新输入:");
                continue;
            }
            break;
        }
        return line;
    }
}


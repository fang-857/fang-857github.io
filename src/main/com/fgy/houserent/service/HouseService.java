package com.fgy.houserent.service;

import com.fgy.houserent.domain.House;

/**
 * HouseService.java<=>类[业务层]
 * 定义House[]，保存House对象
 * 响应HouseView的调用
 * 完成对房屋信息的各种操作（增删改查）
 * size   大小
 * @author
 * @version 1.0
 */
public class HouseService {
    //保存House对象
    private House[] houses;
    private int  houseNumber=1;//记录当前有多少个房屋信息
    private int idCounter=1;//记录当前的id增长到哪个值

    public  HouseService(int size){
        //new houses
         houses = new House[size];//当创建HouseService对象，指定数组大小
        //为了配合测试列表信息，初始化一个House对象
        houses[0]=new House(1,"jack","112","岳麓区",2300,"未出租");
    }
    //find方法，返回House对象或者null
    public  House findById(int findId){
        //遍历数组
        for (int i = 0; i <houseNumber ; i++) {
            if(findId == houses[i].getId()){
                 return houses[i];
            }

        }
        return null;
    }
    //del方法，删除一个房屋信息     返回boolean
    public  boolean del(int delId){
        //应当找到要删除的房屋信息对应的下标
        //重点   下标跟房屋编号不是一回事
        int index = -1;
        for (int i = 0; i <houseNumber ; i++) {
            //要删除的房屋（id），再数组下标为i的元素
            if(delId == houses[i].getId()){
             index = i;//使用index记录i
            }
        }
        if(index ==-1){//说明delId在数组中不存在
            return false;
        }
        //如果找到，思路分析
        for (int i = index; i <houseNumber-1 ; i++) {
            houses[i] = houses[i+1];
        }
        //把当前存在的房屋信息的最后一个设置null
        houses[--houseNumber]=null;
            return true;
    }
    //add方法，添加新对象，返回boolean
    public  boolean add(House newHouse){
        //判断是否可以继续添加（暂时不考虑扩容问题）
        if(houseNumber == houses.length){//不能再添加
            System.out.println("数组已满，不能再添加了。。。");
            return false;
        }
        //把newHouse对象加入//（++)表示新增加了一个房屋   后++    先赋值再取值
        houses[houseNumber++]=newHouse;
        //我们程序员需要设计一个id自增长的机制,然后更新newHouse的id
       //++为前++    先取值再赋值
        newHouse.setId(++idCounter);
        return true;

    }
    //list方法，返回houses
    public House[] list(){
        return houses;

    }

}

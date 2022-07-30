package com.RecursionExercise;

/**
 * @author
 * @version 1.0
 */
public class MiGong {
    public static void main(String[] args) {
        //思路
        //1  先创建迷宫，用二维数组表示 int[][] map=new int[8][7];
        //2  先规定 map 数组的元素值: 0 表示可以走  1 表示障碍物
        int[][] map=new int[8][7];
        //3  将上下两行全部设置为1
        for(int i =0; i<7;i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //讲最右边跟最左边一列全部设置为1
        for (int i = 0; i < 8; i++) {
            map[i][0]=1;
            map[i][6]=1;
        }
        map[3][1]=1;
        map[3][2]=1;
        System.out.println("=======当前地图情况=====");
        for (int i = 0; i <map.length ; i++) {
            for (int j = 0; j <map[i].length ; j++) {
                System.out.print(map[i][j]+" ");//输出一行
            }
            System.out.println();
        }
        A ti = new A();
        ti.findWay(map,1,1);
        System.out.println("\n=====找路的情况如下====");
        System.out.println("=======当前地图情况=====");
        for (int i = 0; i <map.length ; i++) {
            for (int j = 0; j <map[i].length ; j++) {
                System.out.print(map[i][j]+" ");//输出一行
            }
            System.out.println();
        }

    }
}
 class A{
    //使用递归回溯的思想来解决老鼠出迷宫
     //1findWay 方法就是专门找出迷宫的路径
     //2 如果找到就返回true,否则返回false
     //map就是二维数组，表示迷宫
     //i,j就是老鼠位置，初始化位置（1，1）
     //因为递归找路，所以先规定map数组的各个值含义
     //0表示可以走，1表示障碍物，2表示可以走，3表示走过，但是走不通是死路
     //当map[6][5]=2就说明找到通路，就可以结束，否则继续找
     //先确定老鼠找路策略，下->右->上->左
     public boolean findWay(int[][] map, int i , int j) {
         if (map[6][5] == 2) {//说明已经找到
             return true;
         } else {
             if (map[i][j] == 0) {//当前位置为0；说明表示可以走
                 //假定可以走通
                 map[i][j] = 2;
                 //使用找路策略，来确定该位置是否真的可以走通
                 //下->右->上->左
                 if (findWay(map, i + 1, j)) {//先走下
                     return true;
                 } else if (findWay(map, i, j + 1)) {//右
                     return true;
                 } else if (findWay(map, i - 1, j)) {//上
                    return true;
                 } else if (findWay(map, i, j - 1)) {
                     return true;//左
                 }else {
                     map[i][j]=3;
                     return false;
                 }
             } else {//map[i][j]=1,2,3
                 return false;
             }
         }
     }
 }

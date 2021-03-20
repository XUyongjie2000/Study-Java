package com.czxy.whiledemo;

public class Demo3 {
    public static void main(String[] args) {
        //注意：内外层循环变量 名称不能重复
        //外层循环 控制行数
        for (int i = 1; i <=3 ; i++) {
            //内层循环 控制列数
            for (int j = 1; j <=5 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

       /* for (int j = 1; j <=5 ; j++) {
            System.out.print("*");
        }
        System.out.println();

        for (int j = 1; j <=5 ; j++) {
            System.out.print("*");
        }
        System.out.println();

        for (int j = 1; j <=5 ; j++) {
            System.out.print("*");
        }
        System.out.println();*/

    }
}

package com.czxy.demo2.t3;

public class Test03 {
    public static void main(String[] args) {
        //倒三角案例
        //1、形成 4*4的矩形
        //4行
        /*for (int i = 1; i <=4 ; i++) {
            //4列
            for (int j = 1; j <=4 ; j++) {
                System.out.print("*");
            }
            //换行
            System.out.println();
        }*/
        //2、寻找规律，由矩形变倒三角  : 行和列累加和是5，第i行 有5-i列
        for (int i = 1; i <=4 ; i++) {
            //4列
            for (int j = 1; j <=5-i ; j++) {
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
    }
}

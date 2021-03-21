package com.czxy.demo2.t1;

public class Test01 {
    public static void main(String[] args) {
        //1、先打印4*4矩形
        //矩形有4行
        /*for (int i = 1; i <=4 ; i++) {
            //矩形一行有4列
            for (int j = 1; j <=4 ; j++) {
                System.out.print("*");
            }
            //一行结束要换行
            System.out.println();
        }*/
        //2、正三角： 第i行 有i列
        for (int i = 1; i <=4 ; i++) {
            //矩形一行有4列
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            //一行结束要换行
            System.out.println();
        }
    }
}

package com.czxy.demo2.t2;

public class Test02 {
    public static void main(String[] args) {
        //九九乘法表
        //1、先生成 * 矩形 9*9
        //9行
        /*for (int i = 1; i <=9 ; i++) {
            //9列
            for (int j = 1; j <=9 ; j++) {
                System.out.print("*");
            }
            //一行结束要换行
            System.out.println();
        }*/
        //2、再变为正三角   : 第i行有i列
        /*for (int i = 1; i <=9 ; i++) {
            //9列
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            //一行结束要换行
            System.out.println();
        }*/
        //3、*变成公式
        for (int i = 1; i <=9 ; i++) {
            //9列
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            //一行结束要换行
            System.out.println();
        }
    }
}

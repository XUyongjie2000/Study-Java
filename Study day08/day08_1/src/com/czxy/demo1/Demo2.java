package com.czxy.demo1;

public class Demo2 {
    public static void main(String[] args) {
        //循环标号
        //break关闭外层循环：  ①为外层循环起标号  ② break 标号;  作用于指定标号的循环
        //循环1
        outer:for(int a=1;a<=3;a++){
            //循环2
            for(int b=1;b<=2;b++){
                System.out.print("*");
                break outer;
            }
            System.out.println();
        }
    }
}

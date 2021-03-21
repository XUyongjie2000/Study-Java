package com.czxy.demo1;

public class Test01 {
    public static void main(String[] args) {
        //1、 1-30 循环打印
        /*for (int i = 1; i <=30 ; i++) {
            System.out.println(i);
        }*/
        //2、 跳过 4
        /*for (int i = 1; i <=30 ; i++) {
            if(i==4){
                continue;
            }
            System.out.println(i);
        }*/
        //3、 继续补充跳过条件
        for (int i = 1; i <=30 ; i++) {
            if(i==4 || i==7 || i==14 || i==18 || i==24){
                continue;
            }
            System.out.println(i);
        }
    }
}

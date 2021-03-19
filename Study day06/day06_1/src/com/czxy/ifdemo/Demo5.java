package com.czxy.ifdemo;

public class Demo5 {
    public static void main(String[] args) {
        //1、定义num变量
        int num = 4;
        //2、判断：如果num在1~5之间，打印工作日
        if(num>=1&&num<=5){
            System.out.println("工作日");
        }else{
            //否则打印休息日
            System.out.println("休息日");
        }
    }
}

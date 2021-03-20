package com.czxy.fordemo;

public class Demo2 {
    public static void main(String[] args) {
        //需求：重复打印3行*
        int x = 1;
        for (int i = 1; i <=3 ; i++) {
            int inner = 1;
            System.out.println("******"+i+"******"+x++ +"*****"+inner++);
        }
    }
}

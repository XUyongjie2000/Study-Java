package com.czxy.demo1;

public class Demo1 {
    public static void main(String[] args) {
        //需求：1 2 4 5 6     跳过3
        for (int i = 1; i <=6 ; i++) {
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
        //continue; //不能单独使用，必须在循环中
    }
}

package com.czxy.demo;

public class Demo1 {
    public static void main(String[] args) {
        //break:
        for (int i = 1; i <=100 ; i++) {
            System.out.println(i);
            break;
        }
        //break;//不能在循环外单独使用
        System.out.println("-----");
        //一般循环中，符合某些情况，才会强制通过break中止循环
        //需求：从1~100，只需要打印1、2、3
        for (int i = 1; i <=100 ; i++) {
            System.out.println(i);
            if(i==3){
                break;
            }
        }
    }
}

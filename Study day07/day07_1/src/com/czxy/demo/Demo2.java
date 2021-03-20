package com.czxy.demo;

public class Demo2 {
    public static void main(String[] args) {
        //break 默认作用离他最近的循环
        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print("*");
                break;
            }
            System.out.println();
        }
    }
}

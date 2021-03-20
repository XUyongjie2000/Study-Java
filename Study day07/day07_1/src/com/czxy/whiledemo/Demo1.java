package com.czxy.whiledemo;

public class Demo1 {
    public static void main(String[] args) {
        //需求：重复打印10行*
        /*for (int i = 1; i <=10 ; i++) {
            System.out.println("******");
        }*/

        int i = 1;
        while (i <=10){
            System.out.println("******");
            i++;
        }
    }
}

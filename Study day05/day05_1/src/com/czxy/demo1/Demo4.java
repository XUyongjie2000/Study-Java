package com.czxy.demo1;

public class Demo4 {
    public static void main(String[] args) {
        //逻辑运算符
        // &  出现false，结果为false
        System.out.println(true&true);//true
        System.out.println(false&true);//false
        System.out.println(true&false);//false
        System.out.println(false&false);//false

        // | 出现true，结果为true
        System.out.println(true|true);//true
        System.out.println(false|true);//true
        System.out.println(true|false);//true
        System.out.println(false|false);//false

        // !  取反
        System.out.println(!false);//true
        System.out.println(!true);//false
    }
}

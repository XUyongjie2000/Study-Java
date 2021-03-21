package com.czxy.demo1;

public class Demo4 {
    public static void main(String[] args) {
        //值交换
        int a=15,b=20;

        //①定义第三方变量，保存A的值
        int temp = a;
        //②将B的值 赋予A
        a = b;
        //③将第三方变量值 赋予B
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}

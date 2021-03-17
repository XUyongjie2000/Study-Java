package com.czxy.demo2;

public class Demo5 {
    public static void main(String[] args) {
        long x = 1L;
        x++;
        System.out.println(x);
        double d = 10.55;
        d++;
        System.out.println(d);
        char a = 'a';//底层也是数字类型
        a++;
        a++;
        System.out.println(a);//码表
    }
}

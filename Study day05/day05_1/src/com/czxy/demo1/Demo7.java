package com.czxy.demo1;

public class Demo7 {
    public static void main(String[] args) {
        //短路:为了提升程序运算效率
        int a = 10;
        int b = 20;
        System.out.println((a++)>b && ++b==20 && ++a<=b-15);
        System.out.println(a);
        System.out.println(b);
    }
}

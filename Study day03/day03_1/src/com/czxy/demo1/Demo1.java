package com.czxy.demo1;

public class Demo1 {
    public static void main(String[] args) {
        //保存单个字符
        char a1 = '曾';
        System.out.println(a1);//曾
        //注意事项：若将单字符保存为整数，保存的是 该字符在计算机 文字表上的位置 （码表上的位置）
        int a2 = '曾';
        System.out.println(a2);//26366
        //以下空着会报错
        //char c1 = '';
        char c2 = ' ';
        //字符型不能一次保存多个，最多保存一个
        //char c3 = '曾晓锋';

        //转义字符：区别于普通计算机字符，需要通过 \ 转义才能展示真正效果。 转义字符是一个字符
        // TAB(制表符)    \t
        // \r \n \b \\
        char c4 = 't';
        System.out.println(c4);
        char c5 = '\t';
        System.out.println(c5);
        char c6 = '\\';
        System.out.println(c6);
    }
}

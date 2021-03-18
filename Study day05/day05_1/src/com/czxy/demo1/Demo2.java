package com.czxy.demo1;

public class Demo2 {
    public static void main(String[] args) {
        //java：解式: 右侧内容会自动提升优先级，可以理解为加入了小括号
        int b = 10;
        b*=1+1;// b = b * (1+1)
        System.out.println(b);
    }
}

package com.czxy.demo1;

public class Demo1 {
    public static void main(String[] args) {
        //max中保存两两对比的最大值
        int a=10,b=20,c=30,max;
        //先求前两个当中的最大值
        max = a>b?a:b;
        System.out.println(max);
        //继续向后求最大值
        max = max>c?max:c;
        System.out.println(max);
    }
}

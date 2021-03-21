package com.czxy.demo1;

public class Demo3 {
    public static void main(String[] args) {
        //数组异常：空指针异常
        //数组为null，却强制访问
        int[] arr = null;
        System.out.println(arr);//null
        //强制访问：访问数组0索引
        //System.out.println(arr[0]);//NullPointerException

        //解决方案：
        //1、数组为null 不强制访问
        //2、若需要访问数组，需要重新为数组赋值
        arr = new int[]{11,22,33};
        System.out.println(arr[0]);//11
    }
}

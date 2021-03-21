package com.czxy.demo1;

public class Demo2 {
    public static void main(String[] args) {
        //数组异常：数组索引越界异常
        //强制访问某个不存在索引
        int[] arr = {11,22,33};
        System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
        //解决方案：不访问不存在索引。
    }
}

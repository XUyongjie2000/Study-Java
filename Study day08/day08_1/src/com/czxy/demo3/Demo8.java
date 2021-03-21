package com.czxy.demo3;

public class Demo8 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66};
        //不能超范围赋值
        //arr[0] = 3000000000;
        //不能其他类型
        //arr[0] = "你好";

        //System.out.println(arr[-100]);//ArrayIndexOutOfBoundsException 索引越界异常
        //System.out.println(arr[100]);//ArrayIndexOutOfBoundsException 索引越界异常
    }
}

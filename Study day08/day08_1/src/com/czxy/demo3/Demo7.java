package com.czxy.demo3;

public class Demo7 {
    public static void main(String[] args) {
        //获取元素值
        int[] arr = {11,22,33,44,55,66};
        //需求：将第一个数据值 由11改为100
        arr[0] = 100;
        //需求2：将最后一个数据值 由66改为666
        arr[5] = 666;

        //需求3：将0索引元素 和 5索引元素 依次取出
        System.out.println(arr[0]);
        System.out.println(arr[5]);
        int aa = arr[0];
        System.out.println(aa);
    }
}

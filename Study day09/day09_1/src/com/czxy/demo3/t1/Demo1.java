package com.czxy.demo3.t1;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66};
        //1、进行数组反转公式套入
        for (int i = 0; i < arr.length/2; i++) {
            //2、循环中，对开头 和 结束 进行值交换
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        //展示结果
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

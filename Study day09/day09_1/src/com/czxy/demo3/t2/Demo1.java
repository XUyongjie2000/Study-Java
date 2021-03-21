package com.czxy.demo3.t2;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {99,44,55,11};
        //控制冒泡轮数
        for (int i = 1; i < arr.length; i++) {
            //内层：控制本轮冒泡对比索引
            for (int j = 0; j < arr.length-i; j++) {
                //内层循环中，进行对比交换相邻元素
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //展示结果
        System.out.println(Arrays.toString(arr));
    }
}

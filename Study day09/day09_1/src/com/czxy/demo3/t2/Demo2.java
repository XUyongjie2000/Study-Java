package com.czxy.demo3.t2;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        //选择排序
        int[] arr = {99,44,55,11};
        //外层控制：选择索引
        for (int i = 0; i < arr.length-1; i++) {
            //内层控制：对比索引
            for (int j = i+1; j < arr.length; j++) {
                //内层循环里：进行对比、交换
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //展示结果
        System.out.println(Arrays.toString(arr));
    }
}

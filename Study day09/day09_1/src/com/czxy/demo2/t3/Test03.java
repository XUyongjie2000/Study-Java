package com.czxy.demo2.t3;

public class Test03 {
    public static void main(String[] args) {
        String[] arr = {"aa","bb","cc","dd","ee"};
        //把索引2的值  与索引4的值 交换
        String temp = arr[2];
        arr[2] = arr[4];
        arr[4] = temp;
        System.out.println(arr[2]);//ee
        System.out.println(arr[4]);//cc
    }
}

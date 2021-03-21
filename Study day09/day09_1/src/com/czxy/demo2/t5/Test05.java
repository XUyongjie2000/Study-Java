package com.czxy.demo2.t5;

public class Test05 {
    public static void main(String[] args) {
        //倒序打印
        int[] arr = {1,3,9,5,0};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

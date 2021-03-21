package com.czxy.demo1;

public class Demo1 {
    public static void main(String[] args){
        int[] arr = {33,44,55,66};
        //需求：在控制台依次展示每个元素
        //正序遍历  数组名.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("----");
        //倒序遍历  数组名.forr
        //arr.length-1   最后一个索引
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

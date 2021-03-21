package com.czxy.demo3;

public class Demo3 {
    public static void main(String[] args) {
        //数组多种定义格式 :int  3个
        //1、标准型  (仅知道数组长度，不知道存储数组哪些数据)
        int[] arr1 = new int[3];
        //2、完整型. 数组长度3,3个元素分别是11,22,33  （进行再次赋值时才会使用）
        int[] arr2 = new int[]{11,22,33};
        arr2 = new int[]{44,55,66};//重新赋值
        //arr2 = {44,55,66};//不支持在重新赋值中，使用该格式

        //3、简化赋值型   数组长度3,3个元素分别是11,22,33  （知道要存储哪些数据）
        int[] arr3 = {11,22,33};
    }
}

package com.czxy.demo2.t2;

public class Test02 {
    public static void main(String[] args) {
        int[] arr1 = {22,33,44,55};
        String[] arr2 = {"aa","bb","cc","dd","ee"};
        //通过取值，并进行运算 展示aabb77
        String str = arr2[0]+arr2[1]+(arr1[0]+arr1[3]);
        System.out.println(str);
    }
}

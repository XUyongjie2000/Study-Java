package com.czxy.demo3;

public class Demo5 {
    public static void main(String[] args) {
        /*String str = null;
        int[] arr = null;*/
        //null值 再次赋值
        int[] arr = null;
        System.out.println(arr);
        //再次赋值后，才能正常使用
        arr = new int[]{11,22,33};
        System.out.println(arr);
    }
}

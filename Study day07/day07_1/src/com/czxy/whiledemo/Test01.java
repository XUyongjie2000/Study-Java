package com.czxy.whiledemo;

public class Test01 {
    public static void main(String[] args) {
        /*
        分别使用for循环和while循环，实现控制台打印100以内 所有3的整倍数。
        提示：3的倍数，即  ？ 除以  3 可以除尽，没有余数
        X%3==0
         */
        //for
        //1、先1~100，循环每个数字
        for (int i = 1; i <=100 ; i++) {
            //2、每循环一个数字，对数字判断，是否为3的整数倍
            if(i%3==0){
                //3、如果是3的整数倍，进行展示
                System.out.println(i);
            }
        }
        System.out.println("----");
        //while
        int i = 1;
        while (i <=100){
            if(i%3==0){
                //如果是3的整数倍，进行展示
                System.out.println(i);
            }
            i++;
        }
    }
}

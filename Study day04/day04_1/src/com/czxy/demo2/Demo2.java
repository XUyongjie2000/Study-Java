package com.czxy.demo2;

public class Demo2 {
    public static void main(String[] args) {
        //模运算：  %     除法取余数  （整数取余数，小数取余无意义）
        System.out.println(5%2);
        System.out.println(-5%2);

        //用来判断：是否是X的整数倍       格式：数%X     结果为0，说明是X的整数倍。  否则不是
        System.out.println(117%3);//0   117除3能除尽，117是3的整数倍

        //用来取出：数字中的某一位
        //整数：
        //取出：  个位： 整数%10
        //取出：  十位： 整数/10%10
        //取出：  百位： 整数/100%10
        int aa = 1234;
        System.out.println(1234%10);
        System.out.println(1234/10%10);
        System.out.println(1234/100%10);
        System.out.println(1234/1000%10);
    }
}

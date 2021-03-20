package com.czxy.demo;

public class Test01 {
    public static void main(String[] args) {
        //打印1-100中前三个17的整数倍。
        //提示：? / 17 能除尽，没有余数

        //1、进行1-100的循环
        //2、给循环加入 17的整数倍判断
        //3、给17整数倍 进行出现次数统计
        //4、控制17整数倍的出现次数 在3次
        int num = 0;    //17整数倍，默认出现0次
        for (int i = 1; i <=100 ; i++) {
            //给循环加入 17的整数倍判断
            if(i%17==0){
                System.out.println(i);
                num++;  //17整数倍打印，出现次数+1
                //判断17整数倍出现次数是否达标
                if(num==3){
                    break;
                }
            }
        }
        //System.out.println(num);
    }
}

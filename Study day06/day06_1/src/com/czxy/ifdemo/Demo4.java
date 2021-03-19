package com.czxy.ifdemo;

public class Demo4 {
    public static void main(String[] args) {
        //1、定义变量
        String name = "胥永杰";
        int sex = 1;
        //2、进行判断：  如果sex==0，是女士‘
        if(sex == 0){
            System.out.println("欢迎"+name+"女士");
        }else{
            //否则男士
            System.out.println("欢迎"+name+"先生");
        }
    }
}

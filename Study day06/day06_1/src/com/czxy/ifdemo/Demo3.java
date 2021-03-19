package com.czxy.ifdemo;

public class Demo3 {
    public static void main(String[] args) {
        //需求：≥60分，及格   ＜60分，需要补考
        int score = 59;

        if(score>=60){
            System.out.println("及格");
        }else{
            System.out.println("需要补考");
        }
    }
}

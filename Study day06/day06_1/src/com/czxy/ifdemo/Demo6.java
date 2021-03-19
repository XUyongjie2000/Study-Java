package com.czxy.ifdemo;

public class Demo6 {
    public static void main(String[] args) {
        //if...elseif...else
        int score = 50;
        //需求：如果考试分数 ≥80分，展示优秀
        if(score>=80){
            System.out.println("优秀");
        }else if(score>=60 && score<=79){
            //    再如果考试分数  60~79，展示及格
            System.out.println("及格");
        }else{
            //    否则 ，不及格
            System.out.println("不及格");
        }
    }
}

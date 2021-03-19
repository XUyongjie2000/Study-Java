package com.czxy.ifdemo;

public class Demo7 {
    public static void main(String[] args) {
        //if...elseif...else
        int score = 45;
        //需求：如果考试分数 ≥80分，展示优秀
        if(score>=80){
            System.out.println("优秀");
        }else if(score>=60 && score<=79){
            //    再如果考试分数  60~79，展示及格
            System.out.println("及格");
        }else{
            //    否则，继续判断是否需要补考
            System.out.println("不及格");
            //如果分数 50~59之间，发挥失常，立刻补考
            if(score>=50 && score<=59){
                System.out.println("发挥失常，立刻补考");
            }else{
                //如果分数 低于50，知识有欠缺，先补课，再补考
                System.out.println("知识有欠缺，先补课，再补考");
            }
        }
    }
}

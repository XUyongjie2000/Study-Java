package com.czxy.ifdemo;

public class Demo2 {
    public static void main(String[] args) {
        int score = 76;

        if(score>=90){
            System.out.println("A+");
        }else if(score>=80){
            System.out.println("A");
        }else if(score>=75){
            System.out.println("B");
        }else if(score>=60){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }
}

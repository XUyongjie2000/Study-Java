package com.czxy.demo1;

public class Demo1 {
    public static void main(String[] args) {
        //赋值运算符
        //赋值:   =
        int aa = 10;
        final int BB = 10;
        System.out.println(aa=20);
        //+= ，先做加法，再赋值
        //数学运算：两端都是数字
        int num1=1,num2=2;
        num1+=10;//相当于num1=num1+10
        System.out.println(num1);
        num1+=num2;//相当于num1=num1+num2
        System.out.println(num1);
        //拼接运算：任意一端是字符串
        String str1 = "1";
        str1+=10;//str1 = str1+10;
        System.out.println(str1);

        //-=
        int num3 = 10;
        num3-=1;//num3=num3-1;
        System.out.println(num3);
    }
}

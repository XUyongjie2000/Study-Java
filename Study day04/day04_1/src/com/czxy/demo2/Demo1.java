package com.czxy.demo2;

public class Demo1 {
    public static void main(String[] args) {
        // +
        //数学加法：两端必须是数字类型（byte short int long float double)
        int n1 = 10;
        int n2 = 20;
        System.out.println(n1+n2);

        //正号：默认都是正的
        int n3 = +10;
        System.out.println(n3);

        //拼接字符串：两端有任意一端是字符串，就是拼接字符串
        System.out.println(10+"1"+20);//10120

        // -
        //减号：两端必须是数字类型（byte short int long float double)
        System.out.println(n1-n2);
        //负号：在数字类型前使用
        System.out.println(-20);
        System.out.println(-n1);//不建议
        // *
        //乘号：两端必须是数字类型（byte short int long float double)
        System.out.println(n1*n2);

        // /
        //除号：两端必须是数字类型（byte short int long float double)
        // 不允许除0
        // 有无小数位：两端若都是整数类型（byte short int long），结果就是整数（若有小数位直接截取掉）
        System.out.println(5/2);
        // 有无小数位：若有任意一端是浮点型（float double），结果就是小数
        System.out.println(5.0/2);
        System.out.println(5/2.0);
        System.out.println(5.0/2.0);
        int num1=5,num2=2;
        System.out.println(1.0*num1/num2);
    }
}

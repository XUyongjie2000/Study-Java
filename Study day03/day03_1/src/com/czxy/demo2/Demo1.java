package com.czxy.demo2;

public class Demo1 {
    public static void main(String[] args) {
        //整数型
        int aa = 10;
        aa = 20;
        System.out.println(aa);
        //浮点型
        double bb = 10.55;
        bb = 20.55;
        System.out.println(bb);
        //字符型
        char cc = '范';
        cc='志';
        System.out.println(cc);
        //布尔型
        boolean dd = false;
        dd = true;
        System.out.println(dd);
        //String型
        String ee = "伟哥好";
        ee = "范志伟";
        System.out.println(ee);

        //注意事项：
        //1、再次赋值的数据 和 数据类型必须保持一致
        int num = 10;
        //num = 10.55;
        //num = "10";
        //2、再次赋值的数据 长度 必须符合数据类型的要求
        byte num2 = 127;
        //num2 = 128;
    }
}

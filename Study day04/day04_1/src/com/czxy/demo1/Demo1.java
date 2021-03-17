package com.czxy.demo1;

public class Demo1 {
    public static void main(String[] args) {
        int aa = 10;
        {
            int bb = 20;
            {
                int cc = 30;
                System.out.println(cc);
                System.out.println(bb);
                System.out.println(aa);
            }
            //System.out.println(cc);
            System.out.println(bb);
            System.out.println(aa);
        }
        //System.out.println(cc);
        //System.out.println(bb);
        System.out.println(aa);
    }
}

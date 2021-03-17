package com.czxy.demo1;

public class Demo2 {
    public static void main(String[] args) {
        //char类型写法：不建议
        char a1='传',a2='智',a3='专',a4='修',a5='学',a6='院';
        System.out.print(a1);
        System.out.print(a2);
        System.out.print(a3);
        System.out.print(a4);
        System.out.print(a5);
        System.out.print(a6);

        //String类型：字符串类型  专门用于保存多个字符
        String s1 = "传智专修学院";
        System.out.println(s1);

        //注意事项：
        String s2 = "";//空字符串
        String s3 = "序号\t姓名\t性别\t年龄\t\r\n001\t\t子轩\t不知\t18\t";
        System.out.println(s3);
    }
}

package com.pdx.Ending;

public class ClassTest02 {
    public static void main(String[] args) {
        print2num(10 ,10.1);
        int a = 10;
        int b = 30;
        // 传入的整数隐式转化为浮点数
        print2num(a, b);

        System.out.println(computeArea(3));

        double c = 3.5;
        System.out.println("---------");
        System.out.printf("hello");
        System.out.printf("hello %d people", a);
        System.out.printf("");
        System.out.printf("hello%dpeople", a);
        System.out.println();
        System.out.printf("hello%fpeople", c);
        System.out.println();
        System.out.printf("hello%.2fpeople", c);


        System.out.println();
        char ch1 = '成';
        System.out.printf("a %c letter", ch1);
        System.out.println();
        System.out.printf("a %3c letter", ch1);

        System.out.println();
        double f1 = 2.344552;
        System.out.printf("this %.3f letter", f1);
        System.out.println();
        // 指定长度的时候是“最小长度”
        // 超出自动补偿，缺少则会填补空格，而不会截断
        System.out.printf("this %3f letter", f1);

        System.out.println();
        System.out.println("abc"=="abc");
    }


    public static void print2num(double a, double b){
        System.out.println(a + b);
        System.out.println(a + "  " + b);
    }

    public static double computeArea(double r){
        return 3.1415 * r * r;
    }
}

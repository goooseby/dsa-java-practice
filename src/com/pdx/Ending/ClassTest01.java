package com.pdx.Ending;

import java.util.ArrayList;
import java.util.List;

public class ClassTest01 {
    public static void main(String[] args) {
        // 创建一个数组
        int[] nums = new int[10];
        // 获取数组的长度属于成员属性
        System.out.println(nums.length);  // 10
        nums[0] = 1;
        System.out.println(nums.length);
        //  没有赋值，自动初始化0
        System.out.println(nums[1]);  // 0

        // 创建数组的几种写法
        int[] nums2 = new int[]{1, 2, 3, 4, 5};
        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println("使用地址值来比较数组" + (nums2 == nums3));
        System.out.println(nums2);


        // 字符串的测试
        String str1 = "hello";
        String str2 = "hello";
        // 字符串存储于串池中：故直接比较会返回true，因为两者存储的地址值相同
        System.out.println("使用变量名比较字符串" + (str1 == str2));
        // equals 方法内部也先使用比较引用是否相同。直接返回true
        System.out.println(str1.equals(str2));
        // 获取字符串的长度属于方法
        System.out.println(str1.length());  // 5


        /* 使用该方法创建的字符串，会在堆上和常量池中创建字符串
        但是str3仍然指向堆中的内存
        * */
        String str3 = new String("world");
        // 直接指向了常量池中的字符串
        String str4 = "world";
        System.out.println(str3 == str4);


        List<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("world");
        list1.add("java");
        System.out.println(list1);
        ArrayList<String> list2 = new ArrayList<>();


        Cat c1 = new Cat();
        Animal c2 = new BeautifulCat(30);
        BeautifulCat c3 = new BeautifulCat();

        System.out.println();
        System.out.println(
                "a instanceof B 判断的核心是：\n" +
                        "不看变量 a 的声明类型，而是看变量 a 运行时实际指向的对象的类型。\n" +
                        "判断这个对象的类型是否是 B 类或其子类，或者实现了 B 接口。"
        );
        System.out.println("-----------------");
        System.out.println(c3 instanceof Cat);
        System.out.println(c2 instanceof Cat);

        System.out.println(4 > 5 ? 3.2 : 4);// 4.0
        System.out.println(4 > 5 ? 3 : 4);  // 4


        // 创建对象
        Cat cuteCat = new Cat(12, 12, 12, "可爱猫猫2");
        System.out.println("猫猫的心情值是" + cuteCat.getHappiness());
        System.out.println(new Cat(13, 23, 34, "可爱猫猫"));

        int num1 = 3;
        int num2 = (num1++)/2;
        System.out.println(num2);


        Cat cat1 = new BeautifulCat();
        cat1.meow(3);   // 父类的方法：静态的东西编译绑定
        cat1.sayHello(10);     // 正常的多态实现
        BeautifulCat cat2 = (BeautifulCat) cat1;
        cat2.meow(3);  // 子类的方法
        ///  关键是什么？？
        ///  关键是：静态的东西不要用实例来调用：使用类名调用就灭那么多麻烦

        System.out.println(System.currentTimeMillis());
        System.out.println("hello");
        System.out.println(System.currentTimeMillis());
        System.out.println("world");
        for (int i = 0; i < 10000; i++){
            System.out.print("h");
        }
        System.out.println();
        // 调用运行该行代码的时候，目前的系统时间
        // 如果两次读取时间差异小可能看不出区别
        System.out.println(System.currentTimeMillis());






    }
}

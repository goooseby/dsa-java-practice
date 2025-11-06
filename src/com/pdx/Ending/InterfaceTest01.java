package com.pdx.Ending;

public interface InterfaceTest01 {
    // 这些属性并没有什么多大用
    public double Pi2 = 3.14 * 2;
    public static final double Pi3 = 3.14 * 3;

    // 可以不声明任何东西
    // 因为修饰符是强制的，默认的public static final
    double Pi4 = 3.14 * 4;
    double Pi5 = 3.14 * 5;
    double Pi6 = 3.14 * 6;

    // 接口中的变量统统都是一个属性
    // 即便没有写完整也会自动补全
    public static final double PII = 3.14 * 3.14;

    public abstract void makeNoise();

    public static void hello(){
        System.out.println("hello...");
        System.out.println("接口的静态方法可以通过接口名调用");
    }


}

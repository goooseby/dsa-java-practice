package com.pdx.Ending;

// 抽象类
public abstract class Animal {
    public int age;
    public static double Pi = 3.1415;
    public double weight;
    private double happiness;

    public Animal(){}

    public Animal(int age, double weight, double happiness) {
        this.age = age;
        this.weight = weight;
        this.happiness = happiness;
    }

    // 创建私有属性的访问器和修改器
    public double getHappiness() {
        return happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }

    public abstract void live();

    public abstract void play();
}

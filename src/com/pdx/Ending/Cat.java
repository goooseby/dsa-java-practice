package com.pdx.Ending;

public class Cat extends Animal implements hello{
    // final 修饰的变量可以延迟赋值 不必立刻赋值
    final private String type;   // 一个属性，如果外界只能访问不能修改，则设置为final，创建的时候可以赋值，之后无法修改

    public Cat(){
        this.type = "Cat";
    }

    public Cat(int age, double weight, double happiness, String type){
        super(age, weight, happiness);
        this.type = type;
    }

    // 父类抽象类中的方法
    @Override
    public void live() {

    }

    @Override
    public void play() {
        System.out.println("小猫在玩耍");
    }

    @Override
    public void helloToWorld() {
        hello.super.helloToWorld();
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString(){
        return this.type + " " + this.age + " " + this.weight;
    }

    public static void sayHello(int a){
        System.out.println("hello this is normal Cat");
    }

    public void meow(int a){
        for (int i = 0; i < a; i++){
            System.out.println("NormalCatMeow");
        }
    }
}

package com.pdx.Ending;

public class BeautifulCat extends Cat {
    public int facialScore;

    public BeautifulCat(){
        facialScore = 0;
    }

    public BeautifulCat(int facialScore) {
        this.facialScore = facialScore;
    }

    @Override
    public void meow(int a){
        for (int i = 0; i < a; i++){
            System.out.println("BeautifulCatMeow");
        }
    }
    public static void sayHello(int a){
        System.out.println("hello this is BeautifulCat");
    }
}

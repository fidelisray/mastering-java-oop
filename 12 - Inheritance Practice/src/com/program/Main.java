package com.program;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Hero mightGuy = new Hero("Might Guy", 100, 5);
        Duelist jett = new Duelist("Jett", 100, 20);

        mightGuy.info();
        jett.info();

        mightGuy.attack(jett);
        System.out.println();
        mightGuy.info();
        jett.info();

        jett.attack(mightGuy);
        System.out.println();
        mightGuy.info();
        jett.info();
    }
}

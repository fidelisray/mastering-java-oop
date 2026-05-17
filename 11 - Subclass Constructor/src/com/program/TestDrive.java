package com.program;

public class TestDrive {
    public static void main(String[] args) throws Exception {
        
        Hero hero1 = new Hero("Karina", 30);
        hero1.display();

        HeroAssasin hero2 = new HeroAssasin("Clint", 10);
        hero2.display();
    }
}
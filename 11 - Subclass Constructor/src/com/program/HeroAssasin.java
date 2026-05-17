package com.program;

public class HeroAssasin extends Hero {
    
    HeroAssasin(String name, double attackPower) {
        super(name, attackPower);
    }

    void display() {
        System.out.println("Hero Asassin name : " + this.name);
    }
}

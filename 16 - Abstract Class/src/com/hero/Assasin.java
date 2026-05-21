package com.hero;

public class Assasin extends Hero {
    
    public Assasin(String name, double health) {
        super(name,health);
    }

    public void healUp() {
        double inputHealth = 10;

        System.out.println("\n----------- " + this.getName() + " Healing Up " + inputHealth);

        this.addHealth(inputHealth);
    }
}

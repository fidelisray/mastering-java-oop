package com.hero;

public class Marksman extends Hero {
    
    public Marksman(String name, double health) {
        super(name, health);
    }

    public void healUp() {
        double inputHealth = 25;

        System.out.println("\n----------- " + this.getName() + " Healing Up " + inputHealth);

        this.addHealth(inputHealth);
    }
}

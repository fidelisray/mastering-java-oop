package com.hero;

public class Sentinel extends Hero {
    
    public Sentinel(String name, double health) {
        super(name, health);
    }

    @Override
    public void setName(String name) {
        String nameHero = name + " si Sentinel";
        this.name = nameHero;
    }

    public void display() {
        System.out.println("Nama Hero Sentinel  : " + this.getName());
    }
}

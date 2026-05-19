package com.program;

public class Healer extends Hero {
    
    static private String type = "Healer";
    private double maxHealth;

    public Healer(String heroName, double baseAttack, double baseHealth, double defencePower, double maxHealth) {
        super(heroName, baseAttack, baseHealth, defencePower);
        this.setMaxHealth(maxHealth);
    }

    private void setMaxHealth(double maxHealth) {
        this.maxHealth = maxHealth;
    }

    @Override
    public void info() {
        System.out.println("============================");
        System.out.println("Hero Name \t: " + this.heroName);
        System.out.println("Hero Type \t: " + Healer.type);
        System.out.println("Attack \t\t: " + this.baseAttack);
        System.out.println("Health \t\t: " + this.maxHealth);
        System.out.println("Defence Power \t: " + this.defencePower);
        System.out.println("============================");
    }
}

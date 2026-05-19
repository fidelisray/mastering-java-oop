package com.program;

public class Duelist extends Hero {
    
    private static String type = "Duelist";
    private double attackPower;
    // private double maxAttack;

    public Duelist(String heroName, double baseAttack, double baseHealth, double defencePower, double attackPower) {
        super(heroName, baseAttack, baseHealth, defencePower);
        this.setAttackPower(attackPower);
    }

    private void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    void ultimate() {
        System.out.println("--------------------------- Ultimate");
        System.out.println("ULTIMATE BY " + this.getName() + " !!");
        this.baseAttack = this.baseAttack + (10 * this.attackPower);
    }

    @Override
    public void info() {
        System.out.println("============================");
        System.out.println("Hero Name \t: " + this.heroName);
        System.out.println("Hero Type \t: " + Duelist.type);
        System.out.println("Attack \t\t: " + this.baseAttack);
        System.out.println("Health \t\t: " + this.baseHealth);
        System.out.println("Defence Power \t: " + this.defencePower);
        System.out.println("============================");
    }
}

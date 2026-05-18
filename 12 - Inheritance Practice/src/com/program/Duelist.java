package com.program;

public class Duelist extends Hero {
    
    static String heroType = "Duelist";

    // subclass constructor
    Duelist(String name, double baseHealth, double baseAttack) {
        super(name, baseHealth, baseAttack);
    }

    @Override
    void attack(Hero enemy) {
        System.out.println("---------------------------- Attack");
        System.out.println(this.name + " Attacking " + enemy.name);
        enemy.takeDamage(this.baseAttack * 2, this.name);
    }

    // @Override
    // void takeDamage(double damage, String enemyName) {
    //     System.out.println("---------------------------- Recieve Damage");
    //     System.out.println(this.name + " receive " + (int) damage + " damage from " + enemyName);
    //     this.baseHealth = this.baseHealth - damage;
    // }


    @Override
    public void info() {
        System.out.println("==========================");
        System.out.println("Hero Type   : " + Duelist.heroType);
        System.out.println("Name        : " + this.name);
        System.out.println("Base Health : " + this.baseHealth);
        System.out.println("Base Attack : " + this.baseAttack);
        System.out.println("==========================");
    }
}

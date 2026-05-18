package com.program;

public class Hero {
    
    String name;
    double baseHealth;
    double baseAttack;

    // constructor
    Hero(String name, double baseHealth, double baseAttack) {
        this.setName(name);
        this.setBaseHealth(baseHealth);
        this.setBaseAttack(baseAttack);
    }

    void setName(String name) {
        this.name = name;
    }

    void setBaseHealth(double baseHealth) {
        this.baseHealth = baseHealth;
    }

    void setBaseAttack(double baseAttack) {
        this.baseAttack = baseAttack;
    }

    void attack(Hero enemy) {
        System.out.println("---------------------------- Attack");
        System.out.println(this.name + " Attacking " + enemy.name);
        enemy.takeDamage(this.baseAttack, this.name);
    }

    void takeDamage(double damage, String enemyName) {
        System.out.println("---------------------------- Recieve Damage");
        System.out.println(this.name + " receive " + (int) damage + " damage from " + enemyName);
        this.baseHealth = this.baseHealth - damage;
    }

    public void info() {
        System.out.println("==========================");
        System.out.println("Name        : " + this.name);
        System.out.println("Base Health : " + this.baseHealth);
        System.out.println("Base Attack : " + this.baseAttack);
        System.out.println("==========================");
    }
}

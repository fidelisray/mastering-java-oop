package com.program;

public class Hero {
    
    String name;
    double attackPower;

    Hero(String name, double attackPower) {
        this.setName(name);
        this.setAttackPower(attackPower);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    void display() {
        System.out.println("Hero Name   : " + this.name);
    }
}

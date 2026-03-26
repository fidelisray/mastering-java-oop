package com.program;

class Player {
    String name;
    double health;
    double basicAttack;

    Weapon weapon;
    Armor armor;

    Player(String name, double health, double basicAttack) {
        this.name = name;
        this.health = health;
        this.basicAttack = basicAttack;
    }
}

class Weapon {
    String name;
    String weaponType;
    double damage;

    Weapon(String name, String weaponType, double damage) {
        this.name = name;
        this.weaponType = weaponType;
        this.damage = damage;
    }
}

class Armor {
    String name;
    double armorHealth;

    Armor(String name, double armorHealth) {
        this.name = name;
        this.armorHealth = armorHealth;
    }
}

public class TestDrive {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

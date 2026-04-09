package com.program;

class Player {
    private String name;
    private int baseHealth;
    private int baseAttack;
    private Armor armor;
    private Weapon weapon;

    public Player(String name, int baseHealth, int baseAttack) {
        this.name = name;
        this.baseHealth = baseHealth;
        this.baseAttack = baseAttack;
    }

    public void display() {
        System.out.println("Nama Player : " + this.name);
        System.out.println("Base Health : " + this.baseHealth);
        System.out.println("Base Attack : " + this.baseAttack + "\n");
    }
}

class Armor {
    private String armorName;
    private int health;

    public Armor(String armorName, int health) {
        this.armorName = armorName;
        this.health = health;
    }
}

class Weapon {
    private String weaponName;
    private String weaponType;
    private int damage;

    public Weapon(String weaponName, String weaponType, int damage) {
        this.weaponName = weaponName;
        this.weaponType = weaponType;
        this.damage = damage;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        
        Player sparky = new Player("Sparky White", 80, 20);
        sparky.display();
    }
}

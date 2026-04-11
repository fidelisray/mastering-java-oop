package com.program;

class Player {
    private String name;
    private int baseHealth;
    private int baseAttack;

    private int accumulateHealth = 0;

    private Armor armor;
    private Weapon weapon;

    public Player(String name, int baseHealth, int baseAttack) {
        this.name = name;
        this.baseHealth = baseHealth;
        this.baseAttack = baseAttack;
    }

    public void equipArmor(Armor armor) {
        if (this.armor == null){
            this.armor = armor;
            this.accumulateHealth = this.baseHealth + armor.getAddHealth();
        }
    }

    public void info() {
        System.out.println("Nama Player  : " + this.name);
        System.out.println("Base Health  : " + this.baseHealth);
        System.out.println("Base Attack  : " + this.baseAttack);
        System.out.println("Total Health : " + this.accumulateHealth + "\n");
    }
}

class Armor {
    private String armorName;
    private int strength;
    private int health;

    public Armor(String armorName, int strength, int health) {
        this.armorName = armorName;
        this.strength = strength;
        this.health = health;
    }

    public int getAddHealth() {
        return this.strength * 2 + this.health;
    }

    public void info() {
        System.out.println("Armor Name       : " + this.armorName);
        System.out.println("Armor Strength   : " + this.strength);
        System.out.println("Armor Health     : " + this.health + "\n");
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
        sparky.info();

        Armor bodyArmor = new Armor("Body Armor", 2, 100);
        bodyArmor.info();
        
        sparky.equipArmor(bodyArmor);
        sparky.info();
    }
}

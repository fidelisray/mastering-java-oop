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

    public void player_info() {
        System.out.println("Player Name  : " + this.name);
        System.out.println("Health       : " + this.health);
        System.out.println("Basic Attack : " + this.basicAttack);
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

    public void weapon_info() {
        System.out.println("Wapon Name   : " + this.name);
        System.out.println("Weapon Type  : " + this.weaponType);
        System.out.println("Damage       : " + this.damage);
    }
}

class Armor {
    String name;
    double armorHealth;

    Armor(String name, double armorHealth) {
        this.name = name;
        this.armorHealth = armorHealth;
    }

    public void armor_info() {
        System.out.println("Armor Name   : " + this.name);
        System.out.println("Armor Health : " + this.armorHealth);
    }
}

public class TestDrive {
    public static void main(String[] args) throws Exception {
        
        Player pico = new Player("Pico", 100, 18);

        Weapon usp = new Weapon("Usp", "Pistol", 15);

        Armor bodyArmor = new Armor("Body Armor", 80);

        pico.player_info();
        usp.weapon_info();
        bodyArmor.armor_info();
    }
}

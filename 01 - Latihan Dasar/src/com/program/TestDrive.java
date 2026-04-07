package com.program;

class Player {
    String name;
    double health;
    double basicAttack;

    double accumulateAttack;

    Weapon weapon;
    Armor armor;

    Player(String name, double health, double basicAttack) {
        this.name = name;
        this.health = health;
        this.basicAttack = basicAttack;
        this.accumulateAttack = basicAttack;
    }

    public void equipWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;

        this.accumulateAttack += this.weapon.damage;
        System.out.println(this.name + " memakai senjata " + this.weapon.name);
        playerInfo();
    }

    public void equipArmor(Armor newArmor) {
        this.armor = newArmor;

        this.health += this.armor.armorHealth;
        System.out.println(this.name + " memakai armor " + this.armor.name);
        playerInfo();
    }

    public void attack(Player enemy) {
        enemy.health -= this.accumulateAttack;

        System.out.println(this.name + " menyerang " + enemy.name);
        System.out.println("Nyawa " + this.name + " = " + this.health);
        System.out.println("Nyawa " + enemy.name + " = " + enemy.health);
    }

    public void playerInfo() {
        System.out.println("Player Name  : " + this.name);
        System.out.println("Health       : " + this.health);
        System.out.println("Basic Attack : " + this.basicAttack);
        System.out.println("Total Attack : " + this.accumulateAttack);
        System.out.println();
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

    public void weaponInfo() {
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

    public void armorInfo() {
        System.out.println("Armor Name   : " + this.name);
        System.out.println("Armor Health : " + this.armorHealth);
    }
}

public class TestDrive {
    public static void main(String[] args) throws Exception {
        
        Player pico = new Player("Pico", 100, 18);

        Weapon usp = new Weapon("Usp", "Pistol", 15);

        Armor bodyArmor = new Armor("Body Armor", 80);

        pico.playerInfo();
        System.out.println();
        usp.weaponInfo();
        System.out.println();
        bodyArmor.armorInfo();
        System.out.println();
        
        // pakai senjata dan armor
        pico.equipWeapon(usp);
        pico.equipArmor(bodyArmor);
        
        System.out.println();
        
        Player blacky = new Player("Mr. Black", 100, 35);
        Weapon deagle = new Weapon("Deagle", "Heavy Pistol", 25);
        
        blacky.playerInfo();
        System.out.println();
        deagle.weaponInfo();
        System.out.println();

        blacky.equipArmor(bodyArmor);
        blacky.equipWeapon(deagle);

        System.out.println("=============================");
        System.out.println("Pertarungan dimulai");

        pico.attack(blacky);
        blacky.attack(pico);
    }
}

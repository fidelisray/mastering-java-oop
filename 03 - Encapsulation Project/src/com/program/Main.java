package com.program;

class Player {
    private String name;
    private int baseHealth;
    private int baseAttack;

    private int totalHealth = 0;
    private int attackPower = 0;
    private int level = 1;

    private Armor armor;
    private Weapon weapon;

    public Player(String name, int baseHealth, int baseAttack) {
        this.setName(name);
        this.setBaseHealth(baseHealth);
        this.setBaseAttack(baseAttack);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setBaseHealth(int baseHealth) {
        this.baseHealth = baseHealth;
    }

    private void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public String getName() {
        return this.name;
    }

    public int getBaseHealth() {
        return this.baseHealth;
    }

    public int getBaseAttack() {
        return this.baseAttack;
    }

    public int getTotalHealth() {
        return this.totalHealth;
    }

    public int getAttackPower() {
        return this.attackPower;
    }

    public int getCurrentLevel() {
        return this.level;
    }

    public void equipArmor(Armor armor) {
        if (this.armor == null){
            this.armor = armor;
            this.totalHealth = this.baseHealth + armor.getAddHealth();
        }
    }

    public void equipWeapon(Weapon weapon) {
        if (this.weapon == null) {
            this.weapon = weapon;
            this.attackPower = this.baseAttack + weapon.getAddDamage();
        }
    }

    public void levelUp() {
        this.level += 1;
        this.attackPower += this.level * 10;
    }

    public void attack(Player opponent) {
        // calculate damage
        int damage = this.getAttackPower();
        // print event
        System.out.println("Player " + this.getName() + " Attacking " + opponent.getName() + ", damage = " + damage);

        opponent.defence(damage);
    }

    public void defence(int damage) {
        // calculate delta damage

        int deffencePower = this.armor.getDeffencePower();
        int deltaDamage;

        if (damage > deffencePower) {
            deltaDamage = damage - deffencePower;
        } else {
            deltaDamage = 0;
        }

        this.totalHealth -= deltaDamage;
    }

    public void info() {
        System.out.println("Nama Player  : " + this.name);
        System.out.println("Base Health  : " + this.baseHealth);
        System.out.println("Base Attack  : " + this.baseAttack);
        System.out.println("--------------------------------");
        System.out.println("Total Health : " + this.totalHealth);
        System.out.println("Attack Power : " + this.attackPower);
        System.out.println("\n");
    }
}

class Armor {
    private String armorName;
    private int strength;
    private int health;

    public Armor(String armorName, int strength, int health) {
        this.setArmorName(armorName);
        this.setStrength(strength);
        this.setHealth(health);
    }

    private void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    private void setStrength(int strength) {
        this.strength = strength;
    }

    private void setHealth(int health) {
        this.health = health;
    }

    public String getArmorName() {
        return this.armorName;
    }

    public int getAddHealth() {
        return this.strength * 2 + this.health;
    }

    public int getDeffencePower() {
        return this.strength * 10;
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
        this.setWeaponName(weaponName);
        this.setWeaponType(weaponType);
        this.setDamage(damage);
    }

    private void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    private void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    private void setDamage(int damage) {
        this.damage = damage;
    }

    public String getWeaponName() {
        return this.weaponName;
    }

    public String getWeaponType() {
        return this.weaponType;
    }

    public int getWeaponDamage() {
        return this.damage;
    }

    public int getAddDamage() {
        return this.damage;
    }

    public void info() {
        System.out.println("Weapon Name     : " + this.weaponName);
        System.out.println("Weapon Type     : " + this.weaponType);
        System.out.println("Weapon Damage   : " + this.damage);
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

        Weapon tec9 = new Weapon("Tec 9", "Micro SMG", 25);
        sparky.equipWeapon(tec9);
        sparky.info();

        sparky.levelUp();
        sparky.info();

        System.out.println("=========================================");
        System.out.println("\t\tPertarungan");
        System.out.println("=========================================");

        Player pico = new Player("Pico Margondez", 100, 15);
        Weapon mac10 = new Weapon("Mac-10", "Automatic Gun", 15);

        pico.equipArmor(bodyArmor);
        pico.equipWeapon(mac10);
        
        sparky.info();
        pico.info();
        
        sparky.attack(pico);
        sparky.info();
        pico.info();
    }
}

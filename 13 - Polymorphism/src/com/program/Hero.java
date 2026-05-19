package com.program;

public class Hero {
    
    String heroName;
    double baseAttack;
    double baseHealth;
    double defencePower;

    public Hero(String heroName, double baseAttack, double baseHealth, double defencePower) {
        this.setHeroName(heroName);
        this.setBaseAttack(baseAttack);
        this.setBaseHealth(baseHealth);
        this.setDefencePower(defencePower);
    }
    
    private void setHeroName(String heroName) {
        this.heroName = heroName;
    }
    
    private void setBaseAttack(double baseAttack) {
        this.baseAttack = baseAttack;
    }

    private void setBaseHealth(double baseHealth) {
        this.baseHealth = baseHealth;
    }

    private void setDefencePower(double defencePower) {
        this.defencePower = defencePower;
    }

    public String getName() {
        return this.heroName;
    }

    public void attack(Hero enemy) {
        System.out.println("--------------------------- Attack");
        System.out.println(this.heroName + " Attacking " + enemy.getName());
    }

    public void info() {
        System.out.println("============================");
        System.out.println("Hero Name \t: " + this.heroName);
        System.out.println("Attack \t\t: " + this.baseAttack);
        System.out.println("Health \t\t: " + this.baseHealth);
        System.out.println("Defence Power \t: " + this.defencePower);
        System.out.println("============================");
    } 
}

package com.hero;

public abstract class Hero {
    
    private String name;
    private double health;

    Hero(String name, double health) {
        this.setName(name);
        this.setHealth(health);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setHealth(double health) {
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public double getHealth() {
        return this.health;
    }

    public void info() {
        System.out.println("Hero Name : " + this.getName());
        System.out.println("Health    : " + this.getHealth());
    }
}

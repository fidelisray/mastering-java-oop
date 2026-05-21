package com.program;

public class Agent {
    
    private String name;
    private double health;

    Agent(String name, double health) {
        this.setName(name);
        this.setHealth(health);
    }

    private final void setName(String name) {
        this.name = name;
    }

    private final void setHealth(double health) {
        this.health = health;
    }

    final String getName() {
        return this.name;
    }

    final double getHealth() {
        return this.health;
    }

    public void info() {
        System.out.println("============================");
        System.out.println("-------- Basic Agent");
        System.out.println("Agent name  : " + this.getName());
        System.out.println("Health      : " + this.getHealth());
        System.out.println("============================");
    }
}

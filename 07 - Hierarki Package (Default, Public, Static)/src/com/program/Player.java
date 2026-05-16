package com.program;

public class Player {
    
    private String name;
    private int maxHealth;

    Player(String name, int maxHealth) {
        this.setName(name);
        this.setMaxHealth(maxHealth);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    String getName() {
        return this.name;
    }

    int getMaxHealth() {
        return this.maxHealth;
    }

    void info() {
        System.out.println("Player Name         : " + this.getName());
        System.out.println("Player Max Health   : " + this.getMaxHealth());
    }
}

// class pemain hanya akan bisa digunakan di dalam package com.program
class Pemain {

    private String namaPemain;

    Pemain(String namaPemain) {
        this.namaPemain = namaPemain;
    }

    String getNamaPemain() {
        return this.namaPemain;
    }
}

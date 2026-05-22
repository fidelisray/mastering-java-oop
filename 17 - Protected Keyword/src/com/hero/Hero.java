package com.hero;

public abstract class Hero {
    
    /*
        access modifier 'protected' membuat field/attribute atau method yang dibuat hanya bisa diakses langsung oleh subclass dari class Hero.
    */

    protected String name;
    public double health;

    public Hero(String name, double health) {
        // this.name = name;
        this.setName(name);
        this.health = health;
    }

    protected String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    abstract void display();
}

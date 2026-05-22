package com.program;

public abstract class Hero {
    
    protected String name;

    Hero(String name) {
        this.name = name;
    }

    abstract void display();
}

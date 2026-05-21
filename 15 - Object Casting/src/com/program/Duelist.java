package com.program;

public class Duelist extends Agent {
    
    // private final static String TYPE = "Duelist";
    public String type = "Duelist";
    
    Duelist(String name, double health) {
        super(name, health);
    }

    public void ultimate() {
        System.out.println(this.getName() + " release the ultimate!");
    }

    // @Override
    public void info() {
        System.out.println("============================");
        // System.out.println("-------- Agent " + Duelist.TYPE);
        System.out.println("-------- Agent " + this.type);
        System.out.println("Agent name  : " + this.getName());
        System.out.println("Health      : " + this.getHealth());
        System.out.println("============================");
    }
}

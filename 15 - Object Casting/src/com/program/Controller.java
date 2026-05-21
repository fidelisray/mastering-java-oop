package com.program;

public class Controller extends Agent {
    private final static String TYPE = "Controller";
    
    Controller(String name, double health) {
        super(name, health);
    }

    @Override
    public void info() {
        System.out.println("============================");
        System.out.println("-------- Agent " + Controller.TYPE);
        System.out.println("Agent name  : " + this.getName());
        System.out.println("Health      : " + this.getHealth());
        System.out.println("============================");
    }
}

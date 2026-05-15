package com.program;

class Dog {
    static String type = "Dog";
    private String name;

    Dog(String name) {
        this.name = name;
    }

    void setType(String typeInput) {
        // type = typeInput; // cara 1
        // this.type = typeInput; // cara 2
        Dog.type = typeInput; // cara 3 (yang paling tepat)
    }

    String getType() {
        return Dog.type;
    }

    void display() {
        System.out.println("The Dog's name is " + this.name);
    }
}


public class Main {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Dog pico = new Dog("Pico");
        pico.display();

        Dog sparky = new Dog("Sparky");
        sparky.display();

        pico.setType("Anjing");
        System.out.println("Pico Type : " + pico.getType());
        System.out.println("Sparky Type : " + sparky.getType());
        System.out.println(Dog.type);
    }
}

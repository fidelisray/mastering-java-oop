package com.program;

import java.util.ArrayList;

class Person {

    private static ArrayList<String> names = new ArrayList<String>();
    String name;

    Person(String name) {
        this.name = name;
        Person.setNames(name);
    }

    private static void setNames(String name) {
        Person.names.add(name);
    }

    static ArrayList<String> getNames() {
        return Person.names;
    }

    void display() {
        System.out.println("My Name is " + this.name);
    }
}


public class Main {
    public static void main(String[] args) throws Exception {
        
        Person arje = new Person("Arje");
        Person laras = new Person("Laras Feronika");

        arje.display();
        laras.display();

        System.out.println(Person.getNames());
        // System.out.println(laras.getNames());
    }
}

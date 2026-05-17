package com.program;

// inheritance adalah hubungan 'is_a'

// Sub Class / Child Class / Derived Class
public class ITGuy extends Employee {
    
    String programmingAbility;

    public void setProgrammingAbilty(String programmingAbility) {
        this.programmingAbility = programmingAbility;
    }

    public String getProgrammingAbility() {
        return this.programmingAbility;
    }

    public void showInfo() {
        System.out.println("IT Guy --- ");
        System.out.println("Employee Name      : " + this.getName());
        System.out.println("Employee ID        : " + this.getID());
        System.out.println("Programming Abilty : " + this.getProgrammingAbility());
    }
}

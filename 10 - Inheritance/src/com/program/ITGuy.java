package com.program;

// inheritance adalah hubungan 'is_a'

// Sub Class / Child Class / Derived Class
public class ITGuy extends Employee {
    
    String programmingAbility;
    String companyName = "PT Informatika Media";

    public void setProgrammingAbilty(String programmingAbility) {
        this.programmingAbility = programmingAbility;
    }

    public String getProgrammingAbility() {
        return this.programmingAbility;
    }

    public void setCompanyName(String companyName) {
        super.companyName = companyName;
    }

    public void showInfo() {
        System.out.println("IT Guy --- ");
        System.out.println("Employee Name      : " + this.getName());
        System.out.println("Employee ID        : " + this.getID());
        System.out.println("Programming Abilty : " + this.getProgrammingAbility());
        System.out.println("Company Name       : " + super.companyName);
    }
}

package com.program;

// inheritance adalah hubungan 'is_a'

// Sub Class / Child Class / Derived Class
public class HumanResource extends Employee {
    
    private String hrField;

    public void setField(String hrField) {
        this.hrField = hrField;
    }

    public String getField() {
        return this.hrField;
    }

    public void showInfo() {
        System.out.println("Human Resource -- ");
        System.out.println("Employee Name : " + this.getName());
        System.out.println("Employee ID   : " + this.getID());
        System.out.println("HR Field      : " + this.getField());
    }
}

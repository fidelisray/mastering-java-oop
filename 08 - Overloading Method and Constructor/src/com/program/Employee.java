package com.program;

public class Employee {
    
    private String name;
    private String id;
    private static int employeeCount;

    // Overloading Constructor

    // 1st Option
    Employee(String name, String id) {
        employeeCount++;
        this.name = name;
        this.id = id;
    }

    // 2nd Option
    Employee(String name) {
        employeeCount++;
        this.name = name;
        this.id = "EMP-" + employeeCount;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public void show() {
        System.out.println("Employee Name   : " + this.getName());
        System.out.println("Employee ID     : " + this.getId());
    }
}

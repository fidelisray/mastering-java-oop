package com.program;

// Super Class / Parent Class / Base Class
public class Employee {
    
    private String employeeName;
    private String employeeID;

    // public Employee(String inputName, String inputID) {
    //     this.setEmployeeName(inputName);
    //     this.setEmployeeID(inputID);
    // }

    public void setEmployeeName(String inputName) {
        this.employeeName = inputName;
    }

    public void setEmployeeID(String inputID) {
        this.employeeID = inputID;
    }

    public String getName() {
        return this.employeeName;
    }

    public String getID() {
        return this.employeeID;
    }

    public void showInfo() {
        System.out.println("Employee Name   : " + this.getName());
        System.out.println("Employee ID     : " + this.getID());
    }
}
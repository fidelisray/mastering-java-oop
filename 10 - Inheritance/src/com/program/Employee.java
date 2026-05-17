package com.program;

import java.util.ArrayList;

// Super Class / Parent Class / Base Class
public class Employee {
    
    private String employeeName;
    private String employeeID;
    String companyName = "PT ABC";

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

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getName() {
        return this.employeeName;
    }

    public String getID() {
        return this.employeeID;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void showInfo() {
        System.out.println("Employee --- ");
        System.out.println("Employee Name : " + this.getName());
        System.out.println("Employee ID   : " + this.getID());
        System.out.println("Company Name  : " + this.companyName);
    }
}
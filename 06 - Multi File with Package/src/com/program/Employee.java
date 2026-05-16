package com.program;

class Employee {
    
    String name;
    String NRP;

    Employee(String name, String NRP) {
        this.setName(name);
        this.setNRP(NRP);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setNRP(String NRP) {
        this.NRP = NRP;
    }

    public String getName() {
        return this.name;
    }

    public String getNRP() {
        return this.NRP;
    }

    public void display() {
        System.out.println("Name    : " + this.getName());
        System.out.println("NRP     : " + this.getNRP());
    }
}

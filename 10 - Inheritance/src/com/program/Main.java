package com.program;


public class Main {
    public static void main(String[] args) throws Exception {
        
        Employee pico = new Employee();
        pico.setEmployeeName("Pico Margondez");
        pico.setEmployeeID("EMP-001");

        pico.showInfo();

        ITGuy blacky = new ITGuy();
        blacky.setEmployeeName("Mr Black");
        blacky.setEmployeeID("IT-001");
        
        blacky.showInfo();

        HumanResource sparky = new HumanResource();
        sparky.setEmployeeName("Sparky White");
        sparky.setEmployeeID("HR-001");
        
        sparky.showInfo();
    }
}

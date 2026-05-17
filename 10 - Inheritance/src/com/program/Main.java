package com.program;

// inheritance adalah hubungan 'is_a'


public class Main {
    public static void main(String[] args) throws Exception {
        
        Employee pico = new Employee();
        pico.setEmployeeName("Pico Margondez");
        pico.setEmployeeID("EMP-001");

        pico.showInfo();
        System.out.println();
        
        ITGuy blacky = new ITGuy();
        blacky.setEmployeeName("Mr Black");
        blacky.setEmployeeID("IT-001");
        blacky.setProgrammingAbilty("Javascirpt");
        
        blacky.showInfo();
        System.out.println();
        
        HumanResource sparky = new HumanResource();
        sparky.setEmployeeName("Sparky White");
        sparky.setEmployeeID("HR-001");
        sparky.setField("Attendance");
        
        sparky.showInfo();
        System.out.println();
    }
}

package com.program;

// inheritance adalah hubungan 'is_a'

/*
    Keyword 'this' akan lebih dahulu menunjuk ke attribute milik class tersebut,
    jika tidak ada maka akan otomatis menujuk ke attribute milik parent class nya

    Keyword 'super' akan selalu menujuk attribute milik super class / parent class
*/


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
        
        blacky.setCompanyName("PT Visio Technology");
        
        System.out.println();
        blacky.showInfo();
        System.out.println();
        pico.showInfo();
        System.out.println();
        sparky.showInfo();
        System.out.println();

        Employee fidelis = new Employee();
        fidelis.setEmployeeName("Fidelis Raymond");
        fidelis.setEmployeeID("EMP-002");
        fidelis.showInfo();

        System.out.println("---------------------------------");
        System.out.println("Blacky's Company Name -> " + blacky.getCompanyName());

        ITGuy laras = new ITGuy();
        laras.setEmployeeName("Katarina Larasati Feronika");
        laras.setEmployeeID("IT-002");
        laras.setProgrammingAbilty("Golang");

        laras.showInfo();
    }
}

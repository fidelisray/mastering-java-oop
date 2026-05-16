package com.program;

import com.terminal.Console;

class Main {
    public static void main(String[] args) throws Exception {
        
        Employee katarina = new Employee("Katarina Larasati Feronika", "E-001");
        Employee fidelis = new Employee("Fidelis Raymond", "E-002");

        katarina.display();
        System.out.println("Fidelis's NRP -> " + fidelis.getNRP());

        Console.log("Katarina's NRP -> " + katarina.getNRP());
    }
}

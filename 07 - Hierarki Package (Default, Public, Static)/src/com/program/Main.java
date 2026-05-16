package com.program;

import com.terminal.Console;

// import static method dari Console
import static com.terminal.Console.log;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Player pico = new Player("Pico Margondez", 100);
        pico.info();
        
        Pemain blacky = new Pemain("Mr Blacky");
        System.out.println(blacky.getNamaPemain());

        Console.log(blacky.getNamaPemain() + " adalah anjing French Bulldog");
        log(pico.getName() + " adalah anjing betina yang nakal");
    }
}

/* Tidak bisa membuat class dengan keyword public bersamaan dengan class lain 
    yang sudah dibuat menggunakan keyword public
public class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }
}
 */
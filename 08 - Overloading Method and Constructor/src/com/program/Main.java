package com.program;

class Main {
    public static void main(String[] args) throws Exception {
        
        Employee employee1 = new Employee("Pico Margondez", "EMP-1");
        employee1.show();

        Employee employee2 = new Employee("Peter");
        employee2.show();

        System.out.println("-----------------------------\n");
        System.out.println(Matematika.tambah(1, 2));
        System.out.println(Matematika.tambah(1, 0.5));
        System.out.println(Matematika.tambah(5, 0.4));
        System.out.println(Matematika.tambah(0.3, 0.7));
    }
}

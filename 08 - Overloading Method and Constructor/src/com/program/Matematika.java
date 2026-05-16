package com.program;

public class Matematika {
    
    // Overloading Method

    // 1st Option
    public static int tambah(int x, int y) {
        return x + y;
    }

    // 2nd Option
    public static double tambah(int x, double y) {
        return (double) x + y;
    }

    // 3rd Option
    public static double tambah(double x, int y) {
        return  x + (double) y;
    }

    // 4th Option
    public static double tambah(double x, double y) {
        return x + y;
    }
}

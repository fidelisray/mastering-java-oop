package com.program;

class Player {
    String nama; // default : Dapat diakses/diubah dari dalam dan dari luar class
    public double health; // public : Dapat diakses/diubah dari dalam dan dari luar class
    private double exp; // private : Hanya dapat diakses/diubah dari dalam class saja

    Player (String nama, double health, double exp) {
        this.nama = nama;
        this.health = health;
        this.exp = exp;
    }

    void display() { // akses dari dalam class
        System.out.println("Nama player\t: " + this.nama); 
        System.out.println("Health\t: " + this.health);
        System.out.println("Exp\t: " + this.exp);
        System.out.println();
    }
}

public class AccessModifier {
    
    public static void main(String[] args) {
        
        Player sparky = new Player("Sparky", 100, 25);

        System.out.println(sparky.nama);
        System.out.println(sparky.health);
        // System.out.println(sparky.exp); // error (not visible) : karena diakses dari luar class

        sparky.display();
    }
}

package com.hero;

public class Duelist extends Hero {
    
    public Duelist(String name, double health) {
        super(name,health);
    }

    public void gantiNama(String nama) { // method yang dapat mengakses method milik superclass < method setName()> agar dapat digunakan di luar class 'Duelist' ini 
        super.setName(nama); 
    }

    public void display() {
        System.out.println("Nama Hero Duelist  : " + this.getName());
    }
}

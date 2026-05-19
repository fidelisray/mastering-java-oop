package com.program;

public class Persegi extends BangunRuang {
    
    Persegi(double sisi) {
        super(sisi);
    }

    @Override
    public void info() { // override dari superclass tidak boleh mengurangi 'visibilty'
        // System.out.println("Sisi    : " + this.sisi + " cm"); // tidak dapat akses attribute 'sisi' milik superclass
        System.out.println("Sisi    : " + this.getSisi());
    }
}

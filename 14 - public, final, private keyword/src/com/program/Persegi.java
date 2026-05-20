package com.program;


// public akan membuka akses untuk semua
public class Persegi extends BangunRuang {
    
    private static final String TYPE = "Persegi";

    Persegi(double sisi) {
        super(sisi);
    }

    // override method getPanjang
    /* double getPanjang() { // cannot reduce visibility 
        return this.panjang;
    } */ 

    /*
    @Override
    void luas() { // cannot override final method from superclass
        double luas = this.getSisi() * this.getSisi();
        System.out.println("=============== Luas " + Persegi.TYPE + " -> " + luas);
    }  */

    @Override
    void luas(String tipeBangun) {
        if(tipeBangun == "persegi" && (panjang != 0 && lebar != 0)) {
            double luas = this.panjang * this.lebar;
            System.out.println("=============== Luas " + Persegi.TYPE + " -> " + luas);
        }
    }
    
    // override 
    @Override
    public void setPanjang(double panjang) { // method dengan visibility 'public' bisa dioverride oleh subclass
        this.panjang = panjang;
    }

    public void setLebar(double lebar) { // method local melakukan assignment pada variabel milik superclass
        this.lebar = lebar;
    }

    @Override
    public void info() { // override dari superclass tidak boleh mengurangi 'visibilty'
        System.out.println("==========================");
        // System.out.println("Sisi    : " + this.sisi + " cm"); // tidak dapat akses attribute 'sisi' milik superclass
        System.out.println("Sisi    : " + this.getSisi());
        System.out.println("Panjang : " + this.getPanjang() + " cm");
        System.out.println("Lebar   : " + this.lebar);
        System.out.println("==========================");
    }
}

package com.program;

public class BangunRuang {
    
    private double sisi;
    public double panjang = 0;
    public double lebar = 0;

    BangunRuang(double sisi) {
        this.setSisi(sisi);
    }

    // getter
    public double getSisi() {
        return this.sisi;
    }
    
    public double getPanjang() {
        return this.panjang;
    }

    // setter
    private void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }


    
    // final method
    final void luas() {
        double luas = this.sisi * this.sisi;
        System.out.println("=============== Luas -> " + luas);
    }

    // method 'final' bisa di-overload
    void luas(String tipeBangun) {
        if(tipeBangun == "persegi" && (panjang != 0 && lebar != 0)) {
            double luas = this.panjang * this.lebar;
            System.out.println("=============== Luas -> " + luas);
        }
    }
    

    void info() {
        System.out.println("==========================");
        System.out.println("Sisi    : " + this.getSisi() + " cm");
        System.out.println("Panjang : " + this.getPanjang() + " cm");
        System.out.println("==========================");
    }
}

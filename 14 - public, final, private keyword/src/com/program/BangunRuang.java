package com.program;

public class BangunRuang {
    
    private double sisi;

    BangunRuang(double sisi) {
        this.setSisi(sisi);
    }

    private void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return this.sisi;
    }

    void info() {
        System.out.println("Sisi    : " + this.getSisi() + " cm");
    }
}

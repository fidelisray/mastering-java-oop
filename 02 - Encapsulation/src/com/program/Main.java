package com.program;

class Enkapsulasi {
    public int intPublic;
    private int intPrivate;

    Enkapsulasi(int intPublic, int intPrivate) {
        this.intPublic = intPublic;
        this.intPrivate = intPrivate;
    }

    public int getIntPrivate() {
        return this.intPrivate;
    }

    public void setIntPrivate(int value) {
        this.intPrivate = value;
    }

    public void displayInfo() {
        System.out.println("intPublic \t: " + this.intPublic);
        System.out.println("intPrivate \t: " + this.intPrivate);
    }
}

class Lingkaran {
    private double diameter;
    private double jariJari;

    public Lingkaran(double diameter) {
        this.setDiameter(diameter);
    }


    private void setDiameter(double diameter) {
        this.diameter = diameter;
        this.setJariJari(diameter / 2);
    }

    private void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getDiameter() {
        return this.diameter;
    }

    public double getJariJari() {
        return this.jariJari;
    }

    public void displayInfo() {
        // System.out.printf("Diameter Lingkaran : %1$.2f, Jari Jari Lingkaran : %2$.2f", this.getDiameter(), this.getJariJari());
        System.out.printf("Diameter Lingkaran : %1$.2f, Jari Jari Lingkaran : %2$.2f", this.diameter, this.jariJari);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        
        Enkapsulasi objek1 = new Enkapsulasi(50, 30);
        objek1.displayInfo();
        System.out.println();

        // read and write attribute yang menggunakan keyword public
        objek1.intPublic = 93; // write
        System.out.println("objek1.intPublic = " + objek1.intPublic); // read

        // (keyword private) read only -> Membaca nilai hanya bisa dilakukan menggunakan Method GETTER
        int angka = objek1.getIntPrivate();
        System.out.println("angka dari objek1.intPrivate = " + angka);

        // (keyword private) write only -> Menulis / Mengubah nilai Hanya bisa dilakukan menggunakan Method SETTER
        objek1.setIntPrivate(180); // set nilai intPrivate menggunakan method SETTER

        objek1.displayInfo(); // tampilkan kondisi setelah nilai intPrivate diubah

        // Mini Latihan
        Lingkaran lingkaran1 = new Lingkaran(50);
        lingkaran1.displayInfo();
    }
}

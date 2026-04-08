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
    }
}

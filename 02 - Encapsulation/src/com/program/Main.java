package com.program;

class Enkapsulasi {
    public int intPublic;
    private int intPrivate;

    Enkapsulasi(int intPublic, int intPrivate) {
        this.intPublic = intPublic;
        this.intPrivate = intPrivate;
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
    }
}

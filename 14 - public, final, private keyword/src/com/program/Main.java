package com.program;

// Visibilty
// 1. Public : Jika method atau attribute dalam public secara explisit,
//             maka subclass tidak boleh mengurangi visibilty
// 2. Private : Jika method atau attribute dalam private secara explisit,
//              maka subclass pun tidak dapat mengakses
// 3. Final  : Method dan Attribute dengan keyword final akan diwariskan ke child-class
//             tetapi child-class tidak bisa melakukan overriding.
//             Method dengan keyword final dapat dilakukan overloading di class yang sama dan "tidak harus" dengan visibility yang sama

public class Main {
    public static void main(String[] args) throws Exception {
        
        BangunRuang bangun = new BangunRuang(5);
        Persegi persegi = new Persegi(8);

        bangun.info();
        persegi.info();

        bangun.setPanjang(17);
        persegi.setPanjang(12);

        bangun.info();
        persegi.info();

        
        System.out.println("\n\n");
        bangun.luas();
        persegi.luas();

        persegi.setLebar(6);
        persegi.info();

        persegi.luas("persegi");
    }
}

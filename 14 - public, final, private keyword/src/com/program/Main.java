package com.program;

// Visibilty
// 1. Public : Jika method atau attribute dalam public secara explisit,
//             maka subclass tidak boleh mengurangi visibilty
// 2. Private : Jika method atau attribute dalam private secara explisit,
//              maka subclass pun tidak dapat mengakses

public class Main {
    public static void main(String[] args) throws Exception {
        
        BangunRuang bangun = new BangunRuang(5);
        Persegi persegi = new Persegi(8);

        bangun.info();
        persegi.info();
    }
}

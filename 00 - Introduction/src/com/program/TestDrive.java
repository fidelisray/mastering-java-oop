package com.program;

class Mahasiswa {

    // attributes
    String nama;
    String NIM;
    String prodi;
    String fakultas;

    // constructor
    Mahasiswa(String nama, String NIM, String fakultas, String prodi) {
        this.nama = nama;
        this.NIM = NIM;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }

    public void display() {

        System.out.println("Nama     : " + this.nama);
        System.out.println("NIM      : " + this.NIM);
        System.out.println("Fakultas : " + this.fakultas);
        System.out.println("Prodi    : " + this.prodi);
    }
}

public class TestDrive {
    public static void main(String[] args) throws Exception {
        
        Mahasiswa pico = new Mahasiswa("Pico", "18.K1.0062", "Ilmu Komputer", "Teknik Informatika");

        pico.display();
        // System.out.println(pico.nama_mhs);
    }
}

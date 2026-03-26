package com.program;

class Mahasiswa {

    // attributes
    String nama;
    String NIM;
    String prodi;
    String fakultas;
    private static String universitas = "Soegijapranata Catholic University";

    // constructor
    Mahasiswa(String nama, String NIM, String fakultas, String prodi) {
        // this.nama = nama;
        // this.NIM = NIM;
        // this.prodi = prodi;
        // this.fakultas = fakultas;
        setNama(nama);
        setNIM(NIM);
        this.prodi = prodi;
        this.fakultas = fakultas;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    void setNIM(String NIM) {
        this.NIM = NIM;
    }

    String getNama() {
        return this.nama;
    }

    String getNIM() {
        return this.NIM;
    }

    String greeting(String waktu) {
        return "Hallo " + this.nama + ", Selamat " + waktu;
    }

    void display() {

        System.out.println("Nama     : " + this.getNama());
        System.out.println("NIM      : " + this.getNIM());
        System.out.println("Fakultas : " + this.fakultas);
        System.out.println("Prodi    : " + this.prodi);
        System.out.println("Kampus   : " + Mahasiswa.universitas);
        System.out.println(greeting("Pagi"));
    }
}

public class TestDrive {
    public static void main(String[] args) throws Exception {
        
        Mahasiswa pico = new Mahasiswa("Pico", "18.K1.0062", "Ilmu Komputer", "Teknik Informatika");

        pico.display();
        // System.out.println(pico.nama_mhs);
    }
}

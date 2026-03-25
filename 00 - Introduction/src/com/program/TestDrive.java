package com.program;

class Mahasiswa {

    String nama_mhs;
    String NIM_mhs;
    String prodi_mhs;
    String fakultas_mhs;

    Mahasiswa(String nama, String NIM, String prodi, String fakultas) {
        nama_mhs = nama;
        NIM_mhs = NIM;
        prodi_mhs = prodi;
        fakultas_mhs = fakultas;
    }
}

public class TestDrive {
    public static void main(String[] args) throws Exception {
        
        Mahasiswa pico = new Mahasiswa("Pico", "18.K1.0062", "Teknik Informatika", "Ilmu Komputer");

        System.out.println(pico.nama_mhs);
        System.out.println(pico.prodi_mhs);
    }
}

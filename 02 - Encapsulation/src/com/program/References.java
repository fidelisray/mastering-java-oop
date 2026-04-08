package com.program;

class Buku {

    String judulBuku;
    String penulis;

    Buku(String judulBuku, String penulis) {
        this.judulBuku = judulBuku;
        this.penulis = penulis;
    }

    void display() {
        System.out.println("Judul Buku : " + this.judulBuku);
        System.out.println("Penulis    : " + this.penulis);
        System.out.println();
    }
}


public class References {
    public static void main(String[] args) {
        
        Buku buku1 = new Buku("Rich Dad, Poor Dad", "Robert Kyosaki");

        buku1.display();

        // Menampilkan address
        System.out.println(Integer.toHexString(System.identityHashCode(buku1)));
        System.out.println();

        // assignment object
        Buku buku2 = buku1; // membuat object baru 'buku2' yang assigned by 'buku1'
        buku2.display();

        System.out.println(Integer.toHexString(System.identityHashCode(buku2))); // address buku2
        System.out.println();

        // ubah data judul buku dari object buku2
        buku2.judulBuku = "Rich Kid, Smart Kid";
        buku1.display(); // data judul buku pada 'buku1' akan ikut berubah 
        buku2.display();
        
        // ubah data buku menggunakan function
        fungsiUbah(buku2);

        /* 
            data pada object 'buku1' dan 'buku2' akan tetap sama karena 'buku2' menunjuk pada 
            address yang sama yang dimiliki object 'buku1'. Hal tersebut terjadi karena ketika
            assignment dilakukan, yang terjadi adalah reference assignment (object 'buku2' menunjuk
            pada alamat object 'buku1') 
        */
        buku1.display();
        buku2.display();
    }

    public static void fungsiUbah(Buku dataBuku) {
        String addressDataBuku = Integer.toHexString(System.identityHashCode((dataBuku)));

        System.out.println("Address dalam fungsi = " + addressDataBuku);
        dataBuku.penulis = "Roberto";
    }
}

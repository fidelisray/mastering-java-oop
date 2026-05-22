package com.program;

import com.hero.Duelist;
import com.hero.Sentinel;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Sentinel killJoy = new Sentinel("Kill Joy", 100);

        killJoy.display();

        // mencoba akses public modifier attribute
        System.out.println("Kill Joy's Health : " + killJoy.health); // bisa diakses karena attribute health memiliki access modifier 'default'

        // mencoba akses protected attribute
        // System.out.println("Hero Name : " + killJoy.name); // tidak bisa dilakukan karena field/attribute dengan access modifier protected hanya bisa diakses dari superclass dan subclassnya saja

        killJoy.setName("Killing Joys");
        killJoy.display();

        System.out.println("\n");

        Duelist yoru = new Duelist("Yoru", 150);
        yoru.display();

        // yoru.setName("Yoru si ilang ilangan"); // tidak bisa dilakukan di class Main (di luar class Duelist) karena class 'Duelist' tidak meng-override method setName() dari superclass

        yoru.gantiNama("Yoru cah Jepang");
        yoru.display();
    }
}

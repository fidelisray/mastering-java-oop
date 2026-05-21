package com.program;

// import com.hero.Hero;
import com.hero.Assasin;
import com.hero.Mage;

public class Main {
    public static void main(String[] args) throws Exception {
        
        
        Assasin karina = new Assasin("Karina", 100);

        karina.info();

        // Membuat object class Hero
        // Hero heroKu = new Hero("My Hero", 100); // Cannot instantiate the type Hero, hal ini tidak dapat dilakukan karena class Hero adalah abstract class

        Mage eudora = new Mage("Eudora", 80);
        eudora.info();
    }
}

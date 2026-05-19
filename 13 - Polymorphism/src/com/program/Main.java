package com.program;
public class Main {
    public static void main(String[] args) throws Exception {
        
        Hero myHero = new Hero("Base Hero", 10, 100, 0.5);
        myHero.info();

        Hero reyna = new Duelist("Reyna", 50, 120, 0.3, 2);

        reyna.info();

        // Healer healerBase = new Healer("Healer Base", 5, 100, 10, 2);

        // healerBase.info();

        System.out.println("\n\n");

        // reyna.ultimate(); // the Method 'utlimate' is undefined

        Duelist yoru = new Duelist("Yoru", 45, 125, 0.35, 2.5);
        yoru.info();

        yoru.ultimate();
        yoru.info();

        Hero[] heroLists = new Hero[3];

        heroLists[0] = myHero;
        heroLists[1] = reyna;
        heroLists[2] = yoru;
        
        heroLists[0].info();
        heroLists[1].info();

        // method calls
        // heroLists[2].ultimate(); // the Method 'utlimate' is undefined
        heroLists[2].info();
        
        heroLists[2].attack(heroLists[1]);
    }
}

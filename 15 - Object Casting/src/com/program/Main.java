package com.program;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Duelist raze = new Duelist("Raze", 100);
        
        raze.info();

        // upcasting
        Agent razeUp = (Agent) raze;

        razeUp.info();

        System.out.println("raze type " + raze.type);
        // System.out.println("razeUp type " + razeUp.type); // ketika up casting ada field yang hilang
        raze.ultimate();
        // razeUp.ultimate(); // undefined for type Agent

        System.out.println("\n\n");

        // Down Casting -> Superclass ke Subclass -> tidak bisa dilakukan
        Agent baseAgent = new Agent("Base Agent", 120);
        
        // Controller newAgent = (Controller) baseAgent; // cannot cast from Agent (base class) to Controller (sub class)
        // newAgent.info();

        // Up Casting kemudian Down Casting
        Controller sage = new Controller("Sage", 200);
        sage.info();

        System.out.println("\n---------- Up Casting");
        Agent sageUp = (Agent) sage;
        sageUp.info();
        
        System.out.println("\n---------- Down Casting");
        Controller sageDown = (Controller) sageUp;
        sageDown.info();
    }
}

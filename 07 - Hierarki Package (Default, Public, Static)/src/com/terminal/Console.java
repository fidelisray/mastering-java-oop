package com.terminal;

// import com.program.Player;

public class Console {

    public static void main(String[] args) {

        // Player player1 = new Player("Sparky White", 300);
        // log(player1.getName());
        Terminal.log("\nPrint menggunakan method log milik class Terminal");
    }

    public static void log(String message) {
        System.out.println(message);
    }
}

class Terminal { // class ini hanya bisa diakses dari dalam package com.terminal
    public static void log(String message) {
        System.out.println(message);
    }
}

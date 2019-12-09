package de.deanomus.OGG.fussball2;

public class Programm {


    public static void start() {
        Trainer t = new Trainer("Uwe", 40, 10);
        Player p = new Player("Paul", 3, 0, 0, 0);

        System.out.println(t);
        System.out.println(p);
    }


}

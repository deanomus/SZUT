package de.deanomus.OGG.fussball3;

public class Programm {


    public static void start() {
        Trainer t = new Trainer("Uwe", 40, 10);
        Player p = new Player("Paul", 3, 0, 0, 0);
        Torwart tw = new Torwart("Bob", 99, 0, 0, 10);

        System.out.println(t);
        System.out.println(p);
        System.out.println(tw);
    }


}

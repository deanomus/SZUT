package de.deanomus.OGG.fussballManager.fussball4;

public class Programm {


    public static void start() {
        Trainer uwe = new Trainer("Busfahrer Uwe", 88, 10);
        Torwart max = new Torwart("Max Mustermann", 22, 5, 5, 5);
        Mannschaft ausland = new Mannschaft(uwe, max, "Ausland");

        Player herbert = new Player("Herbertimus", 50, 1, 1, 0);
        Player marcel = new Player("Marcel Eris", 28, 10, 10, 88);

        ausland.addPlayer(herbert);
        ausland.addPlayer(marcel);

        System.out.println(ausland);
    }


}

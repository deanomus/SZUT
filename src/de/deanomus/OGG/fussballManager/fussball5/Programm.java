package de.deanomus.OGG.fussballManager.fussball5;

public class Programm {


    public static void start() {
        //Heim-Team
        Trainer uwe = new Trainer("Busfahrer Uwe", 88, 10);
        Torwart max = new Torwart("Max Mustermann", 22, 5, 5, 5);
        Mannschaft ger = new Mannschaft(uwe, max, "Deutsche Land");

        Player herbert = new Player("Herbertimus", 50, 10, 10, 0);
        Player marcel = new Player("Marcel Eris", 28, 10, 10, 88);
        Player Arnold = new Player("Arnold Schwarzenegger", 72, 10, 10, 0);

        ger.addPlayer(herbert);
        ger.addPlayer(marcel);
        ger.addPlayer(Arnold);

        //Gast Mannschaft
        Trainer erdogan = new Trainer("Recep Erdogan", 88, 10);
        Torwart emine = new Torwart("Emine Erdogan", 22, 5, 5, 5);
        Mannschaft ausland = new Mannschaft(erdogan, emine, "Ausland");

        Player mohammed = new Player("Mohammed", 1643, 10, 10, 0);

        ausland.addPlayer(mohammed);

        Spiel itsTheGameEAsports = new Spiel(ger, ausland);


        Gameplay sm = new Gameplay();
        sm.spielen(itsTheGameEAsports);

//        System.out.println(itsTheGameEAsports);
//        System.out.println(itsTheGameEAsports.getHistory());
    }


}

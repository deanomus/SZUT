/**
 *  Dies ist die Hauptklasse der Anwendung "Die Welt von Zuul".
 *  "Die Welt von Zuul" ist ein sehr einfaches, textbasiertes
 *  Adventure-Game. Ein Spieler kann sich in einer Umgebung bewegen,
 *  mehr nicht. Das Spiel sollte auf jeden Fall ausgebaut werden,
 *  damit es interessanter wird!
 * 
 *  Zum Spielen muss eine Instanz dieser Klasse erzeugt werden und
 *  an ihr die Methode "spielen" aufgerufen werden.
 * 
 *  Diese Instanz erzeugt und initialisiert alle anderen Objekte
 *  der Anwendung: Sie legt alle R�ume und einen Parser an und
 *  startet das Spiel. Sie wertet auch die Befehle aus, die der
 *  Parser liefert, und sorgt f�r ihre Ausf�hrung.
 * 
 * @author  Michael K�lling und David J. Barnes
 * @version 2008.03.30
 */
package de.deanomus.OGG.zuul;

public class Spiel 
{
    private Parser parser;
    private Spieler player;
        
    /**
     * Erzeuge ein Spiel und initialisiere die interne Raumkarte.
     */
    public Spiel()
    {
        raeumeAnlegen();
        parser = new Parser();
    }

    /**
     * Erzeuge alle R�ume und verbinde ihre Ausg�nge miteinander.
     */
    private void raeumeAnlegen()
    {
        Raum
                lichtung,   waldstueck,     taverne,
                hexenhaus,  dorfplatz,      GaesteZimmer,
                keller,     piratenhoehle,  geheimgang,
                window;
      
        // die R�ume erzeugen
        lichtung = new Raum("auf einer Lichtung, umgeben von dunklen Tannen");
        waldstueck = new Raum("im dunklen Wald");
        taverne = new Raum("in der Taverne, mit zwielichtigen Gestalten an der Theke");
        hexenhaus = new Raum("im Hexenhaus");
        dorfplatz = new Raum("auf dem Dorfplatz");
        GaesteZimmer = new Raum("Gästezimmer des Todes");
        keller = new Raum("Keller, der Boden ist Lava");
        piratenhoehle = new Raum("Piratenhöhle, Try to survice, good luck");
        geheimgang = new Raum("Geheimgang mit tödlichen Fallen");


        
        // die Ausg�nge initialisieren
        lichtung.setzeAusgaenge(null, null, null, waldstueck, null, piratenhoehle);
        waldstueck.setzeAusgaenge(null, lichtung, dorfplatz, null);
        taverne.setzeAusgaenge(null, dorfplatz, null, null, taverne, null, dorfplatz);
        hexenhaus.setzeAusgaenge(null, dorfplatz, null, null);
        dorfplatz.setzeAusgaenge(waldstueck, null, taverne, hexenhaus);
        GaesteZimmer.setzeAusgaenge(null, null, null, null, null, taverne);
        keller.setzeAusgaenge(null, null, null, geheimgang, taverne, null);
        geheimgang.setzeAusgaenge(null, piratenhoehle, keller, null);
        piratenhoehle.setzeAusgaenge(null, null, null, geheimgang, lichtung, null);

        //init  player
        player = new Spieler("Hans", lichtung, 50);


        //Gegenstaende ablegen
        lichtung.GegenstandAblegen(new Gegenstand("Korb", "Ein Weidenkorb gefüllt mit Brot", 4));
        taverne.GegenstandAblegen(new Gegenstand("Bierkrug", "ein leckeres dunkles Pils in einem edlen Krug", 2));
        taverne.GegenstandAblegen(new Gegenstand("Teller", "ein Teller mit deftigem Wildscheinfleisch", 5));
        piratenhoehle.GegenstandAblegen(new Gegenstand("Schatztruhe", "eine mit Gold gefüllte Holzkiste", 40));
        piratenhoehle.GegenstandAblegen(new Gegenstand("Schwert", "das Schwert des alten Piratenkapitäns", 10));
        waldstueck.GegenstandAblegen(new Gegenstand("Pilz", "seltsam aussehender Pilz", 1));

    }

    /**
     * Die Hauptmethode zum Spielen. L�uft bis zum Ende des Spiels
     * in einer Schleife.
     */
    public void spielen() 
    {            
        willkommenstextAusgeben();

        // Die Hauptschleife. Hier lesen wir wiederholt Befehle ein
        // und f�hren sie aus, bis das Spiel beendet wird.
                
        boolean beendet = false;
        while (! beendet) {
            Befehl befehl = parser.liefereBefehl();
            beendet = verarbeiteBefehl(befehl);
        }
        System.out.println("Danke f�r dieses Spiel. Auf Wiedersehen.");
    }

    /**
     * Einen Begr��ungstext f�r den Spieler ausgeben.
     */
    private void willkommenstextAusgeben()
    {
        System.out.println();
        System.out.println("Willkommen zu Zuul!");
        System.out.println("Entdecke die Welt von Zuul. Doch Vorsicht, �berall lauern Gefahren!");
        System.out.println("Tippen sie 'help', wenn Sie Hilfe brauchen.");
        System.out.println();
        System.out.println(player.getAktuellerRaum().gibBeschreibung());
    }

    /**
     * Verarbeite einen gegebenen Befehl (f�hre ihn aus).
     * @param befehl Der zu verarbeitende Befehl.
     * @return 'true', wenn der Befehl das Spiel beendet, 'false' sonst.
     */
    private boolean verarbeiteBefehl(Befehl befehl) 
    {
        boolean moechteBeenden = false;

        if(befehl.istUnbekannt()) {
            System.out.println("Ich wei� nicht, was Sie meinen...");
            return false;
        }

        String befehlswort = befehl.gibBefehlswort();
        if (befehlswort.equals("help"))
            hilfstextAusgeben();
        else if (befehlswort.equals("go"))
            wechsleRaum(befehl);
        else if (befehlswort.equals("quit")) {
            moechteBeenden = beenden(befehl);
        } else if (befehlswort.equalsIgnoreCase("look")) {
            umsehen();
        }
        return moechteBeenden;
    }

    // Implementierung der Benutzerbefehle:

    /**
     * Gib Hilfsinformationen aus.
     * Hier geben wir eine etwas alberne und unklare Beschreibung
     * aus, sowie eine Liste der Befehlsw�rter.
     */
    private void hilfstextAusgeben() 
    {
        System.out.println("Sie haben sich verlaufen. Sie sind allein.");
        System.out.println("Sie irren in der Welt von Zuul herum.");
        System.out.println();
        System.out.println("Ihnen stehen folgende Befehle zur Verf�gung:");
        System.out.println(parser.getAlleBefehle());
    }

    /**
     * Versuche, den Raum zu wechseln. Wenn es einen Ausgang gibt,
     * wechsele in den neuen Raum, ansonsten gib eine Fehlermeldung
     * aus.
     */
    private void wechsleRaum(Befehl befehl) 
    {
        if(!befehl.hatZweitesWort()) {
        	// Gibt es kein zweites Wort, wissen wir nicht, wohin...
            System.out.println("Wohin m�chten Sie gehen? | go <Direction> |");
            return;
        }

        String richtung = befehl.gibZweitesWort();

        // Wir versuchen den Raum zu verlassen.
        Raum naechsterRaum = player.getAktuellerRaum().getAusgang(richtung);

        if (naechsterRaum == null) {
            System.out.println("Dort ist keine T�r!");
        }
        else {
            player.geheZu(naechsterRaum);
            System.out.println(player.getAktuellerRaum().gibBeschreibung());
        }
    }

    /**
     * "quit" wurde eingegeben. �berpr�fe den Rest des Befehls,
     * ob das Spiel wirklich beendet werden soll.
     * @return 'true', wenn der Befehl das Spiel beendet, 'false' sonst.
     */
    private boolean beenden(Befehl befehl) 
    {
        if(befehl.hatZweitesWort()) {
            System.out.println("Was soll beendet werden?");
            return false;
        }
        else {
            return true;  // Das Spiel soll beendet werden.
        }
    }

    private void umsehen() {
        System.out.println(player.getAktuellerRaum().gibBeschreibung());
    }
}

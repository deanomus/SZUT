package de.deanomus.OGG.zuul;

import java.util.ArrayList;
import java.util.List;

public class Spieler {

    private String
                Name;
    private Raum aktuellerRaum;

    private int tragkraft;

    private ArrayList<Gegenstand> items;

    public Spieler(String Name ,Raum aktuellerRaum, int tragkraft) {
        this.Name = Name;
        this.tragkraft = tragkraft;
        items = new ArrayList<Gegenstand>();
        this.aktuellerRaum = aktuellerRaum;
    }

    public void geheZu(Raum aktuellerRaum) {
        this.aktuellerRaum = aktuellerRaum;
    }

    public Raum getAktuellerRaum() {
        return aktuellerRaum;
    }

    public int ermittleGewicht() {
        int i = 0;
        for(Gegenstand g : items) i += g.getGewicht();
        return i;
    }

    public boolean pickupItem(Gegenstand g) {
        if(!((ermittleGewicht() + g.getGewicht()) > tragkraft)) {
            if(aktuellerRaum.entferneGegenstand(g)) {
                this.items.add(g);
                return true;
            }
        }
        return false;
    }

    public String showStats() {
        String s = "Ich kann insgesamt " + tragkraft + "kg tragen.\n";
        for(Gegenstand g : this.items) {
            s += g.getName() + " " + g.getGewicht() + "kg\n";
        }
        s += (tragkraft-ermittleGewicht()) + "kg kann ich noch tragen!";

        return s;
    }
}

package de.deanomus.OGG.zuul;

public class Spieler {

    private String
                Name;
    private Raum aktuellerRaum;

    public Spieler(String Name ,Raum aktuellerRaum) {
        this.Name = Name;
        this.aktuellerRaum = aktuellerRaum;
    }

    public void geheZu(Raum aktuellerRaum) {
        this.aktuellerRaum = aktuellerRaum;
    }

    public Raum getAktuellerRaum() {
        return aktuellerRaum;
    }
}

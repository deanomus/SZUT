package de.deanomus.OGG.zuul;

public class Gegenstand {

    private String
            name, beschreibung;
    private Integer gewicht;

    public Gegenstand(String name, String beschreibung, Integer gewicht) {
        this.name = name;
        this.beschreibung = beschreibung;
        this.gewicht = gewicht;
    }

    @Override
    public String toString() {
        return
                name + ", " + beschreibung + ", " + gewicht;
    }

    public Integer getGewicht() {
        return gewicht;
    }

    public String getName() {
        return name;
    }
}

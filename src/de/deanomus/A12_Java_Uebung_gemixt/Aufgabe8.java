package de.deanomus.A12_Java_Uebung_gemixt;


public class Aufgabe8 {

    public static void aufg() {


        int monat = 0;
        double gehalt = 100.0;

        while (gehalt > 50) {
            System.out.printf("\nMonat %d Wirkstofgehlt %f", monat, gehalt);
            gehalt *= 0.96;
            monat++;
        }

    }

}

package de.deanomus.A12_Java_Uebung_gemixt;

import de.deanomus.core.Core;

import java.util.Scanner;

public class Aufgabe8 {
    static Scanner scan = Core.scan;

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

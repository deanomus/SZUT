package de.deanomus.A12_Java_Uebung_gemixt;

import de.deanomus.core.Core;

import java.util.Scanner;

public class Aufgabe1 {

    static Scanner scan = Core.scan;

    public static void aufg() {

        System.out.print("Geben sie den Gesamtbetrag ein (Cent): ");

        int total = scan.nextInt();
        if(total > 1000) {
            total -= (total*0.10);
        }

        System.out.print("\nDiscountpreis: " + total);

    }


}



// Aufgabe 1 — Discountpreise
// Während einer Sonderaktion wird ein Rabatt von 10% auf alle Einkäufe mit einem Gesamtbetrag von mehr als $10.00 gewährt.
// Schreiben Sie ein Programm, das nach dem Gesamtbetrag fragt und den Discountpreis berechnet.
// Der Gesamtbetrag wird in Cent (als Ganzzahl) eingegeben.

package de.deanomus.A12_Java_Uebung_gemixt;

import de.deanomus.core.Core;

import java.util.Scanner;

public class Aufgabe2 {

    static Scanner scan = Core.scan;


    public static void aufg() {

//        5 Cent pro Schraube
//        3 Cent pro Mutter
//        1 Cent pro Unterlegscheibe

        System.out.print("\n\nWieviele Schrauben? ");
        int schrauben = scan.nextInt();
        System.out.print("\nWieviele Muttern? ");
        int muttern = scan.nextInt();
        System.out.print("\nWieviele Unterlegscheiben? ");
        int unterlegscheiben = scan.nextInt();

        if(schrauben > muttern) {
            System.out.print("\n\nKontrollieren sie ihre Bestellung");
        }

        System.out.print("\n\nGesamtbetrag (Cent): " + ((schrauben*5) + (muttern*3) + (unterlegscheiben)));

    }



}


//    Bobs Schrauben Discount verlangt folgende Preise:
//
//        - 5 Cent pro Schraube
//        - 3 Cent pro Mutter
//        - 1 Cent pro Unterlegscheibe
//
//        Schreiben Sie ein Programm, das den Anwender nach der Anzahl der Schrauben, Muttern und Beilegscheiben fragt
//        und dann den Gesamtbetrag berechnet und ausgibt.
//        Zusätzlich überprüft das Programm die Bestellung. Es ist normalerweise ein Fehler, wenn mehr Schrauben
//        als Muttern bestellt werden. In diesem Fall gibt das Programm die Meldung aus "Kontrollieren Sie Ihre Bestellung!".
//        Andernfalls gibt das Programm aus "Die Bestellung ist okay." In jedem Fall wird der Gesamtbetrag ausgegeben.
//

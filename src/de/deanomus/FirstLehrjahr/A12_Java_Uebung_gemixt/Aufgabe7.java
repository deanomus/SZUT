package de.deanomus.FirstLehrjahr.A12_Java_Uebung_gemixt;

import de.deanomus.FirstLehrjahr.core.Core;
import de.deanomus.FirstLehrjahr.util.Data;

import java.util.Scanner;

public class Aufgabe7 {




    static Scanner scan = Core.scan;

    public static void aufg() {
        System.out.print("\nUntergrenze: ");
        int untergrenze = Data.intScan(scan);
        System.out.print("\nObergrenze: ");
        int obergrenze = Data.intScan(scan);


        int summeInner = 0;
        int summeAusser = 0;

        int zahl=1;
        while(zahl!=0) {
            System.out.print("\nDaten eingeben: ");
            zahl = Data.intScan(scan);
            if(zahl >= untergrenze && zahl <= obergrenze) {
                summeInner += zahl;
            } else {
                summeAusser += zahl;
            }
        }

        System.out.print("\n\nSumme innerhalb " + summeInner);
        System.out.print("\nSumme Ausserhalb: " + summeAusser);

    }


}

package de.deanomus.A12_Java_Uebung_gemixt;

import de.deanomus.core.Core;
import de.deanomus.util.Data;

import java.util.Scanner;

public class Aufgabe4 {


    static Scanner scan = Core.scan;


    public static void aufg() {

        System.out.print("\nStartwert: ");
        int start = Data.intScan(scan);
        System.out.print("Endwert: ");
        int end = Data.intScan(scan);

        if (start < end) {
            int re = end - start + 1;
            for (int i = 0; i < re; i++) {
                System.out.println(i + start);
            }
        } else {
            System.out.println("Fehler: Start Wert muss kleiner sein als Endwert!");
        }
    }
}

package de.deanomus.A12_Java_Uebung_gemixt;

import de.deanomus.core.Core;

import java.util.Scanner;

public class Aufgabe5 {

    static Scanner scan = Core.scan;


    public static void aufg() {

        System.out.print("\nGib mir ein Wort: ");
        String word = scan.next();
        int anzahl = word.length();
        System.out.print("\n\n");

        for(int i = 1; i < anzahl; i++) {
            System.out.print(word + "\n");
        }



    }



}

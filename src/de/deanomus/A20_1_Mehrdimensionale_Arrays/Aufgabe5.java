package de.deanomus.A20_1_Mehrdimensionale_Arrays;

import de.deanomus.core.Core;
import de.deanomus.util.Data;

import java.util.Scanner;

public class Aufgabe5 {

    static Scanner scan = Core.scan;


    public static void aufg() {

        System.out.println("\nFür diese Aufgabe existieren 2 Lösungswege!");
        System.out.println(
                "1 = Lösungsweg 1\n" +
                "2 = Lösungsweg 2"
        );

        int i = Data.intScan(scan);
        if(i == 1 || i == 2) System.out.println("Alles klar! Lösungsweg " + i);
        if(i == 1) {
            loesung1();
        } else if(i == 2) {
            loesung2();
        } else {
            System.out.println("Da hat etwas nicht funktioniert!");
            aufg();
        }
    }

    public static void loesung1() {


        int[][] data = {
                {4, 7, 2, 45},
                {8, 3, 21, 3},
                {56, 2, 8, 9},
                {32, 76, 22, 3}
    };
        int[][] summeNach = new int[data.length][data[0].length];



        for ( int zeile=0; zeile < data.length; zeile++) {
            for ( int spalte = 0; spalte < data[zeile].length; spalte++) {
                int summeNachbarn = 0;

                if(spalte>0) summeNachbarn += data[zeile][spalte-1];    // Linker Nachbar
                if(spalte>0 && zeile>0) summeNachbarn += data[zeile-1][spalte-1];   //oberer Linker Nachbar
                if(zeile>0) summeNachbarn += data[zeile-1][spalte]; //oben
                if(zeile>0 && spalte<data[zeile].length-1) summeNachbarn += data[zeile-1][spalte+1]; //oberer Rechter Nachbar
                if(spalte<data[zeile].length-1) summeNachbarn += data[zeile][spalte+1]; //rechter Nachbar
                if(zeile<data.length-1 && spalte<data[zeile].length-1) summeNachbarn += data[zeile+1][spalte+1]; //unterer rechter Nachbar
                if(zeile<data.length-1) summeNachbarn += data[zeile+1][spalte]; //unterer Nachbar
                if(zeile<data.length-1 && spalte>0) summeNachbarn += data[zeile+1][spalte-1]; //unterer Linker Nachbar

                summeNach[zeile][spalte] += summeNachbarn;
            }
        }



        // -> Ausgabe
        for ( int zeile=0; zeile < data.length; zeile++)
        {
            System.out.println("");
            for ( int spalte = 0; spalte < data[zeile].length; spalte++)
            {
                System.out.print(data[zeile][spalte] + " | ");
            }
        }
        System.out.println("\nSumme Nachbarn:");
        for ( int zeile=0; zeile < data.length; zeile++)
        {
            for ( int spalte = 0; spalte < summeNach[zeile].length; spalte++)
            {
                System.out.print(summeNach[zeile][spalte] + " | ");
            }
            System.out.println("");
        }

    }


    public static void loesung2() {


        int[][] data = { {4, 7, 2, 45},
                {8, 3, 21, 3},
                {56, 2, 8, 9},
                {32, 76, 22, 3} };

        int[][] erg = new int[data.length][data[0].length];

        for (int zeile=0;zeile<data.length;zeile++) {
            for(int spalte=0;spalte<data[zeile].length;spalte++) {
                int summeNachbarn=0;
                int colCount=data[zeile].length;
                int rowCount=data.length;
                // oben links
                if(zeile>0 && spalte>0) {
                    summeNachbarn+=data[zeile-1][spalte-1];
                }
                // oben
                if(zeile>0) {
                    summeNachbarn+=data[zeile-1][spalte];
                }
                // oben rechts
                if(zeile>0 && spalte<colCount-1) {
                    summeNachbarn+=data[zeile-1][spalte];
                }
                // rechts
                if(spalte<colCount-1) {
                    summeNachbarn+=data[zeile][spalte+1];
                }
                // unten rechts
                if(spalte<colCount-1 && zeile<rowCount-1) {
                    summeNachbarn+=data[zeile+1][spalte+1];
                }
                // unten
                if(zeile<rowCount-1) {
                    summeNachbarn+=data[zeile+1][spalte];
                }
                // unten links
                if(zeile<rowCount-1 && spalte>0) {
                    summeNachbarn+=data[zeile+1][spalte-1];
                }
                // links
                if(spalte>0) {
                    summeNachbarn+=data[zeile][spalte-1];
                }
                erg[zeile][spalte]=summeNachbarn;
            }
        }

        for (int zeile=0;zeile<data.length;zeile++) {
            for (int spalte = 0; spalte < data[zeile].length; spalte++) {
                System.out.print(erg[zeile][spalte] + " | ");
            }
            System.out.println();
        }

    }


}

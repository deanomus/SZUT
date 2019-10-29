package de.deanomus.A20_1_Mehrdimensionale_Arrays;

import de.deanomus.core.Core;

import java.util.Scanner;

public class Aufgabe5 {

    Scanner scan = Core.scan;

    public static void aufg() {


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

                // Linker Nachbar
//              | 0 | 0 | 0 |
//              | 1 | X | 0 |
//              | 0 | 0 | 0 |
                if(spalte>0) {
                    summeNachbarn += data[zeile][spalte-1];
                }

                //oberer Linker Nachbar
//              | 1 | 0 | 0 |
//              | 0 | X | 0 |
//              | 0 | 0 | 0 |
                if(spalte>0 && zeile>0) {
                    summeNachbarn += data[zeile-1][spalte-1];
                }
                //oben
//              | 0 | 1 | 0 |
//              | 0 | X | 0 |
//              | 0 | 0 | 0 |
                if(zeile>0) {
                    summeNachbarn += data[zeile-1][spalte];
                }
                //oberer Rechter Nachbar
//              | 0 | 0 | 1 |
//              | 0 | X | 0 |
//              | 0 | 0 | 0 |
                if(zeile>0 && spalte<data[zeile].length-1) {
                    summeNachbarn += data[zeile-1][spalte+1];
                }
                //rechter Nachbar
//              | 0 | 0 | 0 |
//              | 0 | X | 1 |
//              | 0 | 0 | 0 |
                if(spalte<data[zeile].length-1) {
                    summeNachbarn += data[zeile][spalte+1];
                }
                //unterer rechter Nachbar
//              | 0 | 0 | 0 |
//              | 0 | X | 0 |
//              | 0 | 0 | 1 |
                if(zeile<data.length-1 && spalte<data[zeile].length-1) {
                    summeNachbarn += data[zeile+1][spalte+1];
                }
                //unterer Nachbar
//              | 0 | 0 | 0 |
//              | 0 | X | 0 |
//              | 0 | 1 | 0 |
                if(zeile<data.length-1) {
                    summeNachbarn += data[zeile+1][spalte];
                }
                //unterer Linker Nachbar
//              | 0 | 0 | 0 |
//              | 0 | X | 0 |
//              | 1 | 0 | 0 |
                if(zeile<data.length-1 && spalte>0) {
                    summeNachbarn += data[zeile+1][spalte-1];
                }

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


}

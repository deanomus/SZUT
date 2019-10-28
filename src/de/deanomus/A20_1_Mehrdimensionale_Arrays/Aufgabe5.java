package de.deanomus.A20_1_Mehrdimensionale_Arrays;

import de.deanomus.core.Core;

import java.util.Scanner;

public class Aufgabe5 {

    Scanner scan = Core.scan;

    public static void aufg() {


        Integer[][] data = {
                {4, 7, 2, 45},
                {8, 3, 21, 3},
                {56, 2, 8, 9},
                {32, 76, 22, 3}
    };



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
                if(zeile>0) {
                    summeNachbarn += data[zeile-1][spalte];
                }
                //oberer Rechter Nachbar
                if(zeile>0 && zeile<data[zeile].length-1) {
                    summeNachbarn += data[zeile-1][spalte+1];
                }
                //rechter Nachbar



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

    }


}

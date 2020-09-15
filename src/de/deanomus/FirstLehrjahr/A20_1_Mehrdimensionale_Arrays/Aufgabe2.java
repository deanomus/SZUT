package de.deanomus.FirstLehrjahr.A20_1_Mehrdimensionale_Arrays;


public class Aufgabe2 {


    public static void aufg() {




        int[][] data = { {3, 2, 5, 7},
                {1, 4, 4, 8},
                {9, 1, 0, 2},
                {0, 2, 6, 3} };
        // Summe deklarieren
        int summe = 0;
        // Summe berechnen
        for ( int zeile=0; zeile < data.length; zeile++)
        {
            summe = 0;
            for ( int spalte = 0; spalte < data[zeile].length; spalte++)
            {
                summe += data[zeile][spalte];
            }
            System.out.println("Summe von Zeile " + zeile + " ist: " + summe);
        }

        // Summe ausgeben




    }




}

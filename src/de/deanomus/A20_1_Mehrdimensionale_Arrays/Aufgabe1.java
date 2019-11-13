package de.deanomus.A20_1_Mehrdimensionale_Arrays;


public class Aufgabe1 {


//    Aufgabe 1 — Summe aller Arrayelemente:
//    Vervollständigen Sie das folgende Programm, so dass
//    es die Summe aller Elemente des Arrays berechnet.
//    Schreiben Sie das Programm, so dass es sogar dann
//        funktioniert, wenn die Dimensionen der Zeilen und
//    Spalten geändert werden. (Mit anderen Worten,
//    verwenden Sie eher length als fest kodierte Zahlen).

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
            for ( int spalte = 0; spalte < data[zeile].length; spalte++)
            {
                summe += data[spalte][zeile];
            }
        }

        // Summe ausgeben
        System.out.println("Summe: " + summe);




    }



}

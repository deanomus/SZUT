package de.deanomus.A20_1_Mehrdimensionale_Arrays;

import java.util.HashMap;

public class Aufgabe3 {

    public static HashMap<Integer, Integer> summen = new HashMap<Integer, Integer>();

    public static void aufg() {




        int[][] data = { {3, 2, 5, 7},
                {1, 4, 4, 8},
                {9, 1, 0, 2},
                {0, 2, 6, 3} };
        // Summe deklarieren
        int summe = 0;



        for ( int spalte=0; spalte < data[0].length; spalte++)
        {
            summe = 0;
            for ( int zeile = 0; zeile < data.length; zeile++)
            {
                summe += data[zeile][spalte];
            }
            System.out.println("Summe von Spalte " + spalte + " ist: " + summe);
        }






        // Summe berechnen
//        for ( int zeile=0; zeile < data.length; zeile++)
//        {
//            for ( int spalte = 0; spalte < data[zeile].length; spalte++)
//            {
//                int temp = 0;
//                if(!(summen.get(spalte) == null)) {
//                    summen.get(spalte);
//                }
//
//                summen.put(spalte, (temp+data[zeile][spalte]));
//            }
//        }
//
//        // Summe ausgeben
//        for(int i=0; i < summen.size(); i++) {
//            System.out.println("Summe von Spalte " + i + " ist: " + summen.get(i));
//        }



    }
}

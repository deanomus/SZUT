package de.deanomus.FirstLehrjahr.A20_1_Mehrdimensionale_Arrays;


public class Aufgabe4 {


    public static void aufg() {



        int[][] data = { {3, 2, 5, 7},
                {1, 4, 4, 8},
                {9, 1, 0, 2},
                {0, 2, 6, 3} };
        // Summe deklarieren
        Integer min = null;
        Integer max = null;
        // Summe berechnen
        for ( int zeile=0; zeile < data.length; zeile++)
        {
            for ( int spalte = 0; spalte < data[zeile].length; spalte++)
            {
                if(min==null) min = data[zeile][spalte];
                if(max==null) max = data[zeile][spalte];

                if(min > data[zeile][spalte]) min = data[zeile][spalte];
                if(max < data[zeile][spalte]) max = data[zeile][spalte];

            }
        }

        // Summe ausgeben
        System.out.println("Min: " + min + "| Max: " + max);



    }
}

package de.deanomus.A15_1_ArbeitsauftragArrays;

public class Aufgabe4 {


    public static void aufg() {

        int[] array = {3, 2, 5, 7, 9, 12, 97, 24, 54};

        // drei Variablen für die Summen deklarieren und initialisieren
        int uSumme = 0;
        int gSumme = 0;
        int Summe = 0;

        // Summen berechnen
        for ( int index = 0; index < array.length; index++ ) {



            if(array[index]>0) {
                Summe += array[index];
                if (array[index] % 2 == 0) {
                    gSumme += array[index];
                } else uSumme += array[index];
            }

        }

        // Summen ausgeben
        System.out.println("Gesamt: " + Summe + "\nGerade Summe: " + gSumme + " \nUngerade Summe " + uSumme);

    }


}

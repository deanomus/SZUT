package de.deanomus.FirstLehrjahr.A15_1_ArbeitsauftragArrays;

public class Aufgabe5 {



    public static void aufg() {



        int[] array = {3, 1, 5, 7, 4, 12, -3, 8, -2};

        // Variablen für die zwei größten Elemente
        //deklarieren und initialisieren
        int one = 0;
        int two = 0;


        // die zwei größten Elemente berechnen
        for ( int index=0 ; index < array.length; index++) {
            if(one == 0) one = array[index];
            if(two == 0) two = array[index];


            if(one<array[index]) {
                two = one;
                one = array[index];
            } else if(two<array[index]) two = array[index];

        }

        // die zwei größten Elemente ausgeben
        System.out.println("Biggest Werte: " + one + " + " + two);






    }




}

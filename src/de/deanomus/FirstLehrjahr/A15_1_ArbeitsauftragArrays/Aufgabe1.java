package de.deanomus.FirstLehrjahr.A15_1_ArbeitsauftragArrays;

public class Aufgabe1 {


    public static void aufg() {
        int[] arr = {13, -4, 82, 17};
        int[] doppelt = {arr[0]*2, arr[1]*2, arr[2]*2, arr[3]*2};
        System.out.println( "Urspruengliches Array: "
                + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] );

        // Konstruieren Sie ein Arrayobjekt für doppelt.
        // Stellen Sie Werte in doppelt, die zweimal so groß sind
        // als ihre entsprechenden Werte in arr

        System.out.println( "Neues Array: "
                + doppelt[0] + " " + doppelt[1] + " "
                + doppelt[2] + " " + doppelt[3] );
    }





}

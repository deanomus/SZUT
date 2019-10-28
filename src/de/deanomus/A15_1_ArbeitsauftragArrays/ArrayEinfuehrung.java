package de.deanomus.A15_1_ArbeitsauftragArrays;

public class ArrayEinfuehrung {

    public static void aufg() {

        // Deklaration
        int[] arr;
        int arr2[];

        // Fehler, da nur deklariert
        //arr[1]=5;

        // Initialisierung
        arr = new int[10];

        // Deklaration und Initialisierung
        int foo[] = new int[10];

        // Werte in das Array schreiben
        arr[0] = 1421321;
        arr[9] = 21321;

        // Fehler, da index 10 nicht existiert
        // arr[10] = 2313;
        // arr[-1] = 213;
        // arr[1.5] =213;

        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = 2 * arr[i - 1];
        }
        //   einzelne Element  :   container/Liste
        for (int a : arr) {
            System.out.println(a);
        }

        int bar[] = {23, 12, 1, 9, 7, 5};
        for (int a : bar) {
            System.out.print(a + ", ");
        }

    }
}

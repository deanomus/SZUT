package de.deanomus.A15_1_ArbeitsauftragArrays;


public class Aufgabe7 {

    public static void aufg() {


        int[] signal  = {1, 5, 4, 5, 7, 6, 8, 6, 5, 4, 5, 4};
        int[] geglaettet = new int[signal.length];

        // berechnen Sie den geglätteten Wert für jeden Slot
        // von Array geglaettet
        for (int i=0; i < signal.length; i++) {
            int temp = 0;
            int uses = 1;
            if(i>0) {
                temp += signal[i-1];
                uses++;
            }
            if(i<(signal.length-1)) {
                temp += signal[i+1];
                uses++;
            }
            temp += signal[i];
            temp /= uses;
            geglaettet[i] = temp;
        }

        // Geben Sie den Input aus
        System.out.print("\nEingabe: ");
        for ( int j = 0; j < geglaettet.length; j++) {

            System.out.print(signal[j] + " ");

        }

        // Geben Sie das Ergebnis aus
        System.out.print("\nAusgabe: ");
        for ( int j = 0; j < geglaettet.length; j++) {

            System.out.print(geglaettet[j] + " ");

        }



    }


}

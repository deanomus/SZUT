package de.deanomus.A15_1_ArbeitsauftragArrays;

public class Aufgabe6 {


    public static void aufg() {

        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        String right = "";
        String umgekehrt = "";
        for ( int index=0 ; index < array.length; index++) {
            right += array[index] + " ";
        }

        for(int i = 0; i < array.length / 2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        for ( int index=0 ; index < array.length; index++) {
            umgekehrt += array[index] + " ";
        }

        System.out.println("1. " + right);
        System.out.println("2. " + umgekehrt);


    }
}

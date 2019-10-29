package de.deanomus.core;

import de.deanomus.A12_Java_Uebung_gemixt.Aufgabe1;
import de.deanomus.A12_Java_Uebung_gemixt.Aufgabe2;
import de.deanomus.A12_Java_Uebung_gemixt.Aufgabe5;
import de.deanomus.A12_Java_Uebung_gemixt.Aufgabe7;
import de.deanomus.A12_Java_Uebung_gemixt.Aufgabe8;
import de.deanomus.A12_Java_Uebung_gemixt.Aufgabe9;
import de.deanomus.A12_Java_Uebung_gemixt.Aufgabe10;
import de.deanomus.A12_Java_Uebung_gemixt.Aufgabe12;

import de.deanomus.util.Data;

import java.util.Scanner;

public class Core {


    public static Scanner scan;

    public static void main(String[] args) {

        scan = new Scanner(System.in);

        choose();

    }



    public static void choose() {

        System.out.println("\n\nWelche Kategorie?");
        System.out.println(
                        "1 = 12_Java_Uebung_gemixt\n" +
                        "2 = 15.1_ArbeitsauftragArrays\n" +
                        "3 = 20.1_Mehrdimensionale_Arrays"
        );

        int kate = Data.intScan(scan);
        System.out.println("\nWelche Aufgabe?:");
        if(kate == 1) {
            System.out.println(
                            "1 = Aufgabe 1\n" +
                            "2 = Aufgabe 2\n" +
                            "5 = Aufgabe 5\n" +
                            "7 = Aufgabe 7\n" +
                            "8 = Aufgabe 8\n" +
                            "9 = Aufgabe 9\n" +
                            "10 = Aufgabe 10\n" +
                            "12 = Aufgabe 12"
            );
        } else if(kate == 2) {
            System.out.println(
                    "0 = ArrayEinfuehrung\n" +
                    "1 = Aufgabe 1\n" +
                    "2 = Aufgabe 2\n" +
                    "3 = Aufgabe 3\n" +
                    "4 = Aufgabe 4\n" +
                    "5 = Aufgabe 5\n" +
                    "6 = Aufgabe 6"
            );
        } else if(kate == 3) {
            System.out.println(
                    "1 = Aufgabe 1\n" +
                    "2 = Aufgabe 2\n" +
                    "3 = Aufgabe 3\n" +
                    "4 = Aufgabe 4\n" +
                    "5 = Aufgabe 5"
                    );

        }else System.out.println("Oops, Fehler! Keine Aufgaben fuer diese Kategorie gefunden :/");

        int aufg = Data.intScan(scan);

        //Kategorie 1 -> Aufgaben
        if(kate== 1 && aufg == 1) Aufgabe1.aufg();
        if(kate== 1 && aufg == 2) Aufgabe2.aufg();
        if(kate== 1 && aufg == 5) Aufgabe5.aufg();
        if(kate== 1 && aufg == 7) Aufgabe7.aufg();
        if(kate== 1 && aufg == 8) Aufgabe8.aufg();
        if(kate== 1 && aufg == 9) Aufgabe9.aufg();
        if(kate== 1 && aufg == 10) Aufgabe10.aufg();
        if(kate== 1 && aufg == 12) Aufgabe12.aufg();
        //Kategorie 2 -> Aufgaben
        if(kate== 2 && aufg == 0) de.deanomus.A15_1_ArbeitsauftragArrays.ArrayEinfuehrung.aufg();
        if(kate== 2 && aufg == 1) de.deanomus.A15_1_ArbeitsauftragArrays.Aufgabe1.aufg();
        if(kate== 2 && aufg == 2) de.deanomus.A15_1_ArbeitsauftragArrays.Aufgabe2.aufg();
        if(kate== 2 && aufg == 3) de.deanomus.A15_1_ArbeitsauftragArrays.Aufgabe3.aufg();
        if(kate== 2 && aufg == 4) de.deanomus.A15_1_ArbeitsauftragArrays.Aufgabe4.aufg();
        if(kate== 2 && aufg == 5) de.deanomus.A15_1_ArbeitsauftragArrays.Aufgabe5.aufg();
        if(kate== 2 && aufg == 6) de.deanomus.A15_1_ArbeitsauftragArrays.Aufgabe6.aufg();
        //Kategorie 3 -> Aufgaben
        if(kate == 3 && aufg == 1) de.deanomus.A20_1_Mehrdimensionale_Arrays.Aufgabe1.aufg();
        if(kate == 3 && aufg == 2) de.deanomus.A20_1_Mehrdimensionale_Arrays.Aufgabe2.aufg();
        if(kate == 3 && aufg == 3) de.deanomus.A20_1_Mehrdimensionale_Arrays.Aufgabe3.aufg();
        if(kate == 3 && aufg == 4) de.deanomus.A20_1_Mehrdimensionale_Arrays.Aufgabe4.aufg();
        if(kate == 3 && aufg == 5) de.deanomus.A20_1_Mehrdimensionale_Arrays.Aufgabe5.aufg();
        // -> Exit
        if(kate== 0 && aufg == 0) return;


        System.out.print("\n");
        choose();

    }


}
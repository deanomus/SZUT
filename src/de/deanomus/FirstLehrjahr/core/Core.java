package de.deanomus.FirstLehrjahr.core;

import de.deanomus.FirstLehrjahr.OGG.fussballManager.FussballVersion;
import de.deanomus.FirstLehrjahr.util.Data;

import java.util.Scanner;

public class Core {


    public static Scanner scan;
    public static final Boolean DEBUG = false;

    public static void main(String[] args) {

        scan = new Scanner(System.in);

        choose();

    }


    public static void choose() {

        System.out.println("\n\nWelche Kategorie?");
        System.out.println(
                "1 = 12_Java_Uebung_gemixt\n" +
                        "2 = 15.1_ArbeitsauftragArrays\n" +
                        "3 = 20.1_Mehrdimensionale_Arrays\n" +
                        "4 = Other (OOP, Trash-Mash)"
        );

        int kate = Data.intScan(scan);
        System.out.println("\nWelche Aufgabe?:");
        if (kate == 0) {
            System.out.println("Exit with -> 0");
        } else if (kate == 1) {
            System.out.println(
                    "1 = Aufgabe 1\n" +
                            "2 = Aufgabe 2\n" +
                            "3 = Aufgabe 3\n" +
                            "4 = Aufgabe 4\n" +
                            "5 = Aufgabe 5\n" +
                            "7 = Aufgabe 7\n" +
                            "8 = Aufgabe 8\n" +
                            "9 = Aufgabe 9\n" +
                            "10 = Aufgabe 10\n" +
                            "12 = Aufgabe 12"
            );
        } else if (kate == 2) {
            System.out.println(
                    "0 = ArrayEinfuehrung\n" +
                            "1 = Aufgabe 1\n" +
                            "2 = Aufgabe 2\n" +
                            "3 = Aufgabe 3\n" +
                            "4 = Aufgabe 4\n" +
                            "5 = Aufgabe 5\n" +
                            "6 = Aufgabe 6\n" +
                            "7 = Aufgabe 7"
            );
        } else if (kate == 3) {
            System.out.println(
                    "1 = Aufgabe 1\n" +
                            "2 = Aufgabe 2\n" +
                            "3 = Aufgabe 3\n" +
                            "4 = Aufgabe 4\n" +
                            "5 = Aufgabe 5"
            );

        } else if (kate == 4) {
            System.out.println(
                    "1 = Durchschnitt Integer\n" +
                            "2 = GameOfLife\n" +
                            "3 = Fussball-Manager\n" +
                            "4 = RDM-Tester\n" +
                            "5 = Zuul\n" +
                            "6 = Sortieralgorithmen\n" +
                            "7 = MD5Hash"
            );
        } else System.out.println("Oops, Fehler! Keine Aufgaben fuer diese Kategorie gefunden :/");

        int aufg = Data.intScan(scan);

        //Kategorie 1 -> Aufgaben
        if (kate == 1 && aufg == 1) de.deanomus.FirstLehrjahr.A12_Java_Uebung_gemixt.Aufgabe1.aufg();
        if (kate == 1 && aufg == 2) de.deanomus.FirstLehrjahr.A12_Java_Uebung_gemixt.Aufgabe2.aufg();
        if (kate == 1 && aufg == 3) de.deanomus.FirstLehrjahr.A12_Java_Uebung_gemixt.Aufgabe3.aufg();
        if (kate == 1 && aufg == 4) de.deanomus.FirstLehrjahr.A12_Java_Uebung_gemixt.Aufgabe4.aufg();
        if (kate == 1 && aufg == 5) de.deanomus.FirstLehrjahr.A12_Java_Uebung_gemixt.Aufgabe5.aufg();
        if (kate == 1 && aufg == 7) de.deanomus.FirstLehrjahr.A12_Java_Uebung_gemixt.Aufgabe7.aufg();
        if (kate == 1 && aufg == 8) de.deanomus.FirstLehrjahr.A12_Java_Uebung_gemixt.Aufgabe8.aufg();
        if (kate == 1 && aufg == 9) de.deanomus.FirstLehrjahr.A12_Java_Uebung_gemixt.Aufgabe9.aufg();
        if (kate == 1 && aufg == 10) de.deanomus.FirstLehrjahr.A12_Java_Uebung_gemixt.Aufgabe10.aufg();
        if (kate == 1 && aufg == 12) de.deanomus.FirstLehrjahr.A12_Java_Uebung_gemixt.Aufgabe12.aufg();
        //Kategorie 2 -> Aufgaben
        if (kate == 2 && aufg == 0) de.deanomus.FirstLehrjahr.A15_1_ArbeitsauftragArrays.ArrayEinfuehrung.aufg();
        if (kate == 2 && aufg == 1) de.deanomus.FirstLehrjahr.A15_1_ArbeitsauftragArrays.Aufgabe1.aufg();
        if (kate == 2 && aufg == 2) de.deanomus.FirstLehrjahr.A15_1_ArbeitsauftragArrays.Aufgabe2.aufg();
        if (kate == 2 && aufg == 3) de.deanomus.FirstLehrjahr.A15_1_ArbeitsauftragArrays.Aufgabe3.aufg();
        if (kate == 2 && aufg == 4) de.deanomus.FirstLehrjahr.A15_1_ArbeitsauftragArrays.Aufgabe4.aufg();
        if (kate == 2 && aufg == 5) de.deanomus.FirstLehrjahr.A15_1_ArbeitsauftragArrays.Aufgabe5.aufg();
        if (kate == 2 && aufg == 6) de.deanomus.FirstLehrjahr.A15_1_ArbeitsauftragArrays.Aufgabe6.aufg();
        if (kate == 2 && aufg == 7) de.deanomus.FirstLehrjahr.A15_1_ArbeitsauftragArrays.Aufgabe7.aufg();
        //Kategorie 3 -> Aufgaben
        if (kate == 3 && aufg == 1) de.deanomus.FirstLehrjahr.A20_1_Mehrdimensionale_Arrays.Aufgabe1.aufg();
        if (kate == 3 && aufg == 2) de.deanomus.FirstLehrjahr.A20_1_Mehrdimensionale_Arrays.Aufgabe2.aufg();
        if (kate == 3 && aufg == 3) de.deanomus.FirstLehrjahr.A20_1_Mehrdimensionale_Arrays.Aufgabe3.aufg();
        if (kate == 3 && aufg == 4) de.deanomus.FirstLehrjahr.A20_1_Mehrdimensionale_Arrays.Aufgabe4.aufg();
        if (kate == 3 && aufg == 5) de.deanomus.FirstLehrjahr.A20_1_Mehrdimensionale_Arrays.Aufgabe5.aufg();
        // Kategorie 4 (Trash-Mash) -> Sachen
        if (kate == 4 && aufg == 1) de.deanomus.FirstLehrjahr.trash.DurchschnittInteger.aufg();
        if (kate == 4 && aufg == 2) de.deanomus.FirstLehrjahr.GUI.GUI.gui();
        if (kate == 4 && aufg == 3) FussballVersion.start();
        if (kate == 4 && aufg == 4) de.deanomus.FirstLehrjahr.trash.rdmTester.start();
        if (kate == 4 && aufg == 5) de.deanomus.FirstLehrjahr.OGG.zuul.Programm.main();
        if (kate == 4 && aufg == 6) de.deanomus.FirstLehrjahr.OGG.sortieralgorithmen.Sortieralgo.start();
        if (kate == 4 && aufg == 7) de.deanomus.FirstLehrjahr.trash.ToMD5Hash.start();
        // -> Exit
        if (kate == 0 && aufg == 0) return;


        System.out.println();
        choose();

    }


}

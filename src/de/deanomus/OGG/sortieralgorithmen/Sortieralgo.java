package de.deanomus.OGG.sortieralgorithmen;

import de.deanomus.core.Core;
import de.deanomus.util.Data;

import java.util.Scanner;

public class Sortieralgo {

    private static Scanner scan = Core.scan;

    public static void start() {
        println(2);
        println("Which to start?:");
        println("0 = Quit, 1 = Bubblesort, 2 = Selectionsort, 3 = Insertionsort, 4 = Quicksort");
        int i = Data.intScan(scan);
        if (i == 1) println("Bubblesort");
        if (i == 2) println("Selectionsort");
        if (i == 3) println("Insertionsort");
        if (i == 4) println("Quicksort");
        if (i != 0) start();
    }


    private static void println(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("");
        }
    }
    private static void println(String text) {
        System.out.println(text);
    }

}

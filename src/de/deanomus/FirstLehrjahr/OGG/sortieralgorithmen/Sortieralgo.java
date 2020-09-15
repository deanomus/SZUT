package de.deanomus.FirstLehrjahr.OGG.sortieralgorithmen;

import de.deanomus.FirstLehrjahr.core.Core;
import de.deanomus.FirstLehrjahr.util.Data;
import de.deanomus.FirstLehrjahr.util.ProgressBar;
import de.deanomus.FirstLehrjahr.util.exceptions.ArrayCannotBeNullException;

import java.util.Scanner;

public class Sortieralgo {

    private static Scanner scan = Core.scan;

    public static void start() {
        println(2);
        println("Which to start?:");
        println("0 = Quit, " +
                "1 = Bubblesort, " +
                "2 = Selectionsort, " +
                "3 = Insertionsort, " +
                "4 = Quicksort");
        int i = Data.intScan(scan);
        if (i == 1) bubblesorttest();
        if (i == 2) SelectionsortTest();
        if (i == 3) println("Insertionsort");
        if (i == 4) println("Quicksort");
        if (i == 5) test();
        if (i != 0) start();
    }

    private static void bubblesorttest() {
        //int[] t = {2,6,3,7,8,1,3,5,8,9,5,3};
        //int[] t = {9,8,7,6,5,4,3,2,1};
        int[] array = rdmarray(10, 1, 99, false);


        Bubblesort b = new Bubblesort(array);

        println("Vorher: " + Data.ArrayToString(b.getArray()));

        String finish = Data.ArrayToString(b.DebugMessages(true).sort().getArray());

        println("\nFertig(" + b.getDurchgaenge() + "): " + finish);

    }

    private static void SelectionsortTest() {
        int[] array = rdmarray(10, 1, 99, false);

        Selectionsort sortAlgo = new Selectionsort();
        sortAlgo
                .setDirection(Direction.downToUp);

        try {
            sortAlgo.sortArray();
        } catch (ArrayCannotBeNullException e) {
            e.printStackTrace();
        }
    }

    private static void test() {
        int[] t = {2, 6, 3, 7, 8, 1, 3, 5, 8, 9, 5, 3};
        println("Test Out: " + Data.ArrayToString(t));
    }


    private static void println(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("");
        }
    }

    private static int[] rdmarray(int length, int min, int max) {
        return rdmarray(length, min, max, true);
    }

    private static int[] rdmarray(int length, int min, int max, Boolean progressInfo) {
        ProgressBar bar = null;
        if (progressInfo) {
            bar = new ProgressBar(length);
            bar
                    .showPercent(true)
                    .showStats(true);
        }

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            if (progressInfo) {
                bar.setNow(i);
            }
            arr[i] = Data.rdmInt(min, max);
        }

        return arr;
    }

    private static void println(String text) {
        System.out.println(text);
    }

}

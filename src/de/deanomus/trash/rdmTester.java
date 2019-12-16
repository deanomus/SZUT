package de.deanomus.trash;

import de.deanomus.core.Core;
import de.deanomus.util.Data;

import java.util.Scanner;

public class rdmTester {
    static Scanner scan = Core.scan;

    public static void start() {
        System.out.print("\nTimes: " );
        int times = Data.intScan(scan);
        System.out.print("\nFrom Int?: ");
        int startInt = Data.intScan(scan);
        System.out.print("\nTo int?: ");
        int endInt = Data.intScan(scan);
        if(startInt >= endInt) {
            System.out.println("Fehler, StartInt > endInt");
            return;
        }
        int diff = endInt - startInt;
        int[] counter = new int[diff+1];


        for ( int i=0; i < times; i++) {
            int rdmGen = Data.rdmInt(startInt, endInt);
            counter[(rdmGen-startInt)]++;
        }

        for ( int i=0; i < counter.length; i++) {
            System.out.print("| " + (i+startInt) + "= x" + counter[i] + " |");
        }
    }

}
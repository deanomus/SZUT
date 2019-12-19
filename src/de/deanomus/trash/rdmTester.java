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
        String s = "";
//        StringBuilder sb = new StringBuilder();
        for ( int i=0; i < counter.length; i++) {
            if(counter[i] != 0) {
                s += "| " + (i + startInt) + "= x" + counter[i] + " |";
//            sb.append("| " + (i+startInt) + "= x" + counter[i] + " |");
            }
        }
        System.out.println(s);
    }

}

package de.deanomus.FirstLehrjahr.A12_Java_Uebung_gemixt;

import de.deanomus.FirstLehrjahr.core.Core;
import de.deanomus.FirstLehrjahr.util.Data;

import java.util.Scanner;

public class Aufgabe9 {

    static Scanner scan = Core.scan;

    public static void aufg() {

        System.out.print("\nVorderer Linker Reifendruck: ");
        int vlr = Data.intScan(scan);
        System.out.print("\nVorderer Rechter Reifendruck: ");
        int vrr = Data.intScan(scan);
        System.out.print("\nHinterer Linker Reifendruck: ");
        int hlr = Data.intScan(scan);
        System.out.print("\nHinterer Rechter Reifendruck");
        int hrr = Data.intScan(scan);

        if(vlr == vrr && hlr == hrr) {
            System.out.print("\nReifendruck ist Okay");
        } else System.out.print("\nFahren sie nicht!");

    }

}

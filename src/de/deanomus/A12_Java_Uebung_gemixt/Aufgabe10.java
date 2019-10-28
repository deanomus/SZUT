package de.deanomus.A12_Java_Uebung_gemixt;

import de.deanomus.core.Core;
import de.deanomus.util.Data;

import java.util.Scanner;

public class Aufgabe10 {
    static Scanner scan = Core.scan;

    public static void aufg() {

        System.out.println("\nVorderer Linker Reifendruck: ");
        int vlr = Data.intScan(scan);
        if(pruefe(vlr)) System.out.println(notOK("Vorderer Linker"));
        System.out.println("\nVorderer Rechter Reifendruck: ");
        int vrr = Data.intScan(scan);
        if(pruefe(vrr)) System.out.println(notOK("Vorderer Rechter"));
        System.out.println("\nHinterer Linker Reifendruck: ");
        int hlr = Data.intScan(scan);
        if(pruefe(hlr)) System.out.println(notOK("Hinterer Linker"));
        System.out.println("\nHinterer Rechter Reifendruck");
        int hrr = Data.intScan(scan);
        if(pruefe(hrr)) System.out.println(notOK("Hinterer Rechter"));





    }


    static boolean pruefe(int druck) {
        if(druck < 35 || druck > 45) return true;
        return false;
    }
    static String notOK(String reifen) {
        return reifen + " Reifendruck ist außerhalb des erlaubten Bereich";
    }


}

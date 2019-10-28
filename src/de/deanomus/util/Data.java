package de.deanomus.util;

import java.util.Scanner;

public class Data {

    public static int intScan(Scanner scan) {
        String s = scan.next();
        Integer i = null;
        try {
            i = Integer.parseInt(s);
        }
        catch(Exception e) {
            System.out.print("\n\nEin Fehler ist aufgetreten! Sicher das du eine Zahl eingegeben hast?\n");
        }

        if (i != null) {
            return i;
        }
        return -1;

    }


}

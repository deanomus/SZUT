package de.deanomus.FirstLehrjahr.trash;

import de.deanomus.FirstLehrjahr.core.Core;
import de.deanomus.FirstLehrjahr.util.Data;

import java.util.Scanner;

public class DurchschnittInteger {

    static Scanner scan = Core.scan;


    public static void aufg() {

        int i = 1;
        int ausgabe = 0;
        int addiert = 0;


        System.out.println("Lassen sie den Durchschnitt mehrerer Zahlen berechnen, mit eingabe 0 exit");
        while(i != 0) {
            System.out.print("Eingabe: ");
            i = Data.intScan(scan);
            if(i != 0) addiert++;
            ausgabe += i;

        }
        System.out.println("Gesamt: " + ausgabe + "(" + addiert + ")");
        if(addiert != 0 && ausgabe != 0 && i == 0) ausgabe /= addiert;
        System.out.println("\nDurchschnitt: " + ausgabe);



    }



}

package de.deanomus.OGG;

import de.deanomus.core.Core;
import de.deanomus.util.Data;

import java.util.Scanner;

public class FussballVersion {

    static Scanner scan = Core.scan;

    public static void start() {
        System.out.println("Which version to start? (v1, v2)");

        int v = Data.intScan(scan);
        if(v == 1) {
            de.deanomus.OGG.fussball1.Programm.start();
        } else if(v == 2) {
            de.deanomus.OGG.fussball2.Programm.start();
        }
    }

}

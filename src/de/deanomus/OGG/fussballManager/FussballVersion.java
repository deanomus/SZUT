package de.deanomus.OGG.fussballManager;

import de.deanomus.core.Core;
import de.deanomus.util.Data;

import java.util.Scanner;

public class FussballVersion {

    static Scanner scan = Core.scan;

    public static void start() {
        System.out.println("Which version to start? (v1, v2, v3)");

        int v = Data.intScan(scan);
        if(v == 1) {
            de.deanomus.OGG.fussballManager.fussball1.Programm.start();
        } else if(v == 2) {
            de.deanomus.OGG.fussballManager.fussball2.Programm.start();
        } else if(v == 3) {
            de.deanomus.OGG.fussballManager.fussball3.Programm.start();
        }
    }

}

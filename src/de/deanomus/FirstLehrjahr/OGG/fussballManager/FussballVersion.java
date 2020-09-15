package de.deanomus.FirstLehrjahr.OGG.fussballManager;

import de.deanomus.FirstLehrjahr.core.Core;
import de.deanomus.FirstLehrjahr.util.Data;

import java.util.Scanner;

public class FussballVersion {

    static Scanner scan = Core.scan;

    public static void start() {
        int v = 12345678;
        while (true) {
            System.out.println("\nWhich version to start? (v1, v2, v3, v4, v5, v6, v7(GUI))");
            if (v != 12345678) System.out.println("Exit with: 0");

            v = Data.intScan(scan);
            if (v == 0) return;
            if (v == 1) {
                de.deanomus.FirstLehrjahr.OGG.fussballManager.fussball1.Programm.start();
            } else if (v == 2) {
                de.deanomus.FirstLehrjahr.OGG.fussballManager.fussball2.Programm.start();
            } else if (v == 3) {
                de.deanomus.FirstLehrjahr.OGG.fussballManager.fussball3.Programm.start();
            } else if (v == 4) {
                de.deanomus.FirstLehrjahr.OGG.fussballManager.fussball4.Programm.start();
            } else if (v == 5) {
                de.deanomus.FirstLehrjahr.OGG.fussballManager.fussball5.Programm.start();
            } else if (v == 6) {
                de.deanomus.FirstLehrjahr.OGG.fussballManager.fussball6.Programm.start();
            } else if (v == 7) {
                de.deanomus.FirstLehrjahr.OGG.fussballManager.fussballGUI.Programm.start();
            } else {
                System.out.println("Error, not found");
            }

        }
    }

}

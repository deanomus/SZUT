package de.deanomus.GUI.gameoflife;

import de.deanomus.GUI.GUI;
import de.deanomus.core.Core;

import java.util.Scanner;

public class GameOfLife {

    static Scanner scan = Core.scan;

    public static void start() {

        System.out.println("\nStarte grafische Oberfläche...");
        GUI.gui();

    }


}

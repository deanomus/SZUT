package de.deanomus.GUI.gameoflife;

import de.deanomus.GUI.GUI;
import de.deanomus.core.Core;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class GameOfLife {

    static Scanner scan = Core.scan;
    public static JPanel gameofpanel;

    public static void start() {

        gameofpanel = new JPanel();
        gameofpanel.setBackground(Color.YELLOW);

        System.out.println("\nStarte grafische Oberfläche...");
        GUI.gui();


    }


}

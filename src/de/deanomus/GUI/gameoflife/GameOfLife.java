package de.deanomus.GUI.gameoflife;

import de.deanomus.GUI.GUI;
import de.deanomus.core.Core;
import de.deanomus.util.Data;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class GameOfLife {


    static Scanner scan = Core.scan;
    public static JPanel gameofpanel;

    public static JToolBar tools;



    public static int
                rows = 20,
                cols = 20;

    public static JButton[][] button;
    public static Boolean[][] active;
    public static JButton toggle, reset, all, halfvorlage, rdmvorlage;
    public static Boolean go = false;


    public static Color
                        colorInactive = Color.RED,
                        colorActive = Color.GREEN;

    public static void start() {

//        System.out.print("\nEingabe rows: ");
//        rows = Data.intScan(scan);
//        System.out.println("Debug: " + rows);
//        System.out.print("Eingabe cols: ");
//        cols = Data.intScan(scan);
//        System.out.println("Debug: " + cols);

        button = new JButton[rows][cols];
        active = new Boolean[rows][cols];

        System.out.println("\nStarte grafische Oberfläche...");

        gameofpanel = new JPanel();
        gameofpanel.setLayout(new GridLayout(rows, cols));


        tools = new JToolBar();

        ToolsListener toolsLis = new ToolsListener();

        toggle = new JButton("Start");
        reset = new JButton("Reset");
        all = new JButton("All-Active");
        halfvorlage = new JButton("Half");
        rdmvorlage = new JButton("rdm");


        toggle.addActionListener(toolsLis);
        reset.addActionListener(toolsLis);
        all.addActionListener(toolsLis);
        halfvorlage.addActionListener(toolsLis);
        rdmvorlage.addActionListener(toolsLis);

        tools.add(toggle);
        tools.add(reset);
        tools.add(all);
        tools.add(halfvorlage);
        tools.add(rdmvorlage);

        gameofpanel.add(tools);



        ButtonListener listener = new ButtonListener();




        for ( int row=0; row < rows; row++) {
            for ( int col = 0; col < cols; col++) {
                active[row][col] = false;
                button[row][col] = new JButton("O");
                button[row][col].addActionListener(listener);
                gameofpanel.add(button[row][col]);

            }
        }

        Utils.checkAllForActive();

        GUI.gui();

        checkLOOP.check();

    }


}

package de.deanomus.GUI.gameoflife;

import de.deanomus.GUI.GUI;
import de.deanomus.core.Core;

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

    public static JButton[][] button = new JButton[rows][cols];
    public static Boolean[][] active = new Boolean[rows][cols];
    public static JButton start, reset, all;

    public static void start() {

        System.out.println("\nStarte grafische Oberfläche...");

        gameofpanel = new JPanel();
        gameofpanel.setLayout(new GridLayout(rows, cols));


        tools = new JToolBar();

        ToolsListener toolsLis = new ToolsListener();

        start = new JButton("Start");
        reset = new JButton("Reset");
        all = new JButton("All-Active");


        start.addActionListener(toolsLis);
        reset.addActionListener(toolsLis);
        all.addActionListener(toolsLis);

        tools.add(start);
        tools.add(reset);
        tools.add(all);

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


    }


}

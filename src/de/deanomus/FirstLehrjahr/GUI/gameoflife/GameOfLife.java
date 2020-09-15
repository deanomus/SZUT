package de.deanomus.FirstLehrjahr.GUI.gameoflife;

import de.deanomus.FirstLehrjahr.core.Core;

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
    public static JButton toggle, reset;
    public static Boolean go = false;


    public static Color
                        colorInactive = Color.RED,
                        colorActive = Color.GREEN,
                        colorBackground = Color.BLACK;

    public static void startPanel() {

//        System.out.print("\nEingabe rows: ");
//        rows = Data.intScan(scan);
//        System.out.println("Debug: " + rows);
//        System.out.print("Eingabe cols: ");
//        cols = Data.intScan(scan);
//        System.out.println("Debug: " + cols);

        button = new JButton[rows][cols];
        active = new Boolean[rows][cols];

        gameofpanel = new JPanel();
        gameofpanel.setLayout(new GridLayout(rows, cols));
        gameofpanel.setBackground(colorBackground);


        tools = new JToolBar();

        ToolsListener toolsLis = new ToolsListener();

        toggle = new JButton("Start");
        reset = new JButton("Reset");

        tools.setBackground(colorBackground);
        toggle.setBackground(colorInactive);
        reset.setBackground(colorActive);


        toggle.addActionListener(toolsLis);
        reset.addActionListener(toolsLis);

        tools.add(toggle);
        tools.add(reset);

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


        checkLOOP.check();

    }



    public static void startGame() {
        go = true;
        toggle.setText("Stopp");
        toggle.setBackground(colorActive);
    }

    public static void stopGame() {
        go = false;
        toggle.setText("Start");
        toggle.setBackground(colorInactive);
    }

    public static void toggleGame() {
        if(go) {
            stopGame();
        } else startGame();
    }


}

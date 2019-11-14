package de.deanomus.GUI;

import de.deanomus.GUI.gameoflife.ButtonListener;
import de.deanomus.GUI.gameoflife.GameOfLife;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class GUI extends javax.swing.JFrame {

    public static GUI frame;
    public static JTabbedPane tabpane;
    static ButtonListener listener;

    public static void gui() {
        frame = new GUI();
        frame.setTitle("Game Of Life - SZUT");
        frame.setSize(1000, 1000);
        frame.setLocation(50,50);
        frame.setResizable(true);

        listener = new ButtonListener();



        tabpane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
        tabpane.add(GameOfLife.gameofpanel, "GameOfLife");


        frame.add(tabpane);
        frame.setVisible(true);
    }



}

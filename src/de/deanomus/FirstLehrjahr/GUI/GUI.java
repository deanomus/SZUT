package de.deanomus.FirstLehrjahr.GUI;

import de.deanomus.FirstLehrjahr.GUI.choose.ChoosePanel;
import de.deanomus.FirstLehrjahr.GUI.gameoflife.ButtonListener;

import javax.swing.*;

public class GUI extends javax.swing.JFrame {

    public static GUI frame;
    public static JTabbedPane tabpane;
    static ButtonListener listener;

    public static final int
                        width   =   1000,
                        height  =   1000;

    public static void gui() {
        frame = new GUI();
        frame.setTitle("Game Of Life - SZUT");
        frame.setSize(width, height);
        frame.setLocation(50,50);
        frame.setResizable(true);

        ChoosePanel.start();



        tabpane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
        tabpane.add(ChoosePanel.choosePanel, "Wähle");

        frame.add(tabpane);
        frame.setVisible(true);
    }



}

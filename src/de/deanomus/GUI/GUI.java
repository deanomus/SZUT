package de.deanomus.GUI;

import de.deanomus.GUI.buschfeuer.FeuerPanel;
import de.deanomus.GUI.choose.ChooseListener;
import de.deanomus.GUI.choose.ChoosePanel;
import de.deanomus.GUI.gameoflife.ButtonListener;
import de.deanomus.GUI.gameoflife.GameOfLife;
import de.deanomus.GUI.gameoflife.vorlagen.VorlagenPanel;
import de.deanomus.GUI.options.OptionsPanel;

import javax.swing.*;

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

        ChoosePanel.start();
        VorlagenPanel.start();
        FeuerPanel.start();



        tabpane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
        tabpane.add(ChoosePanel.choosePanel, "Wähle");
        tabpane.add(VorlagenPanel.vorlagenPanel, "Vorlagen");
        tabpane.add(FeuerPanel.firePanel, "Buschfeuer");

        frame.add(tabpane);
        frame.setVisible(true);
    }



}

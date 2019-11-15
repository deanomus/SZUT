package de.deanomus.GUI.gameoflife.vorlagen;

import de.deanomus.GUI.gameoflife.GameOfLife;

import javax.swing.*;
import java.awt.*;

public class VorlagenPanel {


    public static JPanel vorlagenPanel;



    public static JButton
                    rdmV,
                    halfV,
                    AllActiveV;


    public static void start() {

        vorlagenPanel = new JPanel();
        vorlagenPanel.setBackground(GameOfLife.colorBackground);

        AllActiveV = new JButton("All-Active");
        halfV = new JButton("Half");
        rdmV = new JButton("rdm");

        VorlagenListener listener = new VorlagenListener();


        AllActiveV.addActionListener(listener);
        halfV.addActionListener(listener);
        rdmV.addActionListener(listener);

        AllActiveV.setBackground(GameOfLife.colorActive);
        halfV.setBackground(GameOfLife.colorActive);
        rdmV.setBackground(GameOfLife.colorActive);


        vorlagenPanel.add(AllActiveV);
        vorlagenPanel.add(halfV);
        vorlagenPanel.add(rdmV);




    }



}

package de.deanomus.GUI.gameoflife.vorlagen;

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
        vorlagenPanel.setBackground(Color.RED);

        AllActiveV = new JButton("All-Active");
        halfV = new JButton("Half");
        rdmV = new JButton("rdm");

        VorlagenListener listener = new VorlagenListener();


        AllActiveV.addActionListener(listener);
        halfV.addActionListener(listener);
        rdmV.addActionListener(listener);

        AllActiveV.setBackground(Color.GREEN);
        halfV.setBackground(Color.GREEN);
        rdmV.setBackground(Color.GREEN);


        vorlagenPanel.add(AllActiveV);
        vorlagenPanel.add(halfV);
        vorlagenPanel.add(rdmV);




    }



}

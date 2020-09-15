package de.deanomus.FirstLehrjahr.GUI.converter;

import javax.swing.*;

public class ConverterPanel {

    public static JPanel converterPanel;
    static JButton
                MD5GO;
    public static JTextField
                MD5Key;


    public static void start() {
        converterPanel = new JPanel();

        ConverterListener listener = new ConverterListener();

        MD5GO = new JButton("LOS!");
        MD5GO.addActionListener(listener);

        MD5Key = new JTextField("MD5 to Text");


        converterPanel.add(MD5Key);
        converterPanel.add(MD5GO);
    }

}

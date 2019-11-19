package de.deanomus.GUI.choose;

import javax.swing.*;

public class ChoosePanel {

    public static JPanel choosePanel;

    public static JButton
            showgameoflife, settings, vorlagen, buschfeuer;


    public static void start() {

        choosePanel = new JPanel();

        showgameoflife = new JButton("GameOfLife");
        settings = new JButton("Settings");
        vorlagen = new JButton("Vorlagen");
        buschfeuer = new JButton("Buschfeuer");

        ChooseListener listener = new ChooseListener();

        showgameoflife.addActionListener(listener);
        settings.addActionListener(listener);
        vorlagen.addActionListener(listener);
        buschfeuer.addActionListener(listener);

        choosePanel.add(showgameoflife);
        choosePanel.add(settings);
        choosePanel.add(vorlagen);
        choosePanel.add(buschfeuer);


    }

}

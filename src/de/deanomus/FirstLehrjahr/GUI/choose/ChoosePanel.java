package de.deanomus.FirstLehrjahr.GUI.choose;

import javax.swing.*;

public class ChoosePanel {

    public static JPanel choosePanel;

    public static JButton
            showgameoflife, settings, vorlagen, buschfeuer, converterB;


    public static void start() {

        choosePanel = new JPanel();

        showgameoflife = new JButton("GameOfLife");
        settings = new JButton("Settings");
        vorlagen = new JButton("Vorlagen");
        buschfeuer = new JButton("Buschfeuer");
        converterB = new JButton("Converter");

        ChooseListener listener = new ChooseListener();

        showgameoflife.addActionListener(listener);
        settings.addActionListener(listener);
        vorlagen.addActionListener(listener);
        buschfeuer.addActionListener(listener);
        converterB.addActionListener(listener);

        Check.remove(showgameoflife);
        Check.remove(settings);
        Check.remove(vorlagen);
        Check.remove(buschfeuer);
        Check.remove(converterB);

        choosePanel.add(showgameoflife);
        choosePanel.add(settings);
        choosePanel.add(vorlagen);
        choosePanel.add(buschfeuer);
        choosePanel.add(converterB);

        Check.all();


    }

}

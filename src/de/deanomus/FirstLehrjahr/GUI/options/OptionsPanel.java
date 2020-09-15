package de.deanomus.FirstLehrjahr.GUI.options;

import de.deanomus.FirstLehrjahr.GUI.gameoflife.GameOfLife;

import javax.swing.*;
import java.awt.*;

public class OptionsPanel {


    public static JPanel optionsPanel;

    public static JButton
                    chooseColorActive,
                    chooseColorInactive,
                    chooseBackgroundColor,
                    restart;


    public static void start() {

        optionsPanel = new JPanel();

        chooseColorActive = new JButton("Active-Color");
        chooseColorInactive = new JButton("Inactive-Color");
        chooseBackgroundColor = new JButton("Background-Color");
        restart = new JButton("Neustart");

        chooseColorActive.setBackground(GameOfLife.colorActive);
        chooseColorInactive.setBackground(GameOfLife.colorInactive);
        chooseBackgroundColor.setBackground(GameOfLife.colorBackground);
        optionsPanel.setBackground(Color.WHITE);

        OptionsListener listener = new OptionsListener();

        chooseColorActive.addActionListener(listener);
        chooseColorInactive.addActionListener(listener);
        chooseBackgroundColor.addActionListener(listener);
        restart.addActionListener(listener);

        optionsPanel.add(chooseColorActive);
        optionsPanel.add(chooseColorInactive);
        optionsPanel.add(chooseBackgroundColor);
        optionsPanel.add(restart);



    }


}

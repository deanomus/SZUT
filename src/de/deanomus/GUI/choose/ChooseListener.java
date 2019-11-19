package de.deanomus.GUI.choose;

import de.deanomus.GUI.GUI;
import de.deanomus.GUI.gameoflife.GameOfLife;
import de.deanomus.GUI.options.OptionsPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseListener implements ActionListener {
    static Boolean
            showGameLife = false,
            showSettings = false,
            showVorlagen = false,
            buschfeuer = false;

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if(actionEvent.getSource().equals(ChoosePanel.showgameoflife)) {
            if(showGameLife) {
                GUI.tabpane.remove(GameOfLife.gameofpanel);
                showGameLife = false;
            } else {
                GameOfLife.startPanel();
                GUI.tabpane.add(GameOfLife.gameofpanel, "GameOfLife");
                showGameLife = true;
            }
        } else if(actionEvent.getSource().equals(ChoosePanel.settings)) {
            if(showSettings) {
                GUI.tabpane.remove(OptionsPanel.optionsPanel);
                showSettings = false;
            } else {
                OptionsPanel.start();
                GUI.tabpane.add(OptionsPanel.optionsPanel, "Settings");
                showSettings = true;
            }
        } else if(actionEvent.getSource().equals(ChoosePanel.vorlagen)) {

        } else if(actionEvent.getSource().equals(ChoosePanel.buschfeuer)) {

        }

    }
}

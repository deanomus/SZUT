package de.deanomus.GUI.choose;

import de.deanomus.GUI.GUI;
import de.deanomus.GUI.buschfeuer.FeuerPanel;
import de.deanomus.GUI.gameoflife.GameOfLife;
import de.deanomus.GUI.gameoflife.vorlagen.VorlagenPanel;
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
                ChoosePanel.showgameoflife.setBackground(GameOfLife.colorInactive);
                showGameLife = false;
            } else {
                GameOfLife.startPanel();
                GUI.tabpane.add(GameOfLife.gameofpanel, "GameOfLife");
                ChoosePanel.showgameoflife.setBackground(GameOfLife.colorActive);
                showGameLife = true;
            }
        } else if(actionEvent.getSource().equals(ChoosePanel.settings)) {
            if(showSettings) {
                GUI.tabpane.remove(OptionsPanel.optionsPanel);
                ChoosePanel.settings.setBackground(GameOfLife.colorInactive);
                showSettings = false;
            } else {
                OptionsPanel.start();
                GUI.tabpane.add(OptionsPanel.optionsPanel, "Settings");
                ChoosePanel.settings.setBackground(GameOfLife.colorActive);
                showSettings = true;
            }
        } else if(actionEvent.getSource().equals(ChoosePanel.vorlagen)) {
            if(showVorlagen) {
                GUI.tabpane.remove(VorlagenPanel.vorlagenPanel);
                ChoosePanel.vorlagen.setBackground(GameOfLife.colorInactive);
                showVorlagen = false;
            } else {
                VorlagenPanel.start();
                GUI.tabpane.add(VorlagenPanel.vorlagenPanel, "Vorlagen");
                ChoosePanel.vorlagen.setBackground(GameOfLife.colorActive);
                showVorlagen = true;
            }
        } else if(actionEvent.getSource().equals(ChoosePanel.buschfeuer)) {
            if(buschfeuer) {
                GUI.tabpane.remove(FeuerPanel.firePanel);
                ChoosePanel.buschfeuer.setBackground(GameOfLife.colorInactive);
                buschfeuer = false;
            } else {
                FeuerPanel.start();
                GUI.tabpane.add(FeuerPanel.firePanel, "Buschfeuer");
                ChoosePanel.buschfeuer.setBackground(GameOfLife.colorActive);
                buschfeuer = true;
            }
        }

    }
}

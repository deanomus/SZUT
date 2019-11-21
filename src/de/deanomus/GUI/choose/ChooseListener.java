package de.deanomus.GUI.choose;

import de.deanomus.GUI.GUI;
import de.deanomus.GUI.buschfeuer.FeuerPanel;
import de.deanomus.GUI.gameoflife.GameOfLife;
import de.deanomus.GUI.gameoflife.vorlagen.VorlagenPanel;
import de.deanomus.GUI.options.OptionsPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if(actionEvent.getSource().equals(ChoosePanel.showgameoflife)) {
            if(Check.activePanels.contains(ChoosePanel.showgameoflife)) {
                GUI.tabpane.remove(GameOfLife.gameofpanel);
                Check.remove(ChoosePanel.showgameoflife);
            } else {
                GameOfLife.startPanel();
                GUI.tabpane.add(GameOfLife.gameofpanel, "GameOfLife");
                Check.add(ChoosePanel.showgameoflife);
            }
        } else if(actionEvent.getSource().equals(ChoosePanel.settings)) {
            if(Check.activePanels.contains(ChoosePanel.settings)) {
                GUI.tabpane.remove(OptionsPanel.optionsPanel);
                Check.remove(ChoosePanel.settings);
            } else {
                OptionsPanel.start();
                GUI.tabpane.add(OptionsPanel.optionsPanel, "Settings");
                Check.add(ChoosePanel.settings);
            }
        } else if(actionEvent.getSource().equals(ChoosePanel.vorlagen)) {
            if(Check.activePanels.contains(ChoosePanel.vorlagen)) {
                GUI.tabpane.remove(VorlagenPanel.vorlagenPanel);
                Check.remove(ChoosePanel.vorlagen);
            } else {
                VorlagenPanel.start();
                GUI.tabpane.add(VorlagenPanel.vorlagenPanel, "Vorlagen");
                Check.add(ChoosePanel.vorlagen);
            }
        } else if(actionEvent.getSource().equals(ChoosePanel.buschfeuer)) {
            if(Check.activePanels.contains(ChoosePanel.buschfeuer)) {
                GUI.tabpane.remove(FeuerPanel.firePanel);
                Check.remove(ChoosePanel.buschfeuer);
            } else {
                FeuerPanel.start();
                GUI.tabpane.add(FeuerPanel.firePanel, "Buschfeuer");
                Check.add(ChoosePanel.buschfeuer);
            }
        }
        Check.all();

    }
}

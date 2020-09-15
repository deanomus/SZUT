package de.deanomus.FirstLehrjahr.GUI.choose;

import de.deanomus.FirstLehrjahr.GUI.gameoflife.GameOfLife;

import javax.swing.*;
import java.util.ArrayList;

public class Check {

    public static ArrayList<JButton> activePanels = new ArrayList<JButton>();
    public static ArrayList<JButton> InactivePanels = new ArrayList<JButton>();


    static void hideAll() {
        for(JButton button : activePanels) {
            button.setVisible(false);
        }
        for(JButton button : InactivePanels) {
            button.setVisible(false);
        }
    }

    public static void all() {
        hideAll();
        showAll();
    }

    static void showAll() {
        for(JButton button : activePanels) {
            button.setVisible(true);
            button.setBackground(GameOfLife.colorActive);
        }
        for(JButton button : InactivePanels) {
            button.setBackground(GameOfLife.colorInactive);
            if(!button.equals(ChoosePanel.vorlagen)) {
                button.setVisible(true);
            } else if(activePanels.contains(ChoosePanel.showgameoflife)) {
                button.setVisible(true);
            }
        }
    }

    public static void add(JButton button) {
        if(InactivePanels.contains(button)) InactivePanels.remove(button);
        if(!activePanels.contains(button)) activePanels.add(button);
    }
    public static void remove(JButton button) {
        if(activePanels.contains(button)) activePanels.remove(button);
        if(!InactivePanels.contains(button)) InactivePanels.add(button);
    }
}

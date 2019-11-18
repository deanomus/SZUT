package de.deanomus.GUI.options;

import de.deanomus.GUI.GUI;
import de.deanomus.GUI.gameoflife.GameOfLife;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class OptionsListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource().equals(OptionsPanel.chooseColorActive)) {
            GameOfLife.colorActive = JColorChooser.showDialog(null, "Farbwauswahl", GameOfLife.colorActive);
        } else if(ae.getSource().equals(OptionsPanel.chooseColorInactive)) {
            GameOfLife.colorInactive = JColorChooser.showDialog(null, "Farbwauswahl", GameOfLife.colorInactive);
        } else if(ae.getSource().equals(OptionsPanel.chooseBackgroundColor)) {
            GameOfLife.colorBackground = JColorChooser.showDialog(null, "Farbwauswahl", GameOfLife.colorBackground);
        } else if(ae.getSource().equals(OptionsPanel.restart)) {
            GUI.frame.dispatchEvent(new WindowEvent(GUI.frame, WindowEvent.WINDOW_CLOSING));
            GUI.gui();
        }


    }
}

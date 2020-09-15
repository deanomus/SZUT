package de.deanomus.FirstLehrjahr.GUI.gameoflife.vorlagen;

import de.deanomus.FirstLehrjahr.GUI.gameoflife.GameOfLife;
import de.deanomus.FirstLehrjahr.GUI.gameoflife.Utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VorlagenListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent ae) {

        GameOfLife.stopGame();
        if(ae.getSource().equals(VorlagenPanel.AllActiveV)) {
            allActive.execute();
        } else if(ae.getSource().equals(VorlagenPanel.halfV)) {
            half.execute();
        } else if(ae.getSource().equals(VorlagenPanel.rdmV)) {
            rdm.execute();
        }
        Utils.checkAllForActive();

    }
}

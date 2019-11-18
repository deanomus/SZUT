package de.deanomus.GUI.gameoflife;

import de.deanomus.GUI.GUI;
import de.deanomus.GUI.gameoflife.vorlagen.half;
import de.deanomus.GUI.gameoflife.vorlagen.rdm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolsListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource().equals(GameOfLife.toggle)) {
            GameOfLife.toggleGame();
        } else if(ae.getSource().equals(GameOfLife.reset)) {
            GameOfLife.stopGame();
            GUI.frame.setVisible(false);
            for ( int row=0; row < GameOfLife.rows; row++) {
                for ( int col = 0; col < GameOfLife.cols; col++) {
                    GameOfLife.active[row][col] = false;
                    Utils.checkAllForActive();
                }
            }
            GUI.frame.setVisible(true);
        }
    }
}

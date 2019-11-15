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

            if(GameOfLife.go) {
                GameOfLife.toggle.setText("Start");
                GameOfLife.go = false;
            } else {
                GameOfLife.toggle.setText("Stopp");
                GameOfLife.go = true;
            }


        } else if(ae.getSource().equals(GameOfLife.reset)) {
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

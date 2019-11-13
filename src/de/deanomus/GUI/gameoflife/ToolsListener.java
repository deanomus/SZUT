package de.deanomus.GUI.gameoflife;

import de.deanomus.GUI.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolsListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource().equals(GameOfLife.start)) {
            System.out.println("! START !");
        } else if(ae.getSource().equals(GameOfLife.reset)) {
            GUI.frame.setVisible(false);
            for ( int row=0; row < GameOfLife.rows; row++) {
                for ( int col = 0; col < GameOfLife.cols; col++) {
                    GameOfLife.active[row][col] = false;
                    Utils.checkAllForActive();
                }
            }
            GUI.frame.setVisible(true);
        } else if(ae.getSource().equals(GameOfLife.all)) {
            GUI.frame.setVisible(false);
            for ( int row=0; row < GameOfLife.rows; row++) {
                for ( int col = 0; col < GameOfLife.cols; col++) {
                    GameOfLife.active[row][col] = true;
                    Utils.checkAllForActive();
                }
            }
            GUI.frame.setVisible(true);
        }


    }
}

package de.deanomus.FirstLehrjahr.GUI.gameoflife;

import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonListener implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent ae) {

        for ( int row=0; row < GameOfLife.rows; row++) {
            for ( int col = 0; col < GameOfLife.cols; col++) {

                if(ae.getSource().equals(GameOfLife.button[row][col])) {
                    if(GameOfLife.active[row][col]) {
                        GameOfLife.active[row][col] = false;
                    } else {
                        GameOfLife.active[row][col] = true;
                    }
                    Utils.checkAllForActive();
                    LineBorder border = new LineBorder(Color.WHITE);
                    GameOfLife.button[row][col].setBorder(border);
                    return;
                }

            }
        }

    }
}

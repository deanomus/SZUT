package de.deanomus.GUI.buschfeuer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FieldListener implements ActionListener {
    static boolean
                fireSet = false,
                setStone = true;

    @Override
    public void actionPerformed(ActionEvent ae) {
        int[][] after = new int[FeuerPanel.rows][FeuerPanel.cols];
        for ( int row=0; row < FeuerPanel.rows; row++) {
            for ( int col = 0; col < FeuerPanel.cols; col++) {
                after[row][col] = FeuerPanel.fieldStatus[row][col];
            }
        }

        for ( int row=0; row < FeuerPanel.rows; row++) {
            for ( int col = 0; col < FeuerPanel.cols; col++) {
                if(ae.getSource().equals(FeuerPanel.field[row][col])) {
                    if(!setStone) {
                        if(fireSet) {

                            if(FeuerPanel.fieldStatus[row][col] == FeuerPanel.fire) {
                                after[row][col] = FeuerPanel.water;
                                Check.fire(after);
                            }

                        } else if(FeuerPanel.fieldStatus[row][col] == FeuerPanel.OK) {
                            after[row][col] = FeuerPanel.fire;
                            fireSet = true;
                            Check.fire(after);
                        }
                    } else if(FeuerPanel.fieldStatus[row][col] != FeuerPanel.stone) {
                        after[row][col] = FeuerPanel.stone;
                        Check.execute(after);
                    } else {
                        setStone = false;
                    }


                }

            }
        }

    }
}

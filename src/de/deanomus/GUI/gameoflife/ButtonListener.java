package de.deanomus.GUI.gameoflife;

import de.deanomus.GUI.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonListener implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Listener: " + ae.getActionCommand());



        for ( int row=0; row < GameOfLife.rows; row++) {
            for ( int col = 0; col < GameOfLife.cols; col++) {

                if(ae.getSource().equals(GameOfLife.button[row][col])) {
                    if(GameOfLife.active[row][col]) {
                        GameOfLife.active[row][col] = false;
                    } else {
                        GameOfLife.active[row][col] = true;
                    }
                    Utils.checkAllForActive();
                    return;
                }

            }
        }




//        Integer i = Integer.parseInt(GUI.button.getText()) + 1;
//        if(!GUI.green) {
//            GUI.button.setBackground(Color.GREEN);
//            GUI.green = true;
//            GameOfLife.gameofpanel.setBackground(Color.RED);
//
//
//            GUI.button.setText(i.toString());
//        } else {
//            GUI.button.setBackground(Color.RED);
//            GUI.green = false;
//            GameOfLife.gameofpanel.setBackground(Color.GREEN);
//            GUI.button.setText(i.toString());
//        }

    }
}

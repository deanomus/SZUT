package de.deanomus.GUI.gameoflife;

import java.awt.*;
import java.util.Random;

public class Utils {


    public static void checkAllForActive() {


        for ( int row=0; row < GameOfLife.rows; row++) {
            for ( int col = 0; col < GameOfLife.cols; col++) {
                if(GameOfLife.active[row][col]) {
                    GameOfLife.button[row][col].setBackground(GameOfLife.colorActive);
                    GameOfLife.button[row][col].setText("X");
                    GameOfLife.button[row][col].setForeground(GameOfLife.colorActive);
                } else {
                    GameOfLife.button[row][col].setBackground(GameOfLife.colorInactive);
                    GameOfLife.button[row][col].setText("O");
                    GameOfLife.button[row][col].setForeground(GameOfLife.colorInactive);
                }
            }
        }



    }



    public static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }



}

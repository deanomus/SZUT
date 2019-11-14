package de.deanomus.GUI.gameoflife;

import java.awt.*;
import java.util.Random;

public class Utils {


    public static void checkAllForActive() {


        for ( int row=0; row < GameOfLife.rows; row++) {
            for ( int col = 0; col < GameOfLife.cols; col++) {
                if(GameOfLife.active[row][col]) {
                    GameOfLife.button[row][col].setBackground(Color.GREEN);
                    GameOfLife.button[row][col].setText("X");
                } else {
                    GameOfLife.button[row][col].setBackground(Color.RED);
                    GameOfLife.button[row][col].setText("O");
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

package de.deanomus.FirstLehrjahr.GUI.gameoflife.vorlagen;

import de.deanomus.FirstLehrjahr.GUI.gameoflife.GameOfLife;

public class allActive {


    public static void execute() {

        for (int row = 0; row < GameOfLife.rows; row++) {
            for ( int col = 0; col < GameOfLife.cols; col++) {
                GameOfLife.active[row][col] = true;
            }
        }


    }


}

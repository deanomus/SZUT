package de.deanomus.GUI.gameoflife.vorlagen;

import de.deanomus.GUI.gameoflife.GameOfLife;
import de.deanomus.GUI.gameoflife.Utils;

public class allActive {


    public static void execute() {

        for (int row = 0; row < GameOfLife.rows; row++) {
            for ( int col = 0; col < GameOfLife.cols; col++) {
                GameOfLife.active[row][col] = true;
            }
        }


    }


}

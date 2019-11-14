package de.deanomus.GUI.gameoflife.vorlagen;

import de.deanomus.GUI.gameoflife.GameOfLife;


public class half {



    public static void execute() {

        Boolean setActive = false;


        for (int row = 0; row < GameOfLife.rows; row++) {
            for ( int col = 0; col < GameOfLife.cols; col++) {
                if(setActive) {
                    setActive = false;
                    GameOfLife.active[row][col] = true;
                } else {
                    setActive = true;
                    GameOfLife.active[row][col] = false;
                }
            }
        }




    }



}

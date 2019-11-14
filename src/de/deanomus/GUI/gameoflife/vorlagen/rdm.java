package de.deanomus.GUI.gameoflife.vorlagen;

import de.deanomus.GUI.gameoflife.GameOfLife;
import de.deanomus.GUI.gameoflife.Utils;

public class rdm {


    public static void execute() {

        for (int row = 0; row < GameOfLife.rows; row++) {
            for ( int col = 0; col < GameOfLife.cols; col++) {

                if(Utils.getRandomNumberInRange(0, 1) == 1) {
                    GameOfLife.active[row][col] = true;
                } else {
                    GameOfLife.active[row][col] = false;
                }
                Utils.checkAllForActive();


            }
        }

    }


}

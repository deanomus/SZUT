package de.deanomus.GUI.gameoflife;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class checkLOOP {

    static Boolean alreadyStarted = false;

    public static void check() {
        if(alreadyStarted) return;
        alreadyStarted = true;



        Thread t1 = new Thread(new Runnable() {
            public void run() {
                while(alreadyStarted) {
                    if(GameOfLife.go) {
                        Boolean[][] afterCheck = new Boolean[GameOfLife.rows][GameOfLife.cols];
                        for ( int row=0; row < GameOfLife.rows; row++) {
                            for ( int col = 0; col < GameOfLife.cols; col++) {
                                afterCheck[row][col] = GameOfLife.active[row][col];
                            }
                        }

                        for ( int row=0; row < GameOfLife.rows; row++) {
                            for ( int col = 0; col < GameOfLife.cols; col++) {

                                if(GameOfLife.active[row][col]) {
                                    if(col != 0) {
                                        if(!GameOfLife.active[row][col-1]) afterCheck[row][col] = false;
                                    } else afterCheck[row][col] = false;
                                    if(col < (GameOfLife.cols-1)) {
                                        afterCheck[row][col+1] = true;
                                    } else {
                                        afterCheck[row][0] = true;
                                    }
                                }

                            }
                        }









                        for ( int row=0; row < GameOfLife.rows; row++) {
                            for ( int col = 0; col < GameOfLife.cols; col++) {
                                GameOfLife.active[row][col] = afterCheck[row][col];
                            }
                        }
                        Utils.checkAllForActive();

                    }
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                            e.printStackTrace();
                    }

                }
            }});
        t1.start();



    }


}

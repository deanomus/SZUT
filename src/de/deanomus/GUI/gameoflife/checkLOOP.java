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

                                int aNachb = 0;

                                if(col>0) {
                                    // Linker Nachbar
//                                    afterCheck[row][col-1] = true;
                                    if(GameOfLife.active[row][col-1]) aNachb++;
                                }

                                if(col>0 && row>0) {
                                    //oberer Linker Nachbar
//                                    afterCheck[row-1][col-1] = true;
                                    if(GameOfLife.active[row-1][col-1]) aNachb++;
                                }

                                if(row>0) {
                                    //oben
//                                    afterCheck[row-1][col] = true;
                                    if(GameOfLife.active[row-1][col]) aNachb++;
                                }

                                if(row>0 && col<GameOfLife.cols-1) {
                                    //oberer Rechter Nachbar
//                                    afterCheck[row-1][col+1] = true;
                                    if(GameOfLife.active[row-1][col+1]) aNachb++;
                                }

                                if(col<GameOfLife.cols-1) {
                                    //rechter Nachbar
//                                    afterCheck[row][col+1] = true;
                                    if(GameOfLife.active[row][col+1]) aNachb++;
                                }

                                if(row<GameOfLife.cols-1 && col<GameOfLife.cols-1) {
                                    //unterer rechter Nachbar
//                                    afterCheck[row+1][col+1] = true;
                                    if(GameOfLife.active[row+1][col+1]) aNachb++;
                                }

                                if(row<GameOfLife.rows-1) {
                                    //unterer Nachbar
//                                    afterCheck[row+1][col] = true;
                                    if(GameOfLife.active[row+1][col]) aNachb++;
                                }

                                if(row<GameOfLife.rows-1 && col>0) {
                                    //unterer Linker Nachbar
//                                    afterCheck[row+1][col-1] = true;
                                    if(GameOfLife.active[row+1][col-1]) aNachb++;
                                }


                                if(GameOfLife.active[row][col]) {
                                    if(aNachb != 2 && aNachb != 3) {
                                        afterCheck[row][col] = false;
                                    }
                                } else {
                                    if(aNachb == 3) {
                                        afterCheck[row][col] = true;
                                    }
                                }



//                                if(GameOfLife.active[row][col]) {
//                                    if(col != 0) {
//                                        if(!GameOfLife.active[row][col-1]) afterCheck[row][col] = false;
//                                    } else afterCheck[row][col] = false;
//                                    if(col < (GameOfLife.cols-1)) {
//                                        afterCheck[row][col+1] = true;
//                                    } else {
//                                        afterCheck[row][0] = true;
//                                    }
//                                }

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

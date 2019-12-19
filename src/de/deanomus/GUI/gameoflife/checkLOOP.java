package de.deanomus.GUI.gameoflife;

import de.deanomus.GUI.GUI;

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
//                        System.out.println("Width: " + GUI.frame.getSize().width + ", Height: " + GUI.frame.getSize().height);
                        if(GUI.frame.getSize().width < (GUI.width/3)) {
                            GUI.frame.setSize(GUI.width, GUI.frame.getSize().height);
                        } else if(GUI.frame.getSize().height < (GUI.height/3)) {
                            GUI.frame.setSize(GUI.frame.getSize().width, GUI.height);
                        }
                        Boolean[][] afterCheck = new Boolean[GameOfLife.rows][GameOfLife.cols];
                        for ( int row=0; row < GameOfLife.rows; row++) {
                            for ( int col = 0; col < GameOfLife.cols; col++) {
                                afterCheck[row][col] = GameOfLife.active[row][col];
                            }
                        }

                        for ( int row=0; row < GameOfLife.rows; row++) {
                            for ( int col = 0; col < GameOfLife.cols; col++) {

                                int aNachb = 0;

                                // Linker Nachbar
                                if(col>0) { if(GameOfLife.active[row][col-1]) aNachb++; }

                                //oberer Linker Nachbar
                                if(col>0 && row>0) { if(GameOfLife.active[row-1][col-1]) aNachb++; }

                                //oben
                                if(row>0) { if(GameOfLife.active[row-1][col]) aNachb++; }

                                //oberer Rechter Nachbar
                                if(row>0 && col<GameOfLife.cols-1) { if(GameOfLife.active[row-1][col+1]) aNachb++; }

                                //rechter Nachbar
                                if(col<GameOfLife.cols-1) { if(GameOfLife.active[row][col+1]) aNachb++; }

                                //unterer rechter Nachbar
                                if(row<GameOfLife.cols-1 && col<GameOfLife.cols-1) { if(GameOfLife.active[row+1][col+1]) aNachb++; }

                                //unterer Nachbar
                                if(row<GameOfLife.rows-1) { if(GameOfLife.active[row+1][col]) aNachb++; }

                                //unterer Linker Nachbar
                                if(row<GameOfLife.rows-1 && col>0) { if(GameOfLife.active[row+1][col-1]) aNachb++; }


                                if(GameOfLife.active[row][col]) {
                                    if(aNachb != 2 && aNachb != 3) {
                                        afterCheck[row][col] = false;
                                    }
                                } else {
                                    if(aNachb == 3) {
                                        afterCheck[row][col] = true;
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

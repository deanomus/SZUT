package de.deanomus.GUI.buschfeuer;

public class Check {


    public static void fire(int[][] before) {
        int[][] after = new int[FeuerPanel.rows][FeuerPanel.cols];
        for ( int row=0; row < FeuerPanel.rows; row++) {
            for (int col = 0; col < FeuerPanel.cols; col++) {
                after[row][col] = before[row][col];
            }
        }


        for ( int row=0; row < FeuerPanel.rows; row++) {
            for (int col = 0; col < FeuerPanel.cols; col++) {
                if(before[row][col] == FeuerPanel.fire) {

                    if(col>0) {
                        // Linker Nachbar
                        if(before[row][col-1] == FeuerPanel.OK) after[row][col-1] = FeuerPanel.fire;
                    }
                    if(row>0) {
                        // Oberer Nachbar
                        if(before[row-1][col] == FeuerPanel.OK) after[row-1][col] = FeuerPanel.fire;
                    }
                    if(col<FeuerPanel.cols-1) {
                        //rechter Nachbar
                        if(before[row][col+1] == FeuerPanel.OK) after[row][col+1] = FeuerPanel.fire;
                    }
                    if(row<FeuerPanel.rows-1) {
                        //unterer Nachbar
                        if(before[row+1][col] == FeuerPanel.OK) after[row+1][col] = FeuerPanel.fire;
                    }
                }
            }
        }
        execute(after);
    }


    public static void execute(int[][] after) {
        for ( int row=0; row < FeuerPanel.rows; row++) {
            for ( int col = 0; col < FeuerPanel.cols; col++) {
                if(after[row][col] != FeuerPanel.fieldStatus[row][col]) {
                    if (after[row][col] == FeuerPanel.OK) {
                        FeuerPanel.fieldStatus[row][col] = FeuerPanel.OK;
                        FeuerPanel.field[row][col].setBackground(FeuerPanel.colorOK);
                        FeuerPanel.field[row][col].setText(String.valueOf(FeuerPanel.OK));
                    } else if (after[row][col] == FeuerPanel.fire) {
                        FeuerPanel.fieldStatus[row][col] = FeuerPanel.fire;
                        FeuerPanel.field[row][col].setBackground(FeuerPanel.colorFire);
                        FeuerPanel.field[row][col].setText(String.valueOf(FeuerPanel.fire));
                    } else if (after[row][col] == FeuerPanel.water) {
                        FeuerPanel.fieldStatus[row][col] = FeuerPanel.water;
                        FeuerPanel.field[row][col].setBackground(FeuerPanel.colorWater);
                        FeuerPanel.field[row][col].setText(String.valueOf(FeuerPanel.water));
                    } else if (after[row][col] == FeuerPanel.stone) {
                        FeuerPanel.fieldStatus[row][col] = FeuerPanel.stone;
                        FeuerPanel.field[row][col].setBackground(FeuerPanel.colorStone);
                        FeuerPanel.field[row][col].setText(String.valueOf(FeuerPanel.stone));
                    }
                }
            }
        }
    }


}

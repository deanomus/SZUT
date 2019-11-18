package de.deanomus.GUI.buschfeuer;

public class Check {


    public static void execute(int[][] after) {
        for ( int row=0; row < FeuerPanel.rows; row++) {
            for ( int col = 0; col < FeuerPanel.cols; col++) {



                if(after[row][col] == FeuerPanel.OK && after[row][col] != FeuerPanel.fieldStatus[row][col]) {
                    FeuerPanel.fieldStatus[row][col] = FeuerPanel.OK;
                    FeuerPanel.field[row][col].setBackground(FeuerPanel.colorOK);
                    FeuerPanel.field[row][col].setText(String.valueOf(FeuerPanel.OK));
                } else if(after[row][col] == FeuerPanel.fire && after[row][col] != FeuerPanel.fieldStatus[row][col]) {
                    FeuerPanel.fieldStatus[row][col] = FeuerPanel.fire;
                    FeuerPanel.field[row][col].setBackground(FeuerPanel.colorFire);
                    FeuerPanel.field[row][col].setText(String.valueOf(FeuerPanel.fire));
                } else if(after[row][col] == FeuerPanel.water && after[row][col] != FeuerPanel.fieldStatus[row][col]) {
                    FeuerPanel.fieldStatus[row][col] = FeuerPanel.water;
                    FeuerPanel.field[row][col].setBackground(FeuerPanel.colorWater);
                    FeuerPanel.field[row][col].setText(String.valueOf(FeuerPanel.water));
                }
            }
        }
    }


}

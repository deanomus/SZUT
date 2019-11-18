package de.deanomus.GUI.buschfeuer;

import de.deanomus.GUI.gameoflife.GameOfLife;

import javax.swing.*;
import java.awt.*;

public class FeuerPanel {

    public static JPanel firePanel;

    public static int
            rows = GameOfLife.rows,
            cols = GameOfLife.cols;

    public static JButton[][] field;
    public static int[][] fieldStatus;

    public static int
                    OK = 0,
                    fire = 1,
                    water = 2;

    public static Color
                    colorOK = GameOfLife.colorActive,
                    colorFire = GameOfLife.colorInactive,
                    colorWater = Color.BLUE;

    public static void start() {
        field = new JButton[rows][cols];
        fieldStatus = new int[rows][cols];

        firePanel = new JPanel();
        firePanel.setLayout(new GridLayout(rows, cols));
        firePanel.setBackground(GameOfLife.colorBackground);

        FieldListener listener = new FieldListener();


        for ( int row=0; row < rows; row++) {
            for ( int col = 0; col < cols; col++) {
                fieldStatus[row][col] = OK;
                field[row][col] = new JButton();
                field[row][col].setBackground(colorOK);
                field[row][col].setText(String.valueOf(OK));
                field[row][col].addActionListener(listener);
                firePanel.add(field[row][col]);
            }
        }
    }


}

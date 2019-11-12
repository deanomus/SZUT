package de.deanomus.GUI;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class GUI extends javax.swing.JFrame {

    static GUI frame;


    public static void gui() {
        frame = new GUI();
        frame.setTitle("Game Of Life - SZUT");
        frame.setSize(1000, 720);
        frame.setLocation(50,50);
        frame.setResizable(false);



        Border border = new LineBorder(Color.GREEN);
        JMenuBar bar = new JMenuBar();
        bar.setBorder(border);


        JMenu game = new JMenu("GameOfLife");
        JMenuItem gamestart = new JMenuItem("Start");
        JMenuItem gamepause = new JMenuItem("Pause");



        game.add(gamestart);
        game.add(gamepause);
        bar.add(game);




        bar.add(game);
        frame.setJMenuBar(bar);
        frame.setVisible(true);
    }



}

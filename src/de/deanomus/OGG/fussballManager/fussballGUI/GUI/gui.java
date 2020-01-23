package de.deanomus.OGG.fussballManager.fussballGUI.GUI;

import javax.swing.*;
import java.awt.*;

public class gui extends JFrame {

    // --- Options \/
    private int
            width = 800,
            height = 600;
    private String
            guiTitle = "Fussball Manager";
    private boolean
            guiResizable = false;
    // --- Options END


    public gui() {
        this.setTitle(this.guiTitle);
        this.setSize(this.width, this.height);
        this.setLocation(50, 50);
        this.setResizable(this.guiResizable);
        this.setVisible(true);
    }

    private void showOptions() {

    }

    public void startGame() {

    }
}

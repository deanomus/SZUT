package de.deanomus.OGG.fussballManager.fussballGUI.GUI;

public class gui extends Utils {

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
        init();
        this.setTitle(this.guiTitle);
        this.setSize(this.width, this.height);
        this.setLocation(50, 50);
        this.setResizable(this.guiResizable);
        this.setup();
    }


    public void startGame() {

    }
}

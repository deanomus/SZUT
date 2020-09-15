package de.deanomus.FirstLehrjahr.OGG.fussballManager.fussballGUI;

public class SpielCancelException extends Exception {


    public SpielCancelException(int Gametime) {

    }

    public String getMessage() {
        return "Spiel abgebrochen!";
    }


}

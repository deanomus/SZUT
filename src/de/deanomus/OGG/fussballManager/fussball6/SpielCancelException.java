package de.deanomus.OGG.fussballManager.fussball6;

public class SpielCancelException extends Exception {


    public SpielCancelException(int Gametime) {

    }

    public String getMessage() {
        return "Spiel abgebrochen!";
    }


}

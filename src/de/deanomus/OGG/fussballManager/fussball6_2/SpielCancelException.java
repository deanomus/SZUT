package de.deanomus.OGG.fussballManager.fussball6_2;

public class SpielCancelException extends Exception {


    public SpielCancelException(int Gametime) {

    }

    public String getMessage() {
        return "Spiel abgebrochen!";
    }


}

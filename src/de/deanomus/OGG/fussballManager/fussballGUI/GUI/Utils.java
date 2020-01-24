package de.deanomus.OGG.fussballManager.fussballGUI.GUI;

import javax.swing.*;

public abstract class Utils extends Storage {

    protected void hideAll() {
        showMain(false);
        showSettings(false);
    }

    //Gameplay Uebersicht
    protected void showMain(Boolean show) {
        if(show) {

        } else {

        }
    }

    protected void init() {

    }

    //Beim ersten Start -> Mannschaften & Spieler Erstellung
    protected void setup() {

    }

    //Einsellungen & Uebersicht der Mannschaften sowie Spieler
    protected void showSettings(Boolean show) {

    }
}

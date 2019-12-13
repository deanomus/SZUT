package de.deanomus.OGG.fussballManager.fussball5;

import java.util.ArrayList;

public class Mannschaft {

    private ArrayList<Player> playerList;
    private String
                mName;
    private Trainer trainer;
    private Torwart torwart;


    public String getName() {
        return mName;
    }

    public Mannschaft(Trainer trainer, Torwart torwart, String name) {
        this.playerList = new ArrayList<>();
        this.mName = name;
        this.trainer = trainer;
        this.torwart = torwart;

    }

    public void addPlayer(Player p) {
        this.playerList.add(p);
    }

    private int getMotivation() {
        int mot = 0;
        for(Player p : this.playerList) {
            mot += p.getMotivation();
        }
        int motivation = mot / this.playerList.size();
        return motivation;
    }

    private int getStarke() {
        int i = 0;
        for(Player p : playerList) {
            i += p.getExperience();
        }
        int staerke = i / playerList.size();
        return staerke;
    }

    public String toString() {
        String s = "";

        s +=
                "### MANNSCHAFT ###\n" +
                "Name: " + this.mName + "\n" +
                "Spieler: " + this.playerList.size() + "\n" +
                "Motivation" + this.getMotivation() + "\n" +
                "Staerke: " + this.getStarke() + "\n";

        s +=
                "### TRAINER ###\n" + trainer;

        s +=
                "\n### TORWART ###\n" + torwart;

        s +=
                "\n### PLAYERS ###\n";

        for(Player p : playerList) {
            s += p + "\n";
        }

        return s;
    }

}

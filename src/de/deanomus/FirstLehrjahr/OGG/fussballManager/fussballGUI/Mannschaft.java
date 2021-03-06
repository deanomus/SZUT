package de.deanomus.FirstLehrjahr.OGG.fussballManager.fussballGUI;

import de.deanomus.FirstLehrjahr.util.Data;

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

    public Torwart getTorwart() {
        return this.torwart;
    }

    private int getMotivation() {
        int mot = 0;
        for(Player p : this.playerList) {
            mot += p.getMotivation();
        }
        int motivation = mot / this.playerList.size();
        return motivation;
    }

    public Player getRdmPlayer() {

        int i = 0;
        int needed = Data.rdmInt(0, playerList.size() - 1);

        for(Player p : playerList) {
            if(i == needed) {
                return p;
            }
            i++;
        }

        System.out.println("Error while get an random player");
        while(!Data.confirm()) {
            System.out.println("Please confirm");
        }
        return getRdmPlayer();

    }

    private int getStarke() {
        int i = 0;
        for(Player p : playerList) {
            i += p.getStaerke();
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

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public Trainer getTrainer() {
        return trainer;
    }
}

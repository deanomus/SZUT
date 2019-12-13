package de.deanomus.OGG.fussballManager.fussball5;

public class Spiel {

    private StringBuilder
                History;

    public String getHistory() {
        return History.toString();
    }

    private int[] treffer = new int[2];
    private Mannschaft[] team = new Mannschaft[2];
    public int
                Heim = 0,
                Guest = 1;


    public Spiel(Mannschaft HeimTeam, Mannschaft GastTeam) {
        History = new StringBuilder();
        History.append("### VERLAUF ###\n");
        treffer[Heim] = 0;
        treffer[Guest] = 0;
        team[Heim] = HeimTeam;
        team[Guest] = GastTeam;
    }

    public String toString() {
        String s =
                "Name Team-1: " + team[Heim].getName() + "\n" +
                "Name Team-2: " + team[Guest].getName();

        return s;
    }

    public int getTreffer(int Team) {
        return treffer[Team];
    }

    public void addTreffer(int Team) {
        treffer[Team]++;
        History.append(this.team[Team].getName() + " hat ein Tor gemacht!\n");
    }

}

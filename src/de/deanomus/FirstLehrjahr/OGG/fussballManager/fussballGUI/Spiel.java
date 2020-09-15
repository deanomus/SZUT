package de.deanomus.FirstLehrjahr.OGG.fussballManager.fussballGUI;

public class Spiel {

    private StringBuilder
                History;

    public String getHistory() {
        return History.toString();
    }

    private int[] treffer = new int[2];
    private Mannschaft[] team = new Mannschaft[2];
    public int
                HEIM = 0,
                GUEST = 1;


    public Spiel(Mannschaft HeimTeam, Mannschaft GastTeam) {
        History = new StringBuilder();
        History.append("### VERLAUF ###\n");
        treffer[HEIM] = 0;
        treffer[GUEST] = 0;
        team[HEIM] = HeimTeam;
        team[GUEST] = GastTeam;
    }

    public String toString() {
        String s =
                "Name Team-1: " + team[HEIM].getName() + "\n" +
                "Name Team-2: " + team[GUEST].getName();

        return s;
    }

    public int getTreffer(int Team) {
        return treffer[Team];
    }

    public void addTreffer(int Team) {
        treffer[Team]++;
        History.append(this.team[Team].getName() + " hat ein Tor gemacht!\n");
        System.out.println(this.team[Team].getName() + " hat ein Tor gemacht!");
    }

    public Mannschaft getTeam(int Team) {
        return this.team[Team];
    }
}

package de.deanomus.OGG.fussballManager.fussball5;

import de.deanomus.util.Data;

public class Gameplay {

    private Spiel game;
    private final int
                    SPIELZEIT = 90,
                    MAX_NACHSPIELZEIT = 5,
                    MAX_DAUER_NEXT_ACTION = 10;

    private int calculateSchussStaerke(Player p) {
        return (p.getStaerke()*p.getMotivation()/10);
    }

    private boolean erziehltTor(Torwart t, Player p) {
        int pWert = calculateSchussStaerke(p) + Data.rdmInt(-2, 2);
        int tWert = t.getReactionSkill() + Data.rdmInt(-2, 2);

        if(pWert < 1) pWert = 1;
        if(tWert < 1) tWert = 1;

        if(pWert == tWert) {
            if(Data.rdmInt(1, 2) == 1) {
                return true;
            } else return false;
        } else if(pWert > tWert) {
            return true;
        } else return false;
    }

    private int calulateWert(int Team) {
        int i = 0;

        for (Player p : game.getTeam(Team).getPlayerList()) {
            i += (p.getStaerke() + p.getMotivation());

        }
        i += game.getTeam(Team).getTrainer().getExperience();

        i += (Data.rdmInt(-3, 3));
        if(i < 1) i = 1;
        return i;
    }


    public Gameplay(Spiel spiel) {
        this.game = spiel;
    }

}

package de.deanomus.FirstLehrjahr.OGG.fussballManager.fussball5;

import de.deanomus.FirstLehrjahr.core.Core;
import de.deanomus.FirstLehrjahr.util.Data;

import java.util.concurrent.TimeUnit;

public class Gameplay {

    private Boolean alreadyStarted = false;
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

    private int calulateWert(int Team, Spiel game) { // Mannschafts-Wert
        int i = 0;

        for (Player p : game.getTeam(Team).getPlayerList()) {
            i += (p.getStaerke() + p.getMotivation());

        }
        i += game.getTeam(Team).getTrainer().getExperience();

        i += (Data.rdmInt(-3, 3));
        if(i < 1) i = 1;
        return i;
    }

    private void doSomething(Spiel game, Mannschaft team) {
        int rdmInt = Data.rdmInt(0, 0);
        if(rdmInt == 0) {
            Player p = team.getRdmPlayer();
//            System.out.println(p);
            Torwart t;
            if(team == game.getTeam(game.HEIM)) { t = game.getTeam(game.GUEST).getTorwart(); } else { t = game.getTeam(game.HEIM).getTorwart(); }
            if(erziehltTor(t, p)) {
                if(team == game.getTeam(game.HEIM)) { game.addTreffer(game.HEIM); } else { game.addTreffer(game.GUEST); }
            }
        }
    }



    public void spielen(Spiel game) {
        if(alreadyStarted) return;
        alreadyStarted = true;

        System.out.println("!!! LETS GO !!!");
        final int MAX_GAMETIME = (SPIELZEIT) + Data.rdmInt(0, MAX_NACHSPIELZEIT);
        int gametime = 0;

        while(gametime <= MAX_GAMETIME) {

            int time = Data.rdmInt(1, MAX_DAUER_NEXT_ACTION);
            gametime += time;

            int summeWerte = calulateWert(game.HEIM, game) + calulateWert(game.GUEST, game);

            if((calulateWert(game.HEIM, game) + Data.rdmInt(0, summeWerte)) >= (calulateWert(game.GUEST, game) + Data.rdmInt(0, summeWerte))) {
                doSomething(game, game.getTeam(game.HEIM)); } else { doSomething(game, game.getTeam(game.GUEST)); }




            try {
                if(!Core.DEBUG) { TimeUnit.SECONDS.sleep(time); } else { TimeUnit.MILLISECONDS.sleep(time); }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        alreadyStarted = false;
    }

}

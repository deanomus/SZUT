/**
 * Diese Klasse modelliert Räume in der Welt von Zuul.
 * 
 * Ein "Raum" repräsentiert einen Ort in der virtuellen Landschaft des
 * Spiels. Ein Raum ist mit anderen Räumen über Ausgänge verbunden.
 * Mögliche Ausgänge liegen im Norden, Osten, Süden und Westen.
 * Für jede Richtung hält ein Raum eine Referenz auf den 
 * benachbarten Raum.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
package de.deanomus.OGG.zuul;

import java.util.HashMap;

public class Raum
{
    private String beschreibung;
//    private Raum
//            nordausgang,
//            suedausgang,
//            ostausgang,
//            westausgang,
//            UpAusgang,
//            DownAusgang;
    private HashMap<String, Raum> ausgaenge = new HashMap<String, Raum>();

    /**
     * Erzeuge einen Raum mit einer Beschreibung. Ein Raum
     * hat anfangs keine Ausgänge.
     * @param beschreibung enthält eine Beschreibung in der Form
     *        "in einer Küche" oder "auf einem Sportplatz".
     */
    public Raum(String beschreibung)
    {
        this.beschreibung = beschreibung;
    }

    /**
     * Definiere die Ausgänge dieses Raums. Jede Richtung
     * führt entweder in einen anderen Raum oder ist 'null'
     * (kein Ausgang).
     * @param norden Der Nordeingang.
     * @param osten Der Osteingang.
     * @param sueden Der Südeingang.
     * @param westen Der Westeingang.
     */
    public void setzeAusgaenge(Raum norden, Raum osten,
                               Raum sueden, Raum westen) 
    {
        setzeAusgaenge(norden, osten, sueden, westen, null, null);
    }

    public void setzeAusgaenge(Raum norden, Raum osten,
                               Raum sueden, Raum westen,
                               Raum StairUP,Raum StairDOWN)
    {
        setzeAusgaenge(norden, osten, sueden, westen, StairUP, StairDOWN, null);
    }

    public void setzeAusgaenge(Raum norden, Raum osten,
                               Raum sueden, Raum westen,
                               Raum StairUP,Raum StairDOWN,
                               Raum window)
    {
        ausgaenge.put("north", norden);
        ausgaenge.put("east", osten);
        ausgaenge.put("south", sueden);
        ausgaenge.put("west", westen);
        ausgaenge.put("up", StairUP);
        ausgaenge.put("down", StairDOWN);
        ausgaenge.put("window", window);
    }
    /**
     * @return Die Beschreibung dieses Raums.
     */
    public String gibBeschreibung() {
        String s = "Sie sind " + beschreibung + "\n";
        s += "Ausgänge: " + ausgaengeToString();
        return s;
    }

    public String ausgaengeToString() {
        String out = "";
        for(String s : ausgaenge.keySet()) {
            if(ausgaenge.get(s) != null) out += s + ", ";
        }
        return out;
    }
    public Raum getAusgang(String dir) {
        if (dir.equals(null)) return null;
        if(ausgaenge.get(dir) != null) return ausgaenge.get(dir);
        return null;
    }

}

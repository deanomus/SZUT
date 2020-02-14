/**
 * Diese Klasse modelliert R�ume in der Welt von Zuul.
 * 
 * Ein "Raum" repr�sentiert einen Ort in der virtuellen Landschaft des
 * Spiels. Ein Raum ist mit anderen R�umen �ber Ausg�nge verbunden.
 * M�gliche Ausg�nge liegen im Norden, Osten, S�den und Westen.
 * F�r jede Richtung h�lt ein Raum eine Referenz auf den 
 * benachbarten Raum.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
package de.deanomus.OGG.zuul;

public class Raum 
{
    private String beschreibung;
    private Raum
            nordausgang,
            suedausgang,
            ostausgang,
            westausgang,
            UpAusgang,
            DownAusgang;

    /**
     * Erzeuge einen Raum mit einer Beschreibung. Ein Raum
     * hat anfangs keine Ausg�nge.
     * @param beschreibung enth�lt eine Beschreibung in der Form
     *        "in einer K�che" oder "auf einem Sportplatz".
     */
    public Raum(String beschreibung)
    {
        this.beschreibung = beschreibung;
    }

    /**
     * Definiere die Ausg�nge dieses Raums. Jede Richtung
     * f�hrt entweder in einen anderen Raum oder ist 'null'
     * (kein Ausgang).
     * @param norden Der Nordeingang.
     * @param osten Der Osteingang.
     * @param sueden Der S�deingang.
     * @param westen Der Westeingang.
     */
    public void setzeAusgaenge(Raum norden, Raum osten,
                               Raum sueden, Raum westen) 
    {
        setzeAusgaenge(norden, osten, sueden, westen, null, null);
    }

    /**
     * Definiere die Ausg�nge dieses Raums. Jede Richtung
     * f�hrt entweder in einen anderen Raum oder ist 'null'
     * (kein Ausgang).
     * @param norden Der Nordeingang.
     * @param osten Der Osteingang.
     * @param sueden Der S�deingang.
     * @param westen Der Westeingang.
     * @param StairUP Treppe nach Oben
     * @param StairDOWN Treppe nach Unten
     */
    public void setzeAusgaenge(Raum norden, Raum osten,
                               Raum sueden, Raum westen,
                               Raum StairUP,Raum StairDOWN)
    {
        if(norden   != null) nordausgang    = norden;
        if(osten    != null) ostausgang     = osten;
        if(sueden   != null) suedausgang    = sueden;
        if(westen   != null) westausgang    = westen;
        if(StairUP  != null) UpAusgang      = StairUP;
        if(StairDOWN!= null) DownAusgang    = StairDOWN;
    }
    /**
     * @return Die Beschreibung dieses Raums.
     */
    public String gibBeschreibung() {
        return beschreibung;
    }

    public String ausgaengeToString() {
        String out = "Aktueller Raum: " + this.beschreibung + "\n";
        if (nordausgang != null) out += "north, ";
        if (ostausgang  != null) out += "east, ";
        if (suedausgang != null) out += "south, ";
        if (westausgang != null) out += "west, ";
        if (UpAusgang   != null) out += "up, ";
        if (DownAusgang != null) out += "down, ";
        return out;
    }
    public Raum getAusgang(String dir) {
        if (dir.equals(null)) return null;
        if (dir.equalsIgnoreCase("north") && nordausgang != null) return nordausgang;
        if (dir.equalsIgnoreCase("east") && ostausgang != null) return ostausgang;
        if (dir.equalsIgnoreCase("south") && suedausgang != null) return suedausgang;
        if (dir.equalsIgnoreCase("west") && westausgang != null) return westausgang;
        if (dir.equalsIgnoreCase("up") && UpAusgang != null) return UpAusgang;
        if (dir.equalsIgnoreCase("down") && DownAusgang != null) return DownAusgang;
        return null;
    }

}

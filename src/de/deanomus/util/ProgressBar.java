package de.deanomus.util;

import java.text.DecimalFormat;

public class ProgressBar {

    private Boolean
            showPercent = false,
            showProgressBar = false,
            showStats = false;

    private int
            max;

    public ProgressBar(int max) {
        this.max = max;
        System.out.println("");
    }


    public ProgressBar setNow(int now) {
        String out = "";
        if (showPercent) {

            double percent = (100.00 / max) * now;
            DecimalFormat df = new DecimalFormat("#.##");
            out += "| " + df.format(percent) + "% |";

        }

        if (showProgressBar) {
            double percent = (100.00 / max) * now;
            int bars = 10;


            String b = "";
            for (int i = 0; i < bars; i++) {

            }
        }

        if (showStats) {
            out += "| " + now + " - " + max + " |";
        }


        System.out.print(out + "\r");
        return this;
    }

    public ProgressBar showPercent(Boolean showPercent) {
        this.showPercent = showPercent;
        return this;
    }

    public ProgressBar showStats(Boolean showStats) {
        this.showStats = showStats;
        return this;
    }


}

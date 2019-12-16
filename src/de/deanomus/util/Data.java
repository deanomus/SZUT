package de.deanomus.util;

import de.deanomus.core.Core;

import java.util.Random;
import java.util.Scanner;

public class Data {

    // RUN ALL
    // 1 1 100 1 1 100 100 100 1 5 WelCHES 1 7 44 55 66 77 88 99 10 22 33 55 33 22 654 24 66 44 33 77 88 66 33 22 44 66 77 88 77 876 356 87 5 43 56 5 4 6 754 4 6765 67765 43 0 1 8 1 9 20 20 20 20 1 10 24 24 24 24 1 12 2 0 2 1 2 2 2 3 2 4 2 5 2 6 3 1 3 2 3 3 3 4 3 5

    public static int intScan(Scanner scan) {
        Integer i = null;
        while(i == null) {
            String s = scan.next();
            try {
                i = Integer.parseInt(s);
            } catch (Exception e) {
                if (possible2Convert(s)) i = text2int(s);
                if(i == null) System.out.print("\nEin Fehler ist aufgetreten! Versuche es erneut!\n");
            }
        }

        if (i != null) {
            return i;
        } else return -1;

    }

    public static boolean possible2Convert(String number) {
        if(!(text2int(number) == null)) return true;
        return false;
    }

    public static int rdmInt(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static void DEBUG(String Message) {
        if(Core.DEBUG) System.out.println("DEBUG: " + Message);
    }

    public static Integer text2int(String number) {
        //Deutsch / German
        if(number.equalsIgnoreCase("null")) return 0;
        if(number.equalsIgnoreCase("eins")) return 1;
        if(number.equalsIgnoreCase("zwei")) return 2;
        if(number.equalsIgnoreCase("drei")) return 3;
        if(number.equalsIgnoreCase("vier")) return 4;
        if(number.equalsIgnoreCase("fünf")) return 5;
        if(number.equalsIgnoreCase("sechs")) return 6;
        if(number.equalsIgnoreCase("sieben")) return 7;
        if(number.equalsIgnoreCase("acht")) return 8;
        if(number.equalsIgnoreCase("neun")) return 9;
        if(number.equalsIgnoreCase("zehn")) return 10;
        if(number.equalsIgnoreCase("elf")) return 11;
        if(number.equalsIgnoreCase("zwölf")) return 12;
        if(number.equalsIgnoreCase("dreizehn")) return 13;
        if(number.equalsIgnoreCase("vierzehn")) return 14;
        if(number.equalsIgnoreCase("fünfzehn")) return 15;
        if(number.equalsIgnoreCase("sechszehn")) return 16;
        if(number.equalsIgnoreCase("siebzehn")) return 17;
        if(number.equalsIgnoreCase("achtzehn")) return 18;
        if(number.equalsIgnoreCase("neunzehn")) return 19;
        if(number.equalsIgnoreCase("zwanzig")) return 20;
        if(number.equalsIgnoreCase("einundzwanzig")) return 21;
        if(number.equalsIgnoreCase("zweiundzwanzig")) return 22;
        if(number.equalsIgnoreCase("dreiundzwanzig")) return 23;
        if(number.equalsIgnoreCase("vierundzwanzig")) return 24;
        if(number.equalsIgnoreCase("fünfundzwanzig")) return 25;
        if(number.equalsIgnoreCase("sechsundzwanzig")) return 26;
        if(number.equalsIgnoreCase("siebenundzwanzig")) return 27;
        if(number.equalsIgnoreCase("achtundzwanzig")) return 28;
        if(number.equalsIgnoreCase("neunundzwanzig")) return 29;
        if(number.equalsIgnoreCase("dreißig")) return 30;
        if(number.equalsIgnoreCase("einunddreißig")) return 31;
        if(number.equalsIgnoreCase("zweiunddreißig")) return 32;
        if(number.equalsIgnoreCase("dreiunddreißig")) return 33;
        if(number.equalsIgnoreCase("vierunddreißig")) return 34;
        if(number.equalsIgnoreCase("fünfunddreißig")) return 35;
        if(number.equalsIgnoreCase("sechsunddreißig")) return 36;
        if(number.equalsIgnoreCase("siebenunddreißig")) return 37;
        if(number.equalsIgnoreCase("achtunddreißig")) return 38;
        if(number.equalsIgnoreCase("neununddreißig")) return 39;
        if(number.equalsIgnoreCase("vierzig")) return 40;
        if(number.equalsIgnoreCase("einundvierzig")) return 41;
        if(number.equalsIgnoreCase("zweiundvierzig")) return 42;
        if(number.equalsIgnoreCase("dreiundvierzig")) return 43;
        if(number.equalsIgnoreCase("vierundvierzig")) return 44;
        if(number.equalsIgnoreCase("fünfundvierzig")) return 45;
        if(number.equalsIgnoreCase("sechsundvierzig")) return 46;
        if(number.equalsIgnoreCase("siebenundvierzig")) return 47;
        if(number.equalsIgnoreCase("achtundvierzig")) return 48;
        if(number.equalsIgnoreCase("neunundvierzig")) return 49;
        if(number.equalsIgnoreCase("fünfzig")) return 50;


        //English
        if(number.equalsIgnoreCase("one")) return 1;
        if(number.equalsIgnoreCase("two")) return 2;
        if(number.equalsIgnoreCase("three")) return 3;
        if(number.equalsIgnoreCase("four")) return 4;
        if(number.equalsIgnoreCase("five")) return 5;
        if(number.equalsIgnoreCase("six")) return 6;
        if(number.equalsIgnoreCase("seven")) return 7;
        if(number.equalsIgnoreCase("eleven")) return 7;
        if(number.equalsIgnoreCase("ate")) return 8;
        if(number.equalsIgnoreCase("nine")) return 9;
        if(number.equalsIgnoreCase("ten")) return 10;
        if(number.equalsIgnoreCase("eleven")) return 11;
        if(number.equalsIgnoreCase("twelve")) return 12;
        if (number.equalsIgnoreCase ("thirteen")) return 13;
        if (number.equalsIgnoreCase ("fourteen")) return 14;
        if (number.equalsIgnoreCase ("fifteen")) return 15;
        if (number.equalsIgnoreCase ("sixteen")) return 16;
        if (number.equalsIgnoreCase ("seventeen")) return 17;
        if (number.equalsIgnoreCase ("eighteen")) return 18;
        if (number.equalsIgnoreCase ("nineteen")) return 19;
        if (number.equalsIgnoreCase ("twenty")) return 20;
        if (number.equalsIgnoreCase ("twenty one")) return 21;
        if (number.equalsIgnoreCase ("twenty-two")) return 22;
        if (number.equalsIgnoreCase ("twenty-three")) return 23;
        if (number.equalsIgnoreCase ("twenty-four")) return 24;
        if (number.equalsIgnoreCase ("twenty-five")) return 25;
        if (number.equalsIgnoreCase ("twenty-six")) return 26;
        if (number.equalsIgnoreCase ("twenty-seven")) return 27;
        if (number.equalsIgnoreCase ("twenty-eight")) return 28;
        if (number.equalsIgnoreCase ("twenty-nine")) return 29;
        if (number.equalsIgnoreCase ("thirty")) return 30;
        if (number.equalsIgnoreCase ("thirty-one")) return 31;
        if (number.equalsIgnoreCase ("thirty-two")) return 32;
        if (number.equalsIgnoreCase ("thirty-three")) return 33;
        if (number.equalsIgnoreCase ("thirty-four")) return 34;
        if (number.equalsIgnoreCase ("thirty-five")) return 35;
        if (number.equalsIgnoreCase ("thirty-six")) return 36;
        if (number.equalsIgnoreCase ("thirty-seven")) return 37;
        if (number.equalsIgnoreCase ("thirty-eight")) return 38;
        if (number.equalsIgnoreCase ("thirty-nine")) return 39;
        if (number.equalsIgnoreCase ("forty")) return 40;
        if (number.equalsIgnoreCase ("one-forty-one")) return 41;
        if (number.equalsIgnoreCase ("forty-two")) return 42;
        if (number.equalsIgnoreCase ("forty-three")) return 43;
        if (number.equalsIgnoreCase ("forty-four")) return 44;
        if (number.equalsIgnoreCase ("forty-five")) return 45;
        if (number.equalsIgnoreCase ("forty-six")) return 46;
        if (number.equalsIgnoreCase ("forty-seven")) return 47;
        if (number.equalsIgnoreCase ("forty-eight")) return 48;
        if (number.equalsIgnoreCase ("forty-nine")) return 49;
        if (number.equalsIgnoreCase ("fifty")) return 50;




        return null;
    }


}

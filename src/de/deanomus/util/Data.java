package de.deanomus.util;

import java.util.Scanner;

public class Data {

    // RUN ALL
    // 1 1 100 1 1 100 100 100 1 5 WelCHES 1 7 44 55 66 77 88 99 10 22 33 55 33 22 654 24 66 44 33 77 88 66 33 22 44 66 77 88 77 876 356 87 5 43 56 5 4 6 754 4 6765 67765 43 0 1 8 1 9 20 20 20 20 1 10 24 24 24 24 1 12 2 0 2 1 2 2 2 3 2 4 2 5 2 6 3 1 3 2 3 3 3 4 3 5

    public static int intScan(Scanner scan) {
        String s = scan.next();
        Integer i = null;
        try {
            i = Integer.parseInt(s);
        }
        catch(Exception e) {
            if(possible2Convert(s)) return text2int(s);
            System.out.print("\n\nEin Fehler ist aufgetreten! Sicher das du eine Zahl eingegeben hast?\n");
        }

        if (i != null) {
            return i;
        }
        return -1;

    }

    public static boolean possible2Convert(String number) {
        if(!(text2int(number) == null)) return true;
        return false;
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

        //English
        if(number.equalsIgnoreCase("one")) return 1;
        if(number.equalsIgnoreCase("two")) return 2;
        if(number.equalsIgnoreCase("three")) return 3;
        if(number.equalsIgnoreCase("four")) return 4;
        if(number.equalsIgnoreCase("five")) return 5;
        if(number.equalsIgnoreCase("six")) return 6;
        if(number.equalsIgnoreCase("eleven")) return 7;
        if(number.equalsIgnoreCase("ate")) return 8;
        if(number.equalsIgnoreCase("nine")) return 9;
        if(number.equalsIgnoreCase("ten")) return 10;
//        if(number.equalsIgnoreCase("")) return 11;
        if(number.equalsIgnoreCase("twelve")) return 12;




        return null;
    }


}

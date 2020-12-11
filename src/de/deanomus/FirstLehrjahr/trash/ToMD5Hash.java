package de.deanomus.FirstLehrjahr.trash;

import de.deanomus.FirstLehrjahr.core.Core;
import de.deanomus.FirstLehrjahr.util.Data;

import java.util.Scanner;

public class ToMD5Hash {

    static Scanner scan = Core.scan;

    public static void start() {
        System.out.print("\nString: ");
        String string = Data.scan(scan);
        String hash = Data.md5hash(string);
        System.out.println("MD5Hash: " + hash);
    }

}

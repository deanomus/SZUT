package de.deanomus.GUI.converter;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Converter {

    public static String StringToMD5(String source) throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(source.getBytes());

        byte arr[] = md.digest();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            sb.append(Integer.toString((arr[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }

    public static String MD5toString(String source) {

        char loop;
        String toCheck = "";

        loop = 'A';
        while(true) {
            ++loop;
            System.out.println(loop);
//            for (loop = 'A'; loop <= 'Z'; ++loop) {
//                try {
//                    if (StringToMD5(String.valueOf(loop)).equals(source)) {
//                        return String.valueOf(loop);
//                    }
//                } catch (NoSuchAlgorithmException e) {
//                    e.printStackTrace();
//                }
//            }
        }



    }


}

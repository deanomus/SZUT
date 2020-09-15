package de.deanomus.FirstLehrjahr.core;

public class shit {


    public static void aufg() {

        double many = 2443.3244325;
        int v = 3;

        while(true) {

            if(many>0) {
                many = many/v;
                many -= v;
            }

            if(many<-0.1) {
                many += 100;
            }



            System.out.println(many);
            if(many == 0) return;
        }


    }

}

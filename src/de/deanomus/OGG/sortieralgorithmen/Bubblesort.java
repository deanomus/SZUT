package de.deanomus.OGG.sortieralgorithmen;

import de.deanomus.util.Data;

public class Bubblesort {

    private int durchgaenge;

    private int[]
            array;

    public Bubblesort(int[] array) {
        this.array = array;
        durchgaenge = 0;
    }

    public Bubblesort sort() {

        Boolean finished = false;
        int temp;
        int counter = 0;

        while(!finished) {

            for (int i = 0; i < array.length; i++) {
                durchgaenge++;
                counter++;

                if (i != array.length-1) {


                    if (array[i] > array[i+1]) {
                        System.out.println(counter + ", Change (1): " + Data.ArrayToString(array));
                        counter = 0;
                        temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                        System.out.println(counter + ", Change (2): " + Data.ArrayToString(array));
                    }

                }

                if(counter >= array.length+1) finished = true;
            }

        }

        return this;
    }

    public int[] getArray() {
        return this.array;
    }

    public int getDurchgaenge() {
        return this.durchgaenge;
    }


}

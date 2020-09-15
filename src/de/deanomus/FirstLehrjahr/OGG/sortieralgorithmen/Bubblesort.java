package de.deanomus.FirstLehrjahr.OGG.sortieralgorithmen;

import de.deanomus.FirstLehrjahr.util.Data;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Bubblesort {

    private int
            durchgaenge;

    private Boolean
            Debug = false;

    private Direction dir = Direction.downToUp;

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
                        Debug("[D: " + durchgaenge + ", C: " + counter + "] Change (1): " + Data.ArrayToString(array));
                        counter = 0;
                        temp = array[i];
                        array[i] = array[i+1];
                        array[i + 1] = temp;
                        Debug("[D: " + durchgaenge + ", C: " + counter + "] Change (2): " + Data.ArrayToString(array));
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


    public Bubblesort DebugMessages(Boolean DebugMessages) {
        this.Debug = DebugMessages;
        return this;
    }

    public Bubblesort setDirection(Direction direction) {
        this.dir = direction;
        return this;
    }

    private void Debug(String text) {
        Debug(text, Level.INFO);
    }

    private void Debug(String text, Level level) {
        if (!Debug) {
            return;
        }
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        logger.setLevel(level);
        logger.log(level, text + "\n");
    }


}

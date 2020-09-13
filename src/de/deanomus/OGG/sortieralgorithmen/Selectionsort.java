package de.deanomus.OGG.sortieralgorithmen;

import de.deanomus.util.exceptions.ArrayCannotBeNullException;

public class Selectionsort {

    private Direction
            dir = Direction.downToUp;
    private int
            temp = 0;
    private int[]
            array;
    private Boolean
            debug = false;

    public Selectionsort() {

    }

    // Sort Algo
    public Selectionsort sortArray() throws ArrayCannotBeNullException {
        if (this.array == null) {
            throw new ArrayCannotBeNullException("I need an array to sort");
        }


        return this;
    }


    // Set Variables // Builder // Setters

    public Selectionsort setArray(int[] array) {
        this.array = array;
        return this;
    }

    public Selectionsort setDirection(Direction direction) {
        this.dir = direction;
        return this;
    }

    // Getter

    public int[] getArray() {
        return this.array;
    }

    public Boolean getDebug() {
        return this.debug;
    }


}

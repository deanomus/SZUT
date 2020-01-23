package de.deanomus.OGG.fussballManager.fussballGUI;

public class Player extends Person {

    protected int
            staerke, motivation,
                score;

    public Player(String name, int age, int staerke, int motivation, int score) {
        super(name, age);
        this.staerke = staerke;
        this.motivation = motivation;
        this.score = score;
    }


    public String toString() {
        return
                "Name: " + this.name +
                ", Age: " + this.age +
                ", Staerke: " + this.staerke +
                ", Motivation: " + this.motivation +
                ", Score: " + this.score;
    }

    public int getStaerke() { //Staerke
        return staerke;
    }

    public int getMotivation() {
        return motivation;
    }
}

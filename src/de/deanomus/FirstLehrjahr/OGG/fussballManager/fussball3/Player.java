package de.deanomus.FirstLehrjahr.OGG.fussballManager.fussball3;

public class Player extends Person {

    protected int
                experience, motivation,
                score;

    public Player(String name, int age, int experience, int motivation, int score) {
        super(name, age);
        this.experience = experience;
        this.motivation = motivation;
        this.score = score;
    }


    public String toString() {
        return
                "Name: " + this.name +
                ", Age: " + this.age +
                ", Experience: " + this.experience +
                ", Motivation: " + this.motivation +
                ", Score: " + this.score;
    }
}

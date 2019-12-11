package de.deanomus.OGG.fussball2;

public class Player {

    protected String
                name;
    protected int
                age, experience, motivation,
                score;

    public Player(String name, int age, int experience, int motivation, int score) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.motivation = motivation;
        this.score = score;
    }


    public String toString() {
        return
                "Name: " + this.name +
                ", Age: " + this.age +
                ", Experience: " + this.experience +
                ", Motivation" + this.motivation +
                ", Score: " + this.score;
    }
}

package de.deanomus.OGG.fussball2;

public class Torwart extends Player {

    private int
                skill;

    public Torwart(String name, int age, int experience, int motivation, int skill) {
        super(name, age, experience, motivation, 0);
        this.skill = skill;
    }

    public String toString() {
        return
                "Name: " + this.name +
                        ", Age: " + this.age +
                        ", Experience: " + this.experience +
                        ", Motivation: " + this.motivation +
                        ", Score: " + this.score +
                        ", Skill: " + this.skill;
    }
}

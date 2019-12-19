package de.deanomus.OGG.fussballManager.fussball6;

public class Trainer extends Person {

    private int
                experience;

    public Trainer(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age + ", Experience: " + this.experience;
    }

    public int getExperience() {
        return experience;
    }
}

package de.deanomus.OGG.fussball3;

public class Trainer {

    private String
                name;
    private int
                age, experience;

    public Trainer(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age + ", Experience: " + this.experience;
    }
}

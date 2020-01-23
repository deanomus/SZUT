package de.deanomus.OGG.fussballManager.fussballGUI;

public class Torwart extends Player {

    private int
            reactionSkill;

    public Torwart(String name, int age, int experience, int motivation, int reactionSkill) {
        super(name, age, experience, motivation, 0);
        this.reactionSkill = reactionSkill;
    }

    public String toString() {
        return
                "Name: " + this.name +
                        ", Age: " + this.age +
                        ", Experience: " + this.staerke +
                        ", Motivation: " + this.motivation +
                        ", Score: " + this.score +
                        ", Skill: " + this.reactionSkill;
    }

    public int getReactionSkill() {
        return reactionSkill;
    }
}

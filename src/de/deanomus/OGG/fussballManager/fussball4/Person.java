package de.deanomus.OGG.fussballManager.fussball4;

public abstract class Person {

    protected String
                name;
    protected int
                age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

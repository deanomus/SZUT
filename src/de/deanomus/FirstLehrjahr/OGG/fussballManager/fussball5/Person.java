package de.deanomus.FirstLehrjahr.OGG.fussballManager.fussball5;

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

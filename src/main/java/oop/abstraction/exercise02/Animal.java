package oop.abstraction.exercise02;

abstract class Animal {
    private int age;
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    abstract void makeNoise();
}

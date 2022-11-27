package oop.abstraction.exercise01;

import java.util.Arrays;

public class AnimalsGenerator {
    public static void main(String[] args) {
        Animal cat = new Animal(3, "Cat Name", "Miauuu");
        Animal dog = new Animal(2, "Dog Name", "Guauuu");

        System.out.println(cat.getName());
        System.out.println(dog.getName());
    }
}

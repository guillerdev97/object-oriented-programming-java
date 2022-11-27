package oop.abstraction.exercise01;

public class Animal {
    private int age;
    private String name;
    private String noise;

    public Animal(int age, String name, String noise) {
        this.age = age;
        this.name = name;
        this.noise = noise;
    }

    public void makeNoise() {
        System.out.println(this.noise);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }
}

package ru.geekbrains.java2.dz.dz1.RoumyantsevPA;

public class Dog extends Animal {
    public Dog(String name, int age, double speed) {
        super("Dog", name, 1000, 10, 10, age,  speed);
    }

    public Dog(String name) {
        super("Dog", name, 1000, 10, 10);
    }
}

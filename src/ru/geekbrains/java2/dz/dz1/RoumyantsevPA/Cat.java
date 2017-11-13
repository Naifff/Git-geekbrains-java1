package ru.geekbrains.java2.dz.dz1.RoumyantsevPA;

public class Cat extends Animal {
    public Cat(String name, int age, double speed) {
        super("Cat", name, 500, 50, 0, age, speed);
    }

    public Cat(String name) {
        super("Cat", name, 500, 50, 0);
    }
}

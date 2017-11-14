package ru.geekbrains.java2.dz.dz1.RoumyantsevPA;

public class Cat extends Animal {
    public Cat(String name, int age, double speed) {
        super("Cat", name, 500, 50, 0, age, speed);
        double mod;
        if (age < 3) {
            mod = 1;
        } else if (age > 5) {
            mod = 0.7;
        } else {
            mod = 0.8;
        }
        this.maxRunDistance = (int) (mod * 1000);
        this.maxJumpHeight = (int) (mod * 10);
        this.maxSwimDistance = (int) (mod * 10);
        this.speed = speed * mod;


    }

    public Cat(String name) {
        super("Cat", name, 500, 50, 0);
    }
}

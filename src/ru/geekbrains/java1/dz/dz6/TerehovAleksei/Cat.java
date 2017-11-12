package ru.geekbrains.java1.dz.dz6.TerehovAleksei;

public class Cat extends Animal{
    public Cat() {
        super(200, 2, 0);
    }

    public Cat(int canRun, double canJump) {
        super(canRun, canJump, 0);
    }

    @Override
    void run(int distance) {
        if (isCanRun(distance)) System.out.println("Кот пробежал "+distance+" метров");
        else System.out.println("Кот не пробежал "+distance+" метров");

    }

    @Override
    void jump(double height) {
        if (isCanJump(height)) System.out.println("Кот прыгнул на "+height+" метров");
        else System.out.println("Кот не прыгнул на "+height+" метров");
    }

    @Override
    void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }
}

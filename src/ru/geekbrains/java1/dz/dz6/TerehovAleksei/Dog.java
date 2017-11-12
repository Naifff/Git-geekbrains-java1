package ru.geekbrains.java1.dz.dz6.TerehovAleksei;

public class Dog extends Animal{
    public Dog() {
        super(500, 0.5, 10);
    }

    public Dog(int canRun, double canJump, int canSwim) {
        super(canRun, canJump, canSwim);
    }

    @Override
    void run(int distance) {
        if (isCanRun(distance)) System.out.println("Собака пробежала " + distance + " метров");
        else System.out.println("Собака не пробежала " + distance + " метров");
    }

    @Override
    void jump(double height) {
        if (isCanJump(height)) System.out.println("Собака прыгнула на " + height + " метров");
        else System.out.println("Собака не прыгнула на " + height + " метров");
    }

    @Override
    void swim(int distance) {
        if (isCanSwim(distance)) System.out.println("Собака проплыла " + distance + " метров");
        else System.out.println("Собака не проплыла " + distance + " метров");
    }
}
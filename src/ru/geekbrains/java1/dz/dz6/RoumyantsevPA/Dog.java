package ru.geekbrains.java1.dz.dz6.RoumyantsevPA;

public class Dog extends Animal {


    @Override
    public void run(int a) {
        int i = 500;
        boolean b = a <= i;
        System.out.printf("Бег: " + "%b\t", b);

    }

    @Override
    public void swim(int a) {
        int i = 10;
        boolean b = a <= i;
        System.out.printf("Плыть: " + "%b\t", b);
    }

    @Override
    public void jump(double a) {
        double i = 0.5;
        boolean b = a <= i;
        System.out.printf("Прыг: " + "%b\t", b);
    }

    public Dog() {
        this.setType("Пес");
    }

    public Dog(String name, String color, int age) {
        super(name, color, age);
        this.setType("Пес");
    }
}

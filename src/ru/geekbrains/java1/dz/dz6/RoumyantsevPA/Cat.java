package ru.geekbrains.java1.dz.dz6.RoumyantsevPA;

public class Cat extends Animal {
    public Cat() {
        this.setType("Кот");

    }

    public Cat(String name, String color, int age) {
        super(name, color, age);
        this.setType("Кот");
    }

    @Override
    public void run(int a) {
        int i = 200;
        boolean b = a <= i;
        System.out.printf(a+" Бег: " + "%b\t", b);

    }

    @Override
    public void swim(int a) {
        int i = -1;
        boolean b = a <= i;
        System.out.printf(a+" Плыть: " + "%b\t", b);
    }

    @Override
    public void jump(double a) {
        double i = 2;
        boolean b = a <= i;
        System.out.printf(a+" Прыг: " + "%b\t", b);
    }
}

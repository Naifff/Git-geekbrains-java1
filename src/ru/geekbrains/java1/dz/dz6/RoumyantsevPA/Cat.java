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
        int i = (int) (200 * this.mod());
        boolean b = a <= i;
        System.out.printf(a + ":" + i + " Бег: " + "%b\t \t", b);

    }

    @Override
    public void swim(int a) {
        int i = -1;
        boolean b = a <= i;
        System.out.printf(a + ":" + i + " Плыть: " + "%b\t \t", b);
    }

    @Override
    public void jump(double a) {
        double i = 2 * this.mod();
        boolean b = a <= i;
        System.out.printf(a + ":" + i + " Прыг: " + "%b\t \t", b);
    }
}

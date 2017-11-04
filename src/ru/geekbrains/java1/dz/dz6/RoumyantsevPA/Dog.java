package ru.geekbrains.java1.dz.dz6.RoumyantsevPA;

public class Dog extends Animal {


    @Override
    public void run(int a) {
        int i = (int)(500*this.mod());
        boolean b = a <= i;
        System.out.printf(a+":"+i+" Бег: " + "%b\t \t", b);

    }

    @Override
    public void swim(int a) {
        int i = (int)(10*this.mod());
        boolean b = a <= i;
        System.out.printf(a+":"+i+" Плыть: " + "%b\t \t", b);
    }

    @Override
    public void jump(double a) {
        double i = 0.5*this.mod();
        boolean b = a <= i;
        System.out.printf(a+":"+i+" Прыг: " + "%b\t \t", b);
    }

    public Dog() {
        this.setType("Пес");
    }

    public Dog(String name, String color, int age) {
        super(name, color, age);
        this.setType("Пес");
    }

}

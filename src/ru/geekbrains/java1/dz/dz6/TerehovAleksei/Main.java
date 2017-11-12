package ru.geekbrains.java1.dz.dz6.TerehovAleksei;

public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog();
        dog1.run(300);
        dog1.jump(5);
        dog1.swim(1);

        System.out.println();

        Animal dog2 = new Dog(700, 1, 15);
        dog2.run(1000);
        dog2.jump(0.5);
        dog2.swim(10);

        System.out.println();

        Animal cat = new Cat(1000, 3);
        cat.run(800);
        cat.jump(4);
        cat.swim(3);
    }
}

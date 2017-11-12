package ru.geekbrains.java1.dz.dz6.OleynikovaTanya;

import java.util.Random;

public class Main {

    public static void main(String[] args){

        Animal[] animals = new Animal[5];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Dog();
        animals[4] = new Dog(700, 3, 3);

        for (Animal e : animals){
           e.run((float) (Math.random() * 300));
           e.swim((float) (Math.random() * 2));
           e.jump((float) (Math.random() * 10));
        }

        System.out.println("----------------------------");

        animals[0].setLimitHeightJump(1.5F);
        animals[1].setLimitLengthRun(400);
        animals[2].setLimitLengthSwim(4.2F);
        animals[3].setLimitLengthRun(600);

        for (Animal e : animals){
            e.run((float) (Math.random() * 400));
            e.swim((float) (Math.random() * 2));
            e.jump((float) (Math.random() * 10));
        }

        System.out.println("----------------------------");
        Dog dog = new Dog(500.2F, 3.5F, 4);
        dog.run((float) (Math.random() * 400));
        dog.swim((float) (Math.random() * 2));
        dog.jump((float) (Math.random() * 10));
    }

}

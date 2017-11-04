package ru.geekbrains.java1.dz.dz6.RoumyantsevPA;

import java.util.Random;

import static ru.geekbrains.java1.dz.dz6.RoumyantsevPA.Generator.generatorAnimal;

public class Mmain {
    public static void main(String[] args) {


        Animal animals[] = new Animal[10];
        Random rnd = new Random();
        for (int i = 0; i < animals.length; i++) {

            animals[i] = generatorAnimal(i % 2);

        }
        for (Animal animal : animals) {


            animal.printAnimal();
            animal.run(rnd.nextInt(500));
            animal.jump((((double) rnd.nextInt(200)) / 100));
            animal.swim(rnd.nextInt(10));
            System.out.println("\n");
        }
    }


}

package ru.geekbrains.java1.dz.dz6.RoumyantsevPA;

import java.util.Random;

public class Mmain {
    public static void main(String[] args) {


        Animal animals[] = new Animal[10];
        //int count = 0;
        String[] names = {"Яшка", "Яша", "Ярофей"};//, "Ягуар", "Яндекс", "Ярик", "Яков", "Якоб", "Ямб", "Яцек", "Яволь", "Януш", "Янчик", "Яго", "Ярис", "Яхонт", "Ярый", "Ярило", "Ярополк"};
        String[] colors = {"темно-красный", "кошениль", "алый"};//, "ализариновый", "малиновый", "кардинал", "маджента", "баклажан", "глициния", "лимонный", "тауп", "нефритовый", "аквамарин", "индиго", "берлинская лазурь", "гридеперлевый", "антрацитовый", "маренго"};
        int age;
        Random rnd = new Random();
        for (int i = 0; i < animals.length; i++) {
            if (i % 2 == 0) {
                animals[i] = new Cat(names[rnd.nextInt(names.length)], colors[rnd.nextInt(colors.length)], rnd.nextInt(60));
            } else {
                animals[i] = new Dog(names[rnd.nextInt(names.length)], colors[rnd.nextInt(colors.length)], rnd.nextInt(60));
            }
        }
        for (Animal animal : animals) {

            System.out.println();
            animal.printAnimal();
            animal.run(rnd.nextInt(1000));
            animal.jump(rnd.nextInt(4));
            animal.swim(rnd.nextInt(20));
        }
    }


}

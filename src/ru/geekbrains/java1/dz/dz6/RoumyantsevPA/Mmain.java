package ru.geekbrains.java1.dz.dz6.RoumyantsevPA;

import java.util.Random;

import static ru.geekbrains.java1.dz.dz6.RoumyantsevPA.Generator.gen;

public class Mmain {
    public static void main(String[] args) {


        Animal animals[] = new Animal[10];
        //int count = 0;
//        String[] names = {"Яшка", "Яша", "Ярофей", "Ягуар", "Яндекс", "Ярик", "Яков", "Якоб", "Ямб", "Яцек", "Яволь", "Януш", "Янчик", "Яго", "Ярис", "Яхонт", "Ярый", "Ярило", "Ярополк"};
//        String[] colors = {"темно-красный", "кошениль", "алый", "ализариновый", "малиновый", "кардинал", "маджента", "баклажан", "глициния", "лимонный", "тауп", "нефритовый", "аквамарин", "индиго", "берлинская лазурь", "гридеперлевый", "антрацитовый", "маренго"};
//        int age;
        Random rnd = new Random();
        for (int i = 0; i < animals.length; i++) {

                animals[i] = gen(i%2);

        }
        for (Animal animal : animals) {


            animal.printAnimal();
            animal.run(rnd.nextInt(500));
            animal.jump((((double)rnd.nextInt(200))/100));
            animal.swim(rnd.nextInt(20));
            System.out.println("\n");
        }
    }


}

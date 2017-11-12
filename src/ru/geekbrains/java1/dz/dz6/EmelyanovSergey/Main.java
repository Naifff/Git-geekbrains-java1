package ru.geekbrains.java1.dz.dz6.EmelyanovSergey;

import ru.geekbrains.java1.dz.dz6.EmelyanovSergey.Animals.Animal;
import ru.geekbrains.java1.dz.dz6.EmelyanovSergey.Animals.Cat;
import ru.geekbrains.java1.dz.dz6.EmelyanovSergey.Animals.Dog;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = new Animal[10];
        initDefaultAnimals(animals);
        System.out.print("Создано "+Animal.AnimalsCount+" животных\n================================\n");

        //побегаем
        animals[0].run(150);
        animals[1].run(250);
        animals[1].setMaxRun(250);
        animals[1].run(250);


        animals[8].run(150);
        animals[9].run(650);



        //upgrade
        System.out.println("\n\n\n================================");
        animals[9].run(650);
        animals[9].swim(20);
        animals[9].jump(2);
        System.out.println("upgrade ========================");
        System.out.println( animals[9].getInfo());
        System.out.println("upgrade "+animals[9].getName());
        animals[9].setMaxRun(700);
        animals[9].setMaxJump(10);
        animals[9].setMaxSwim(100);
        System.out.println( animals[9].getInfo());
        System.out.println("================================");
        animals[9].run(650);
        animals[9].swim(20);
        animals[9].jump(2);
        System.out.println("================================");





    }


    private static void initDefaultAnimals(Animal[] animals) {

        animals[0] = new Cat("Барсик");
        animals[1] = new Cat("Пушистый");
        animals[2] = new Cat("Котяра");
        animals[3] = new Cat("Котофей");
        animals[4] = new Cat("Кошак");
        animals[5] = new Dog("Шарик");
        animals[6] = new Dog("Полкан");
        animals[7] = new Dog("Трезор");
        animals[8] = new Dog("Фас");
        animals[9] = new Dog("Дружок");

    }
}


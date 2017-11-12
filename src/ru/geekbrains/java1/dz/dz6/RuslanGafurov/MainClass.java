package ru.geekbrains.java1.dz.dz6.RuslanGafurov;

public class MainClass {

    public static void main(String[] args) {
        Animal[] cats = new Animal[3];
        Animal[] dogs = new Animal[3];

        dogs[0] = new Dog("Бобик", 5);
        dogs[1] = new Dog("Тузик", 12);
        dogs[2] = new Dog("Мухтар", 2);
        cats[0] = new Cat("Барсик", 7);
        cats[1] = new Cat("Пушок", 4);
        cats[2] = new Cat("Рыжик", 8);

        for (Animal dog : dogs) {
            System.out.println();
            dog.printInfo();
            System.out.println("dog.run(150) = " + dog.run(150));
            System.out.println("dog.run(550) = " + dog.run(550));
            System.out.println("dog.jump(0.5f) = " + dog.jump(0.5f));
            System.out.println("dog.jump(1) = " + dog.jump(1));
            System.out.println("dog.swim(3) = " + dog.swim(3));
            System.out.println("dog.swim(10) = " + dog.swim(10));
        }

        for (Animal cat : cats) {
            System.out.println();
            cat.printInfo();
            System.out.println("cat.run(150) = " + cat.run(150));
            System.out.println("cat.run(350) = " + cat.run(350));
            System.out.println("cat.jump(2.0f) = " + cat.jump(2.0f));
            System.out.println("cat.jump(3.0f) = " + cat.jump(3.0f));
            System.out.println("cat.swim(3) = " + cat.swim(3));
        }


    }
}

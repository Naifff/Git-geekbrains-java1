package ru.geekbrains.java1.dz.dz7.DmitriiSimanushkin;

public class Main {

    //Задание 1 выполнено
    //Задание 2 выполнено
    //Задание 3 выполнено
    //Задание 4 выполнено
    //Задание 5 выполнено
    //Задание 6 выполнено

    public static void main(String[] args) {
        Cat cat[] = new Cat[5];
        cat[0] = new Cat("Barsik", 20, false);
        cat[1] = new Cat("Murzik", 20, false);
        cat[2] = new Cat("Tom",20, false);
        cat[3] = new Cat("Felix", 20, false);
        cat[4] = new Cat("Jerry", 25, false);

        Plate plate = new Plate(10);
        plate.addFood(90);

        for (Cat c : cat) {
            System.out.println("================");
            plate.info();
            c.eat(plate);
            c.catInfo();
            plate.info();
            System.out.println("================");
        }
    }
}
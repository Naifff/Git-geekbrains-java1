package ru.geekbrains.java1.dz.dz7.LebedevDmitry;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Barsik", 10), new Cat("Murzik", 14),
                new Cat("Zvezda", 7), new Cat("Pushistik", 11)};
        Plate plate = new Plate(40);
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
        plate.info();
    }
}

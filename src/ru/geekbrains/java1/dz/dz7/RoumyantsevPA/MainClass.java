package ru.geekbrains.java1.dz.dz7.RoumyantsevPA;

public class MainClass {
        public static void main(String[] args) {
            Cat cat = new Cat("Barsik", 5);
            Plate plate = new Plate(100);
            plate.info();
            cat.eat(plate);
            plate.info();
        }



}


package ru.geekbrains.java1.dz.dz7.KremnevKirill;

public class Main {
    public static void main ( String [] args ) {

        Cat[] cats = new Cat[]{new Cat("Барсик", 30), new Cat("Мурзик", 35), new Cat("Васька", 32), new Cat("Мото", 25)};
        Plate plate = new Plate ( 100);

        plate.info ();

        for (Cat c : cats){
            c.eat(plate);
        }

        for (Cat c : cats){
            c.info();
        }

        plate.info ();


        plate.setFood(100);
        plate.info();
    }
}

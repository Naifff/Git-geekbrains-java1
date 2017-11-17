package ru.geekbrains.java1.dz.dz7.beloborodovdenis;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(50);
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барсик", 10);
        cats[1] = new Cat("Сникерс", 13);
        cats[2] = new Cat("Марс", 15);
        cats[3] = new Cat("Баунти", 16);
        cats[4] = new Cat("Твикс", 1);


        for(Cat cat:cats){
            cat.eat(plate);
            plate.info();
            System.out.println();
        }

        for(Cat cat:cats){
            cat.eat(plate);
            plate.info();
            plate.increase(5);
            plate.info();
            System.out.println();
        }


    }
}

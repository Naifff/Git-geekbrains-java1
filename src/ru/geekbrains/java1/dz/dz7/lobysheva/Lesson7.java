package ru.geekbrains.java1.dz.dz7.lobysheva;

/*
 * Created by Oxana Lobysheva on 12/11/2017.
 */

public class Lesson7 {

    public static void main(String[] args) {

        System.out.println("\nKitchen\n");

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Kitty_1", 15);
        cats[1] = new Cat("Kitty_2", 25);
        cats[2] = new Cat("Kitty_3", 25);

        for (Cat cat : cats){
            cat.printAnimalInformation();
        }

        Plate plate = new Plate(50);
        plate.printPlateInfo();

        System.out.println("\nLets feed the cats:");
        feedCats(cats, plate);

        System.out.println("\nLets add a bit of food and feed the cats again:");
        plate.addFood(14);
        plate.printPlateInfo();
        feedCats(cats, plate);

        System.out.println("\nLets add a bit of food and feed the cats again:");
        plate.addFood(2);
        plate.printPlateInfo();
        feedCats(cats, plate);

        System.out.println("\nOne of the cat is hungry again");
        cats[1].setFullness(0);

        System.out.println("\nLets add a bit of food and feed the cats again:");
        plate.addFood(-4);
        plate.printPlateInfo();
        feedCats(cats, plate);

        System.out.println("\nLets add a bit of food and feed the cats again:");
        plate.addFood(25);
        plate.printPlateInfo();
        feedCats(cats, plate);
    }

    private static void feedCats(Cat[] cats, Plate plate){
        for (Cat cat : cats){
            cat.eat(plate);
            System.out.println("Is " + cat.getName() + " hungry? " + cat.isHungry());
        }
    }
}

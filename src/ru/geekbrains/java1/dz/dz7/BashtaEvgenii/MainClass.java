package ru.geekbrains.java1.dz.dz7.BashtaEvgenii;

import static ru.geekbrains.java1.dz.dz7.BashtaEvgenii.FabrikaAnimals.generatorAnimal;

public class MainClass {
    public static void main (String[] Arg ) {
        Cat[] cats = new Cat[3];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = generatorAnimal();
        }
        Plate plate = new Plate(cats.length*100);
        plate.info();
        int schetchik1=0;
        int schetchik2=0;
        do {
            for (Cat cat:cats){
                cat.eat(plate);
                if (cat.isFull()) {
                    schetchik1++;
                }
//                cat.info();
            }
            if (schetchik1<cats.length) {
                plate.increaseFood((cats.length-schetchik1)*50);
                schetchik2++;
                schetchik1=0;
            }
        }
        while (schetchik1<cats.length);
        System.out.println("\u001B[31m"+"Мы накормили всех котов, для этого нам пришлось докладывать" +
                " в тарелку еду "+ schetchik2+ " раз."+"\u001B[0m");
    }

}

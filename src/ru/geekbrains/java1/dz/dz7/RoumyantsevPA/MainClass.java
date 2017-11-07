package ru.geekbrains.java1.dz.dz7.RoumyantsevPA;

import java.util.Random;

import static ru.geekbrains.java1.dz.dz7.RoumyantsevPA.CatNames.catName;

public class MainClass {
        public static void main(String[] args) {
            Random rand=new Random();
            String[] catNames={"Оазис","Обаша","Обеликс","Оберег","Оберон","Обжора","Оби"};
            Cat[] cats=new Cat[50] ;
            Plate plate = new Plate(100);
            for (Cat cat:cats                 ) {
                cat =new Cat(catName(), rand.nextInt(10));
                System.out.println();
                System.out.println(cat.getName());
                plate.info();
                cat.eat(plate);
                plate.info();
            }
        }



}


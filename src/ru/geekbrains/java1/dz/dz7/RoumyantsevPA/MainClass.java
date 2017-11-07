package ru.geekbrains.java1.dz.dz7.RoumyantsevPA;

import java.util.Random;

import static ru.geekbrains.java1.dz.dz7.RoumyantsevPA.CatNames.catName;

public class MainClass {
        public static void main(String[] args) {
            Random rand=new Random();
             Cat[] cats=new Cat[50] ;
            Plate plate = new Plate(100);
            for (Cat cat:cats                 ) {
                cat =new Cat(catName(), rand.nextInt(10)+2);
                if (plate.getFood()<cat.getAppetite()){
                    //добавляем еды
                    System.out.println("\nДобавляем еды");
                    plate.decreaseFood( -50);
                }
                System.out.println();
                System.out.println(cat.getName()+":"+cat.isFull());
                plate.info();
                cat.eat(plate);
                plate.info();
                System.out.println(cat.getName()+":"+cat.isFull());
            }
        }



}


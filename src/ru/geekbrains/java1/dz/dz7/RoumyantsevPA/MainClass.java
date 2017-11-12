package ru.geekbrains.java1.dz.dz7.RoumyantsevPA;

import java.io.IOException;
import java.util.Random;

//import static ru.geekbrains.java1.dz.dz7.RoumyantsevPA.CatNames.catName;
//import static ru.geekbrains.java1.dz.dz7.RoumyantsevPA.CatNames.read;
import static ru.geekbrains.java1.dz.dz7.RoumyantsevPA.CatNames.readNames;
//import static ru.geekbrains.java1.dz.dz7.RoumyantsevPA.CatNamesWork.readNames;

public class MainClass {
        public static void main(String[] args) {
            long t1 =  System.currentTimeMillis();
            Random rand=new Random();
             Cat[] cats=new Cat[50] ;
            Plate plate = new Plate(100);
            for (Cat cat:cats                 ) {
                try { //читаем имя кота из файла, почему-то среда захотела ловить ексепшн
                    cat =new Cat(readNames(), rand.nextInt(10)+2);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (plate.getFood()<cat.getAppetite()){
                    //добавляем еды
                    System.out.println("\nДобавляем еды");
                    plate.decreaseFood( -50);
                }
                System.out.println();
               // System.out.println(cat.getName()+":"+cat.isFull());

                plate.info();
                cat.eat(plate);
                plate.info();
                System.out.println(cat.getName()+":"+cat.isFull()+"\t"+cat.getAppetite());
            }
            long t2 =  System.currentTimeMillis();
            System.out.println("Прошло времени: " + (t2 - t1)+"мс.");
        }



}


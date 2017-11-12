package ru.geekbrains.java1.dz.dz6.BashtaEvgenii;

import java.util.Scanner;

public class MainClass {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int rasstoyanieRun=getNumberFromScanner("Введите расстояние забега в метрах ",0,10000);
        int rasstoyanieSwim=getNumberFromScanner("Введите расстояние заплыва в метрах ",0,10000);
        int visota=getNumberFromScanner("Введите высоту прыжка в сантиметрах ",0,10000);
        Animal[] animals=new Animal[6];
        animals[0] = new Cat("Efiliant");
        animals[1] = new Cat();
        animals[2] = new Cat("Kot Ribolov");
        animals[3] = new Dog("Sharik");
        animals[4]=new Dog("Muhtar");
        animals[5]=new Dog();
        System.out.println();
        for (Animal a:animals){
            a.run(rasstoyanieRun);
            a.swim(rasstoyanieSwim);
            a.jump(visota);
            a.printInfo();
            System.out.println();
        }

    }

    public static int getNumberFromScanner(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x <= min || x >= max);
        return x;
    }
}
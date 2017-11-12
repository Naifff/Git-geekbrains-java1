package ru.geekbrains.java1.lesson7;

/**
 * Created by i on 12.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("lada", "red", 4);
        Car car2 = new Car("lada", "red", 4);

//        System.out.println("string3".equals("string3"));

        System.out.println(car1.equals(car1));
        System.out.println(car1.equals(null));
        System.out.println(car1.equals("text"));



        if (car1.equals(car2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(car1.equals(new Car()));
        Car car3 = new Car();
        System.out.println(car3.equals(car1));
    }
}

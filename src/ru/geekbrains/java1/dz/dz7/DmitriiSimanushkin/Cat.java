package ru.geekbrains.java1.dz.dz7.DmitriiSimanushkin;

public class Cat {
    private String name;
    private int appetite;
    public static boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    public void catInfo() {
        if (satiety) {
            System.out.println("Кот " + name + " сыт");
        } else {
            System.out.println("Кот " + name + " голоден");
        }
    }
}

package ru.geekbrains.java1.dz.dz7.LebedevDmitry;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        satiety = p.decreaseFood(appetite);
    }

    public void info() {
        if (satiety) {
            System.out.println("Cat " + name + " has eaten");
        } else {
            System.out.println("Cat " + name + " is hungry");
        }
    }
}

package ru.geekbrains.java1.dz.dz7.DmitriiSimanushkin;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (n <= food) {
            food -= n;
            Cat.satiety = true;
        } else {
            Cat.satiety = false;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood(int amount) {
        food += amount;
    }
}
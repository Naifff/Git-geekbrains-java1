package ru.geekbrains.java1.dz.dz7.KremnevKirill;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (getFood() > n) {
            food -= n;
            return true;
        }
        return false;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}

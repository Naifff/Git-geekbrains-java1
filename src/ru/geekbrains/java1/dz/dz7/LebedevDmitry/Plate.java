package ru.geekbrains.java1.dz.dz7.LebedevDmitry;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (n > food) {
            System.out.println("Too little food in the plate!");
            return false;
        }
        food -= n;
        return true;
    }

    public void addFood(int n) {
        food += n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}

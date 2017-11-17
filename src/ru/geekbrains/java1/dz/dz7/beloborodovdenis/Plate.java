package ru.geekbrains.java1.dz.dz7.beloborodovdenis;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("В тарелке осталось " + food);
    }

    public void decreaseFood(int n) {

        if ((food - n) >= 0) {
            food -= n;
        } else {
            System.out.println("В тарелке нет столько еды");
        }

    }

    public void increase(int n) {
        food += n;
        System.out.println("Добавка " + n);
    }

    public int getFood() {
        return food;
    }
}

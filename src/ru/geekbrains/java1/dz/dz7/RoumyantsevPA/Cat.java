package ru.geekbrains.java1.dz.dz7.RoumyantsevPA;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full =false;
    }
    public void eat(Plate p) {
        if (p.getFood()>=this.appetite&&this.full==false) {
            p.decreaseFood(appetite);
            this.full = true;
        }
    }

    public String getName() {
        return name;
    }
}

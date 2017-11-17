package ru.geekbrains.java1.dz.dz7.KremnevKirill;

public class Cat {
    private String name;
    private int appetite;
    private boolean fill = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        fill = p.decreaseFood(appetite);
    }

    public void info() {
        System.out.println("Кот " + name + (fill ? " сыт!" : " голоден. =("));
    }
}

package ru.geekbrains.java1.dz.dz7.beloborodovdenis;

public class Cat {
    private String name;
    private int appetite;
    private boolean fed = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            fed = true;
            System.out.println("Кот " + name + " сытый");
        } else {
            fed = false;
            System.out.println("Кот "+ name+ " голодный");
        }
        plate.decreaseFood(appetite);
    }

}

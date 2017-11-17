package ru.geekbrains.java1.dz.dz7.lobysheva;

/*
 * Created by Oxana Lobysheva on 12/11/2017.
 */

public class Cat {

    private String name;
    private int appetite;
    private int fullness;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.fullness = 0;
    }

    public void printAnimalInformation(){
        System.out.println("");
        System.out.println("Its name is " + name);
        System.out.println("Its appetite is " + appetite);
        System.out.println();
    }

    public void eat(Plate plate){
        if (fullness < appetite) {
            if (plate.getFood() >= appetite) {
                plate.setFood(plate.getFood() - appetite);
                fullness += appetite;
            } else {
                System.out.println(name + " can't eat. It needs more food");
            }
        } else {
            System.out.println(name+ " don't eat. It's not hungry");
        }
    }

    public String getName(){
        return name;
    }

    public boolean isHungry(){
        if (fullness >= appetite) return false;
        return true;
    }

    public void setFullness(int fullness){
        this.fullness = fullness;
    }

}

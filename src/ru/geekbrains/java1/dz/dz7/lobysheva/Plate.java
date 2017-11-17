package ru.geekbrains.java1.dz.dz7.lobysheva;

/*
 * Created by Oxana Lobysheva on 12/11/2017.
 */

public class Plate {

    private int food;

    public Plate(int food){
        if (food < 0) {
            food = 0;
        }
        this.food = food;
    }

    public void printPlateInfo(){
        System.out.println("Plate = " + food);
    }

    public int getFood(){
        return food;
    }

    public void setFood(int restFood){
        food = restFood;
    }

    public void addFood(int addedFood){
        if (addedFood > 0) {
            food += addedFood;
        } else {
            System.out.println("You can't take food or put nothing");
        }
    }
}

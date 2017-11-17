package ru.geekbrains.java1.dz.dz7.RuslanGafurov;

public class Plate {
    private int food, maxfood ;
    public Plate ( int food ) {
        maxfood = food;
        addFood();
    }
    public boolean decreaseFood ( int n ) {
        if(food>=n) {
            food -= n;
            return true;
        }
        return false;
    }
    public void info () {
        System . out . println ( "Тарелка: " + food +"/"+maxfood);
    }
    public void addFood(){
        food = maxfood;
    }
    public int getFood(){
        return food;
    }
}

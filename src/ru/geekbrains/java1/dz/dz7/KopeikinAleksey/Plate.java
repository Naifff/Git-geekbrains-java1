package ru.geekbrains.java1.dz.dz7.KopeikinAleksey;

public class Plate {
    private int food;

    // private int Math.abs(food);
    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
//        if(food<0){System.out.println("empty!");
//        }else
        if (food >= n) {
            food -= n;
            return true;
        }
        return false;
    }

    public void info() {
        //System . out . println ( "plate: " + food );
        if (food == 0) {
            System.out.println("Тарелка пуста!");
        } else if (food < 0) {
            System.out.println("Некорректный ввод количеcтва пищи!");
        } else {
            System.out.println("plate: " + food);
        }
    }

    public void addFood(int f) {
        if (f > 0) {
            food = food + f;
            System.out.println("В тарелке " + food + " еды.");
        } else {
            System.out.println("");
            System.out.println("Некорректный ввод количеcтва пищи!");
        }

    }

}
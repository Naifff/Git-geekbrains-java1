package ru.geekbrains.java1.dz.dz7.AndreyMelchuk;

//import com.sun.org.apache.xpath.internal.operations.Bool;

public class Plate {
    private int food ;
    private String name ;
    public Plate ( String name, int food ) {
        this.food = food;
        this.name = name;
    }
    public int decreaseFood ( int appetite ) {

        if(appetite==0) return 0;

        if(food>=appetite) {
            food -= appetite;
            return  appetite = 0;
        }

        return appetite;
    }

    public void info () {
        System.out.println ( "\n"+ name+" содержит " + food +" еды.");
    }

    public String stringinfo () {
        return name +"("+ food +")";
    }


    public void add (int value) { //add food
        food += value;
        System.out.println ( "\n" + name+" содержит " + food +  " еды после пополнения."  );
    }

    public int getFood() {
        return food;
    }

    public String getName() {
        return name;
    }
}

package ru.geekbrains.java2.dz.dz1.RoumyantsevPA;

public class Dog extends Animal {
    public Dog(String name, int age, double speed) {
        super("Dog", name, 1000, 10, 10, age,  speed);
        double mod;
        if (age<3){mod=1;}else if(age>4){mod=0.7;}else{mod=0.8;}
        this.maxRunDistance=(int)(mod*1000);
        this.maxJumpHeight=(int)(mod*10);
        this.maxSwimDistance=(int)(mod*10);
        this.speed = speed*mod;

    }

    public Dog(String name) {
        super("Dog", name, 1000, 10, 10);
    }
}

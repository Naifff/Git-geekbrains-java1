package ru.geekbrains.java2.dz.dz1.RoumyantsevPA;

public class Human implements Competitor {
    protected String name;
    protected boolean active=true;
    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected int maxSwimDistance;
    protected int age;
    protected  double speed;


    public String getName() {
        return name;
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }

    public Human(String name, int age, double speed) {
        this.name = name;
        this.active = true;
        this.maxRunDistance = 5000;
        this.maxJumpHeight = 100;
        this.maxSwimDistance = 2000;
        this.age =age;
        this.speed =speed;

    }

    public Human(String name) {
        this.name = name;
        this.active = true;
        this.maxRunDistance = 5000;
        this.maxJumpHeight = 100;
        this.maxSwimDistance = 2000;
        //this.age =age;
       // this.speed =speed;

    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " "+distance+"\\"+maxRunDistance+" Cross - OK");
        } else {
            System.out.println(name + " "+distance+"\\"+maxRunDistance+" Cross - FAILED");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " "+height+"\\"+maxJumpHeight+" Jump - OK");
        } else {
            System.out.println(name + " "+height+"\\"+maxJumpHeight+" Jump - FAILED");
            active = false;
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(name + " "+distance+"\\"+maxSwimDistance+" Swim - OK");
        } else {
            System.out.println(name + " "+distance+"\\"+maxSwimDistance+" Swim - FAILED");
            active = false;
        }
    }
}

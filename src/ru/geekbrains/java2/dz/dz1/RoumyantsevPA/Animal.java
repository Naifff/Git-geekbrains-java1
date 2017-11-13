package ru.geekbrains.java2.dz.dz1.RoumyantsevPA;

public abstract class Animal implements Competitor {
    protected String type;
    protected String name;
    protected boolean onDistance=true;
    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected int maxSwimDistance;
    protected int age;
    protected double speed;

    public String getName() {
        return name;
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance, int age,double speed) {
        this.type = type;
        this.name = name;
        this.onDistance = true;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.age=age;
        this.speed=speed;

    }

    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.onDistance = true;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
      //  this.age=age;
      //  this.speed=speed;

    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(type + " " + name + " "+distance+"\\"+maxRunDistance+" Cross - OK");
        } else {
            System.out.println(type + " " + name + " "+distance+"\\"+maxRunDistance+" Cross - FAILED");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name +" "+height+"\\"+maxJumpHeight+ " Jump - OK");
        } else {
            System.out.println(type + " " + name +" "+height+"\\"+maxJumpHeight+ " Jump - FAILED");
            onDistance = false;
        }
    }

    @Override
    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(type + " " + name + " Swim - ERROR");
            onDistance = false;
            return;
        }
        if (distance <= maxSwimDistance) {
            System.out.println(type + " " + name +" "+distance+"\\"+maxSwimDistance+ " Swim - OK");
        } else {
            System.out.println(type + " " + name +" "+distance+"\\"+maxSwimDistance+ " Swim - FAILED");
            onDistance = false;
        }
    }
}

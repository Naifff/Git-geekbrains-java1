package ru.geekbrains.java1.dz.dz6.TerehovAleksei;

public abstract class Animal {
    private int canRun;
    private double canJump;
    private int canSwim;

    public Animal(int canRun, double canJump, int canSwim) {
        this.canRun = canRun;
        this.canJump = canJump;
        this.canSwim = canSwim;
    }

    abstract void run(int distance);
    abstract void jump(double height);
    abstract void swim(int distance);

    boolean isCanRun(int distance){
        return distance <= canRun;
    }

    boolean isCanJump(double height){
        return height <= canJump;
    }

    boolean isCanSwim (int distance){
        return distance <= canSwim;
    }
}

package ru.geekbrains.java1.dz.dz6.RuslanGafurov;

public class Animal {
    private String name;
    private int age;
    private int runmax, swimmax;
    private float jumpmax;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean run(int dist) {
        return (dist <= runmax);
    }

    public boolean jump(float dist) {
        return (dist <= jumpmax);
    }

    public boolean swim(int dist) {
        return (dist <= swimmax);
    }

    public int getRunmax() {
        return runmax;
    }

    public int getSwimmax() {
        return swimmax;
    }

    public float getJumpmax() {
        return jumpmax;
    }

    public void setRunmax(int runmax) {
        this.runmax = runmax;
    }

    public void setSwimmax(int swimmax) {
        this.swimmax = swimmax;
    }

    public void setJumpmax(float jumpmax) {
        this.jumpmax = jumpmax;
    }

    public void printInfo() {
        System.out.println();
    }
}

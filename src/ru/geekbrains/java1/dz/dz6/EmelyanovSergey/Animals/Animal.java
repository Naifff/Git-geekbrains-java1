package ru.geekbrains.java1.dz.dz6.EmelyanovSergey.Animals;

public class Animal {

    public static int AnimalsCount; //Счетчик животных

    protected String name;

    //поскольку все животные имеют одинаковый набор параметров, выносим параметры в родительский класс
    protected float maxRun;
    protected float maxJump;
    protected float maxSwim;

    public Animal(String name) {
        this.name = name;
        AnimalsCount++;
    }

    public Animal(String name, float maxRun, float maxJump, float maxSwim) {
        this(name);
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.maxSwim = maxSwim;
    }

    public void run(float distance) {
        System.out.print("run:"+((distance>=0)&&(distance<=maxRun)));
    }

    public void swim(float distance) {
        System.out.print("swim:"+((distance>=0)&&(distance<=maxSwim)));
    }

    public void jump(float distance) {
        System.out.print("jump:"+((distance>=0)&&(distance<=maxJump)));
    }

    public String getInfo() {
        return  "могуБежать:"+maxRun+" "+
                "могуПлыть:"+maxSwim+" "+
                "могуПрыгать:"+maxJump+" ";
    }


    //геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(float maxRun) {
        this.maxRun = maxRun;
    }

    public float getMaxJump() {
        return maxJump;
    }

    public void setMaxJump(float maxJump) {
        this.maxJump = maxJump;
    }

    public float getMaxSwim() {
        return maxSwim;
    }

    public void setMaxSwim(float maxSwim) {
        this.maxSwim = maxSwim;
    }
}

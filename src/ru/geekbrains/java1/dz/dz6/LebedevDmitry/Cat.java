package ru.geekbrains.java1.dz.dz6.LebedevDmitry;

public class Cat extends Animal {

    public Cat(int number) {
        super(150+Math.random()*50,
                1.5+Math.random(),
                0,
                number);
    }

    @Override
    public boolean run(double length) {
        return action(length,"cat","run",getRunLimit());
    }

    @Override
    public boolean swim(double length) {
        return action(length,"cat","swim",getSwimLimit());
    }

    @Override
    public boolean jump(double height) {
        return action(height,"cat","jump",getJumpLimit());
    }
}

package ru.geekbrains.java1.dz.dz6.LebedevDmitry;

public class Dog extends Animal {

    public Dog(int number) {
        super(400 + Math.random() * 200,
                0.3 + Math.random() * 0.5,
                5 + Math.random() * 10,
                number);
    }

    @Override
    public boolean run(double length) {
        return action(length, "dog", "run", getRunLimit());
    }

    @Override
    public boolean swim(double length) {
        return action(length, "dog", "swim", getSwimLimit());
    }

    @Override
    public boolean jump(double height) {
        return action(height, "dog", "jump", getJumpLimit());
    }
}

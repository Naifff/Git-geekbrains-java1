package ru.geekbrains.java2.lesson1;

public class Cross extends Obstacle {
    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor c) {
        c.run(length);
    }
}

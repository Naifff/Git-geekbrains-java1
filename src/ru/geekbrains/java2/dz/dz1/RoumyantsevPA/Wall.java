package ru.geekbrains.java2.dz.dz1.RoumyantsevPA;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor c) {
        c.jump(height);
    }
}

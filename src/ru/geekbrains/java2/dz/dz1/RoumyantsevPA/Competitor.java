package ru.geekbrains.java2.dz.dz1.RoumyantsevPA;

public interface Competitor {
    String getName();

    void run(int distance);

    void jump(int height);

    void swim(int distance);

    boolean isOnDistance();
    //double time;
}

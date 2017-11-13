package ru.geekbrains.java2.lesson1;

public interface Competitor {
    String getName();
    void run(int distance);
    void jump(int height);
    void swim(int distance);
    boolean isOnDistance();
}

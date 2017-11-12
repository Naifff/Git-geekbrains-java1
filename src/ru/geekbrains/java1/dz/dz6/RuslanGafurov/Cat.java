package ru.geekbrains.java1.dz.dz6.RuslanGafurov;

public class Cat extends Animal {

    private static final String ANIMAL_TYPE = "Кот";
    private static final int MAX_RUN = 300;
    private static final int MIN_RUN = 150;
    private static final float MAX_JUMP = 3.0f;
    private static final float MIN_JUMP = 2.0f;

    public Cat(String name, int age) {
        super(name, age);
        setJumpmax(MIN_JUMP + (float) (Math.random() * (MAX_JUMP - MIN_JUMP)));
        setRunmax(MIN_RUN + (int) (Math.random() * (MAX_RUN - MIN_RUN)));
        setSwimmax(0);
    }

    @Override
    public boolean swim(int dist) {
        System.out.println("Коты не плавают");
        return false;
    }

    @Override
    public void printInfo() {
        System.out.println(ANIMAL_TYPE + " по имени " + this.getName());
        System.out.println("Бегает на расстояние: " + this.getRunmax());
        System.out.println("Прыгает на расстояние: " + this.getJumpmax());
        System.out.println("Плавает на расстояние: " + this.getSwimmax());
    }
}

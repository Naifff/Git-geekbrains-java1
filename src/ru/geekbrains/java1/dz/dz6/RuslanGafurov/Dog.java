package ru.geekbrains.java1.dz.dz6.RuslanGafurov;

public class Dog extends Animal {

    private static final String ANIMAL_TYPE = "Собака";
    private static final int MAX_RUN = 600;
    private static final int MIN_RUN = 400;
    private static final float MAX_JUMP = 1.5f;
    private static final float MIN_JUMP = 0.3f;
    private static final int MAX_SWIM = 15;
    private static final int MIN_SWIM = 5;

    public Dog(String name, int age) {
        super(name, age);
        setJumpmax(MIN_JUMP+(float)(Math.random()*(MAX_JUMP-MIN_JUMP)));
        setRunmax(MIN_RUN+(int)(Math.random()*(MAX_RUN-MIN_RUN)));
        setSwimmax(MIN_SWIM+(int)(Math.random()*(MAX_SWIM-MIN_SWIM)));

    }

    @Override
    public void printInfo(){
        System.out.println(ANIMAL_TYPE + " по имени "+ this.getName());
        System.out.println("Возраст: "+ this.getAge());
        System.out.println("Бегает на расстояние: "+this.getRunmax());
        System.out.println("Прыгает на расстояние: "+this.getJumpmax());
        System.out.println("Плавает на расстояние: "+this.getSwimmax());
    }

}


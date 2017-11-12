package ru.geekbrains.java1.dz.dz6.LebedevDmitry;

public abstract class Animal {

    private double runLimit;     // ограничение расстояния для бега
    private double jumpLimit;    // ограничение высоты прыжка
    private double swimLimit;    // ограничение раастояния для плавания
    private int number;          // номер животного

    public Animal(double runLimit, double jumpLimit, double swimLimit, int number) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.swimLimit = swimLimit;
        this.number = number;
    }

    double getRunLimit() {
        return runLimit;
    }

    double getJumpLimit() {
        return jumpLimit;
    }

    double getSwimLimit() {
        return swimLimit;
    }

    public abstract boolean run(double length);
    public abstract boolean swim(double length);
    public abstract boolean jump(double height);
    boolean action(double length, String animal, String action, double limit){
        if(limit==0){
            System.out.println(animal+number+" not able "+action);
        }
        if(length<=limit){
            System.out.println(animal+number + " can "+action+" "+length+" meters");
            return true;
        }else {
            System.out.println(animal+number + " can't "+action+" more than "
                    +String.format("%.1f", limit)+" meters");
            return false;
        }
    }
}

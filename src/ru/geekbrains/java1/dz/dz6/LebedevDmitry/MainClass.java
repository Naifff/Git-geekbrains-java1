package ru.geekbrains.java1.dz.dz6.LebedevDmitry;

public class MainClass {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Dog(1);
        animals[1] = new Dog(2);
        animals[2] = new Dog(3);
        animals[3] = new Cat(1);
        animals[4] = new Cat(2);
        animals[5] = new Cat(3);

        for(Animal animal:animals){
            animal.run(200);
            animal.run(500);
            animal.jump(0.5);
            animal.jump(2);
            animal.swim(10);
        }
    }
}

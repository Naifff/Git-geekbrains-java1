package ru.geekbrains.java1.dz.dz6.OleynikovaTanya;

// Создать классы Собака и Кот с наследованием от класса Животное.
public class Cat extends Animal {

    // У каждого животного есть ограничения на действия (бег: 200 м.; прыжок: 2 м.; плавание: кот не умеет плавать).
    public Cat() {
        super(200, 2, 0);
    }

    public Cat(float limitLengthRun, float limitLengthSwim, float limitHeightJump) {
        super(limitLengthRun, limitLengthSwim, limitHeightJump);
    }

    @Override
    public void run(float lengthRun) {
        if (lengthRun <= limitLengthRun){
            System.out.printf("Кот пробежал %.2f м (ограничение %.2f м)%n", lengthRun, limitLengthRun);
        } else {
            System.out.printf("Кот не смог пробежать %.2f м (ограничение %.2f м)%n", lengthRun, limitLengthRun);
        }
    }

    @Override
    public void swim(float lengthSwim){
        if (lengthSwim <= limitLengthSwim){
            System.out.printf("Кот переплыл препятствие длиной %.2f м (ограничение %.2f м)%n", lengthSwim, limitLengthSwim);
        } else {
            System.out.printf("Кот не смог переплыть препятствие длиной %.2f м (ограничение %.2f м)%n", lengthSwim, limitLengthSwim);
        }
    }

    @Override
    public void jump(float heightJump){
        if (heightJump <= limitHeightJump){
            System.out.printf("Кот перепрыгнул препятствие высотой %.2f м (ограничение %.2f м)%n", heightJump, limitHeightJump);
        } else {
            System.out.printf("Кот не смог перепрыгнуть препятствие высотой %.2f м (ограничение %.2f м)%n", heightJump, limitHeightJump);
        }
    }

}

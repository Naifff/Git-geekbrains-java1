package ru.geekbrains.java1.dz.dz6.OleynikovaTanya;

// Создать классы Собака и Кот с наследованием от класса Животное.
public class Dog extends Animal {

    // У каждого животного есть ограничения на действия (бег: 500 м.; прыжок: 0.5 м.; плавание: 10 м.)
    public Dog() {
        super(500, 0.5F, 10);
    }

    public Dog(float limitLengthRun, float limitLengthSwim, float limitHeightJump) {
        super(limitLengthRun, limitLengthSwim, limitHeightJump);
    }

    @Override
    public void run(float lengthRun) {
        if (lengthRun <= limitLengthRun){
            System.out.printf("Собака пробежала %.2f м (ограничение %.2f м)%n", lengthRun, limitLengthRun);
        } else {
            System.out.printf("Собака не смога пробежать %.2f м (ограничение %.2f м)%n", lengthRun, limitLengthRun);
        }
    }

    @Override
    public void swim(float lengthSwim){
        if (lengthSwim <= limitLengthSwim){
            System.out.printf("Собака переплыла препятствие длиной %.2f м (ограничение %.2f м)%n", lengthSwim, limitLengthSwim);
        } else {
            System.out.printf("Собака не смогла переплыть препятствие длиной %.2f м (ограничение %.2f м)%n", lengthSwim, limitLengthSwim);
        }
    }

    @Override
    public void jump(float heightJump){
        if (heightJump <= limitHeightJump){
            System.out.printf("Собака перепрыгнула препятствие высотой %.2f м (ограничение %.2f м)%n", heightJump, limitHeightJump);
        } else {
            System.out.printf("Собака не смога перепрыгнуть препятствие высотой %.2f м (ограничение %.2f м)%n", heightJump, limitHeightJump);
        }
    }
}

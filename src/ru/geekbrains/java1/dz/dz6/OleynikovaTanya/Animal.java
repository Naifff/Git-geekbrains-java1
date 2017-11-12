package ru.geekbrains.java1.dz.dz6.OleynikovaTanya;

public abstract class  Animal {

    // У каждого животного есть ограничения на действия бег, прыжок, плавание
    protected float limitLengthRun;
    protected float limitLengthSwim;
    protected float limitHeightJump;

    public Animal(float limitLengthRun, float limitLengthSwim, float limitHeightJump) {
        this.limitLengthRun = limitLengthRun;
        this.limitLengthSwim = limitLengthSwim;
        this.limitHeightJump = limitHeightJump;
    }

    // Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
    // В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).

    public abstract void run(float limitLengthRun);

    public abstract void swim(float lengthSwim);

    public abstract void jump(float heightJump);

    // * Добавить животным разброс в ограничениях.
    // То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м
    public void setLimitLengthRun(float limitLengthRun) {
        this.limitLengthRun = limitLengthRun;
    }

    public void setLimitLengthSwim(float limitLengthSwim) {
        this.limitLengthSwim = limitLengthSwim;
    }

    public void setLimitHeightJump(float limitHeightJump) {
        this.limitHeightJump = limitHeightJump;
    }

    public void setLimit(float limitLengthRun, float limitLengthSwim, float limitHeightJump) {
        this.limitLengthRun = limitLengthRun;
        this.limitLengthSwim = limitLengthSwim;
        this.limitHeightJump = limitHeightJump;
    }
}

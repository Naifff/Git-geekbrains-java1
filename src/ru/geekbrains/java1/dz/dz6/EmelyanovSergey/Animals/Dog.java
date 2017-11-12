package ru.geekbrains.java1.dz.dz6.EmelyanovSergey.Animals;


public class Dog extends Animal{

    //значения по умолчанию класса Cat
    private final float MAX_RUN=500;
    private final float MAX_JUMP=0.5f;
    private final float MAX_SWIM=10;
    private final String ANIMAL_TYPE = "dog";

    public Dog(String name) {
        super(name);
        maxRun=MAX_RUN;
        maxSwim=MAX_SWIM;
        maxJump=MAX_JUMP;
    }

    public Dog(String name, float maxRun, float maxJump, float maxSwim) {
        super(name, maxRun, maxJump, maxSwim);
    }

    @Override
    public  void run(float distance) {
        super.run(distance); //действие в родительском классе. т.к. все параметры однотипны для всех подклассов
        System.out.printf(" [%1$s:%2$s могу:%3$.1f задача:%4$.1f]\n",ANIMAL_TYPE,name,maxRun,distance);
    }

    @Override
    public void swim(float distance) {
        super.swim(distance); //действие в родительском классе. т.к. все параметры однотипны для всех подклассов
        System.out.printf(" [%1$s:%2$s могу:%3$.1f задача:%4$.1f]\n",ANIMAL_TYPE,name,maxSwim,distance);
    }

    @Override
    public  void jump(float distance) {
        super.jump(distance); //действие в родительском классе. т.к. все параметры однотипны для всех подклассов
        System.out.printf(" [%1$s:%2$s могу:%3$.1f задача:%4$.1f]\n",ANIMAL_TYPE,name,maxJump,distance);
    }

    @Override
    public String getInfo() {
        return ANIMAL_TYPE+":"+name+" "+super.getInfo();
    }

}

package ru.geekbrains.java1.dz.dz6.BashtaEvgenii;

public class Dog extends Animal{
    int maxRun=(int)(Math.random()*200)+400;
    int maxSwim=(int)(Math.random()*50)+10;
    int maxJump=(int)(Math.random()*100)+20;

    public Dog (String name) {
        super(name);
        System.out.println("У нас есть пес по кличке "+name);
    }
    public Dog () {
        System.out.println("Мы нашли пса на улице и еще не назвали, пока он "+name);
    }
    public void run (int rasstoyanie){
        if (rasstoyanie<=maxRun){
            System.out.print("true: ");
            System.out.println("Пес "+name+ " пробежал "+rasstoyanie+" м.");
        }
        else {
            System.out.print("false: ");
            System.out.println("Пес " + name + " не смог пробежать растояние " + rasstoyanie + " м. и виновато вернулся к хозяину.");
        }
    }
    public void swim (int rasstoyanie){
        if (rasstoyanie<=maxSwim){
            System.out.print("true: ");

            System.out.println("Пес "+name+ " проплыл "+rasstoyanie+" м.");
        }
        else {
            System.out.print("false: ");
            System.out.println("Пес "+name+ " не смог проплыть расстояние "+rasstoyanie+" м. и поплыл обратно.");
        }
    }
    public void jump (int visota){
        if (visota<=maxJump){
            System.out.print("true: ");
            System.out.println("Пес "+name+ " прыгнул на высоту "+visota+ " см.");
        }
        else {
            System.out.print("false: ");
            System.out.println("Пес " + name + " не смог запрыгнуть на высоту " + visota + " см. и стал бегать рядом и лаять.");
        }
    }
    public void printInfo () {
        System.out.println (name+" выносливость бег:"+ maxRun+ " выносливость плавание:"+maxSwim + " прыгучесть:"+maxJump);
    }
}

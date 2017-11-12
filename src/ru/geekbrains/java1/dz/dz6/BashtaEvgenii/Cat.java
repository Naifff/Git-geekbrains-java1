package ru.geekbrains.java1.dz.dz6.BashtaEvgenii;

public class Cat extends Animal{
    int maxRun=(int)(Math.random()*100)+150;
    int maxSwim=0;
    int maxJump=(int)(Math.random()*100)+150;

    public Cat (String name) {
        super(name);
        System.out.println("У нас есть кот по кличке "+name);
    }
    public Cat () {
        System.out.println("Мы нашли кота на улице и еще не назвали, пока он "+name);
    }
    public void run (int rasstoyanie){
        if (rasstoyanie<=maxRun){
            System.out.print("true: ");
            System.out.println("Кот "+name+ " пробежал "+rasstoyanie+" м.");
        }
        else {
            System.out.print("false: ");
            System.out.println("Кот " + name + " не смог пробежать расстояние " + rasstoyanie + " м. и лег спать.");
        }
    }
    public void swim (int rasstoyanie){
        if (rasstoyanie<=maxSwim){
            System.out.print("true: ");
            System.out.println("Кот "+name+ " проплыл "+rasstoyanie+" см.");
        }
        else {
            System.out.print("false: ");
            System.out.println("Кот " + name + " боится воды и в ужасе убежал.");
        }
    }
    public void jump (int visota){
        if (visota<=maxJump){
            System.out.print("true: ");
            System.out.println("Кот "+name+ " прыгнул на высоту "+visota+ " см.");
        }
        else {
            System.out.print("false: ");
            System.out.println("Кот " + name + " не смог запрыгнуть на высоту " + visota + " см., сел рядом и стал орать.");
        }
    }
    public void printInfo () {
        System.out.println (name+" выносливость бег:"+ maxRun+ " выносливость плавание:"+maxSwim + " прыгучесть:"+maxJump);
    }
}

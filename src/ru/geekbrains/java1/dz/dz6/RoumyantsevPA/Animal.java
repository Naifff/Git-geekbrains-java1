package ru.geekbrains.java1.dz.dz6.RoumyantsevPA;

public abstract class Animal {
    private String name;
    private String color;
    private int age;
    private String type;
    public static int counAnimal = 0;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        counAnimal++;
    }

    public abstract void run(int i);

    public abstract void swim(int i);

    public abstract void jump(double i);

    public Animal() {
    }

//    public void printAnimal() {
//        System.out.println(type + " Имя: " + name + " цвет " + color + " возраст " + age);

//    }

    public void setType(String type) {
        this.type = type;
    }

    public void printAnimal(){
        System.out.println(this.type+" "+this.name+" "+this.color+" "+this.age);

    }

    public double mod(){
        if (this.age<=3){return 1;}
        else if(this.age<=5){return 0.8;}
        else if(this.age<=10){return 0.3;}
        else return 0.1;
    }

}

package ru.geekbrains.java1.dz.dz6.BashtaEvgenii;

public class Animal {
    protected String name;
    protected void run (int rasstoyanie){}
    protected void swim (int rasstoyanie){}
    protected void jump (int visota){}

    public Animal (String name) {
        this.name=name;
    }
    public Animal () {this.name="Безымянный";}
    public void printInfo (){}

}

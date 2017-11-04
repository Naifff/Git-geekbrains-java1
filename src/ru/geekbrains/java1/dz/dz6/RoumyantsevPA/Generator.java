package ru.geekbrains.java1.dz.dz6.RoumyantsevPA;

import java.util.Random;

public class Generator {

    public static Animal gen(int i){
        Random rnd=new Random();
        Animal animal;
       switch (i){
           case 0:
                animal=new Cat();
               break;
           default:
               animal=new Dog();
               break;
       }
        String[] names = {"Яшка", "Яша", "Ярофей", "Ягуар", "Яндекс", "Ярик", "Яков", "Якоб", "Ямб", "Яцек", "Яволь", "Януш", "Янчик", "Яго", "Ярис", "Яхонт", "Ярый", "Ярило", "Ярополк"};
        String[] colors = {"темно-красный", "кошениль", "алый", "ализариновый", "малиновый", "кардинал", "маджента", "баклажан", "глициния", "лимонный", "тауп", "нефритовый", "аквамарин", "индиго", "берлинская лазурь", "гридеперлевый", "антрацитовый", "маренго"};
        int age;
        animal.setAge(rnd.nextInt(20)+1);
        animal.setColor(colors[rnd.nextInt(colors.length)]);
        animal.setName(names[rnd.nextInt((names.length))]);
        return animal;
    }


}

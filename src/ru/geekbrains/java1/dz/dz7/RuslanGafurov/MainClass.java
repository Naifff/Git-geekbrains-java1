package ru.geekbrains.java1.dz.dz7.RuslanGafurov;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[10];
        cats[0] = new Cat("Барстк", 5);
        cats[1] = new Cat("Рыжик", 13);
        cats[2] = new Cat("Мурзик", 11);
        cats[3] = new Cat("Черныш", 25);
        cats[4] = new Cat("Пушок", 4);
        cats[5] = new Cat("Дуся", 8);
        cats[6] = new Cat("Боня", 18);
        cats[7] = new Cat("Сафи", 20);
        cats[8] = new Cat("Мурлыка", 9);
        cats[9] = new Cat("Фаня", 15);

        Plate plate = new Plate(40);

        for (Cat cat : cats) {
            plate.info();
            cat.eat(plate);
            cat.info();
            if(plate.getFood()<10){
                plate.info();
                plate.addFood();
            }
        }
        plate.info();
    }
}

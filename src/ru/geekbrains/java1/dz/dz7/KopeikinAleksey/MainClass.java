package ru.geekbrains.java1.dz.dz7.KopeikinAleksey;

//public
//class MainClass {
//}


//public class Plate {
//    private int food ;
//    public Plate ( int food ) {
//        this . food = food ;
//    }
//    public void decreaseFood ( int n ) {
//        food -= n ;
//    }
//    public void info () {
//        System . out . println ( "plate: " + food );
//    }
//}
public class MainClass {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Мурзик", 10);
        cats[1] = new Cat("Васька", 13);
        cats[2] = new Cat("Маркиз", 12);
        cats[3] = new Cat("Бегемот", 14);
        cats[4] = new Cat("Пистон", 11);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);

        }
        plate.info();
        plate.addFood(50);
    }
}
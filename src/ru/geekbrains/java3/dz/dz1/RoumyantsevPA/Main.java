package ru.geekbrains.java3.dz.dz1.RoumyantsevPA;

/*
1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);

2. Написать метод, который преобразует массив в ArrayList;

3. Большая задача:

Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя
сложить и яблоки, и апельсины;
Для хранения фруктов внутри коробки можете использовать ArrayList;
Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f,
 апельсина - 1.5f, не важно в каких это единицах);
Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare
 в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с
 коробками с апельсинами);
Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов,
нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую
перекидываются объекты, которые были в этой коробке;
Не забываем про метод добавления фрукта в коробку.
 */


import java.util.ArrayList;
import java.util.Arrays;

class Fruit {
    private float weight;

    public float getWeight() {
        return this.weight;
    }
}

class Apple extends Fruit {
    @Override
    public float getWeight() {
        return weight;
    }

    public Apple() {
        this.weight = 1.0f;

    }

    private float weight = 1.0f;
}

class Orange extends Fruit {
    @Override
    public float getWeight() {
        return weight;
    }

    public Orange() {
        this.weight = 1.5f;

    }

    private float weight;
}

class Box<T extends Fruit> {
    public int boxSize() {
        return box.size();
    }

    public Box() {
        this.box = new ArrayList<>();
    }

    private ArrayList<Fruit> box;

    public float weight() {
        float res = 0f;
        for (Fruit o : this.box) {
            res += o.getWeight();
        }
        return res;
    }

    public boolean compare(Box<?> another) {
        return this.weight() == another.weight();
    }

    public void pour(Box<T> b) {
        for (Fruit o : this.box
                ) {
            b.box.add(o);

        }
        this.box.clear();

    }

    public void addFruit(String s) {
        if ("apple".equalsIgnoreCase(s)) {
            this.box.add(new Apple());
        }
        if ("orange".equalsIgnoreCase(s)) {
            this.box.add(new Orange());
        }

    }


}


public class Main {
    public static void main(String[] args) {
        System.out.println("Первое задание:");
        Integer[] test1 = {123, 124, 542312, 432, 234, 235, 12342};
        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(task1(test1, 0, test1.length - 1)));
        System.out.println();
        System.out.println("Второе задание:");
        System.out.println(task2(test1));
        System.out.println();
        System.out.println("Третье задание:");

        Box<Apple> appleBox = new Box<>();
        for (int i = 0; i < 3; i++) {
            appleBox.addFruit("Apple");
        }
        System.out.println("Вес ящика с яблоками: " + appleBox.weight());

        Box<Orange> orangeBox = new Box<>();
        for (int i = 0; i < 2; i++) {
            orangeBox.addFruit("Orange");
        }
        System.out.println("Вес ящика с апельсинами: " + orangeBox.weight());

        if (appleBox.compare(orangeBox)) {
            System.out.println("Вес ящика с апельсинами и вес ящика с яблоками равны.");
        } else {
            System.out.println("Вес ящика с апельсинами и вес ящика с яблоками не равны");
        }

                Box<Orange> orangeBox1 = new Box<>();
        for (int i = 0; i < 3; i++) {
            orangeBox.addFruit("Orange");
        }
        orangeBox.pour(orangeBox1);
        System.out.println("Количество элементов в ящике, в который пересыпали: " + orangeBox1.boxSize());
        System.out.println("Количество элементов в ящике, из которого пересыпали: " + orangeBox.boxSize());
        //appleBox.pour(orangeBox); //не скомпилируется


    }

    public static Object[] task1(Object[] arr, int i, int j) {
        Object temp = new Object();
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;

    }

    public static <T> ArrayList<T> task2(T[] arr) {
        ArrayList<T> res = new ArrayList<T>();
        for (T o : arr
                ) {
            res.add(o);

        }
        return res;
    }


}






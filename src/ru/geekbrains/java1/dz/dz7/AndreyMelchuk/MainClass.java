package ru.geekbrains.java1.dz.dz7.AndreyMelchuk;

public class MainClass {
    public static void main ( String [] args ) {

        final int amount = 100;

        //Заводим котобазу
        Cat[] cats = new Cat[amount];

        /* !!!!!!!!!!!!!!!!!! ВОПРОС !!!!!!!!!!!!!!!*/
        /********************************************/
        /* Почему не срабатывает инициализация через foreach, а работает fori*/
        //        int i=-1;
        //        for (Cat c:cats) //неизвестно количество ... ?
        //            c = new Cat("Cat_" + Integer.toString(i++), ((int) (Math.random() * amount)));

        //работает!!!
        for (int i =0; i<100;i++)
            cats[i] = new Cat ( "Cat_" + Integer.toString(i),((int)(Math.random()*amount)) );
        /********************************************/

        //Статистика котобазы
        cats[0].getHungrycats();

        //Ставим тарелку с едой
        Plate plate1 = new Plate ( "Тарелка_1", 100 );
        plate1.info ();

        //Кормим котобазу
        for (Cat c:cats) c.eat ( plate1 );

        //Статистика тарелки
        plate1.info ();

        //Статистика котобазы
        cats[0].getHungrycats();

        //Добавляем еще еды
        plate1.add(120);

        //Кормим котобазу еще раз
        for (Cat c:cats) c.eat ( plate1 );
        //Статистика тарелки
        plate1.info ();

        //Статистика голода котобазы
        cats[0].getHungrycats();
    }
}

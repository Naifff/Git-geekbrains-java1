package ru.geekbrains.java1.dz.dz6.AndreyMelchuk;

public class Main {
    public static void main(String[] args) {

            // Полный список активностей задан в интерфейсе ActionInterface в ActionNames, где id есть порядковый индекс
            final int run_id = 1;
            final int jump_id = 2;
            final int swim_id = 3;

            //Создаем котов и собак
            RoboCat robocat_Barsik  = new RoboCat("Барсик");
            RoboCat robocat_Vasya   = new RoboCat("Вася");
            RoboDog robodog_Baron   = new RoboDog("Барон");
            RoboDog robodog_Arni    = new RoboDog("Арни");
            RoboDog robodog_Rex     = new RoboDog("Рекс");


            //И добавляем им умения
            robocat_Barsik.AddAction(new Action(run_id,200));
            robocat_Barsik.AddAction(new Action(jump_id,2));

            robocat_Vasya.AddAction(new Action(run_id,200,true));

            robodog_Baron.AddAction(new Action(run_id,500));
            robodog_Baron.AddAction(new Action(jump_id,.5f));
            robodog_Baron.AddAction(new Action(swim_id,10));

            robodog_Arni.AddAction(new Action(run_id,500, true));
            robodog_Arni.AddAction(new Action(swim_id,10,true));

            robodog_Rex.AddAction(new Action(jump_id,10,true));
            robodog_Rex.AddAction(new Action(swim_id,10,true));

            //Отчет по умениям
            robocat_Barsik.animalInfo();
            robocat_Vasya.animalInfo();
            robodog_Baron.animalInfo();
            robodog_Arni.animalInfo();
            robodog_Rex.animalInfo();

            //Тотал отчет
            robocat_Vasya.totalInfoLocal(); //Тотал по котам
            robodog_Rex.totalInfoLocal();   //Тотал по собакам
            robocat_Vasya.totalInfo();      //Тотал по животным


            //Пробуем выполнять команды
            robocat_Barsik.run(10);
            robocat_Barsik.jump(10);
            robocat_Barsik.swim(10);

            robocat_Vasya.run(100);
            robocat_Vasya.jump(20);
            robocat_Vasya.swim(1);


            robodog_Baron.run(400);
            robodog_Baron.jump(0.5f);
            robodog_Baron.swim(10);

            robodog_Arni.run(600);
            robodog_Arni.jump(.2f);
            robodog_Arni.swim(20);

            robodog_Rex.run(200);
            robodog_Rex.jump(1.3f);
            robodog_Rex.swim(4);

    }
}

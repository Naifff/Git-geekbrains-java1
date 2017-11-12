package ru.geekbrains.java1.dz.dz6.AndreyMelchuk;

public class RoboCat extends Animal implements RoboCatInterface{

    private static int CatsAdded = 0;

    RoboCat(String name){
        super(name);
        CatsAdded ++;
    }

    public int getCatsTotal(){
        return CatsAdded;
    }

    @Override
    public boolean run(float value) {
        int running_id = 1 ; //id константа из интерфейса действий
        return startAction(AnimalKind,running_id,value);
    }

    @Override
    public boolean jump(float value) {
        int jumping_id = 2 ; //id константа из интерфейса действий
        return startAction(AnimalKind,jumping_id,value);
    }

    @Override
    public boolean swim(float value) {
        int swiming_id = 3 ; //id константа из интерфейса действий
        return startAction(AnimalKind, swiming_id,value);
    }

    @Override
    public void animalInfo() {
        super.animalInfo(this.AnimalKind);
    }

    @Override
    public void totalInfoLocal() {
        System.out.print("Инициализировано всего " + CatsAdded + " " + AnimalKind + ".\n\n");
    }
}

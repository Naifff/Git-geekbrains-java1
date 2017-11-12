package ru.geekbrains.java1.dz.dz6.AndreyMelchuk;

//import com.sun.xml.internal.bind.v2.model.core.ClassInfo;

import javax.naming.Name;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
    Базовое описание животного
 */
public class Animal implements AnimalZeroInterface{
    private static int int_animal_id = -1;
    private int id = -1;
    private String AnimalKind = "Animal";
    private String AnimalName = "Unknown Animal Name";
    private ArrayList<Action> ActionS = new ArrayList<Action>(); //Контейнер активностей для животного

    public Animal () {
        if(id==-1)  id = int_animal_id++; //уникальный id
    }

    public Animal ( String name) {
        AnimalName = name ;
        if(id==-1)  int_animal_id++; //уникальный id
    }

    @Override
    public void AddAction(Action _action){
        ActionS.add(_action);
    }

    @Override
    public void animalInfo (String AnimalKind) {
        System.out.print(AnimalKind + " "+ AnimalName + ": ");
        for (Action act:ActionS){
            System.out.print("\n " + act.getActionName()+" на "+ act.getAction_limit());
        }
        System.out.print("\n\n");
    }

    public void totalInfo () {
        System.out.print("Инициализировано всего " + (int_animal_id + 1) + " животных.\n\n");
    }

   @Override
    /*
          Возвращает ссылку на элемент действия по заданному id действия из списка интерфейса
     */
    public Action findActionByConstantId(int ActionConstantId){
        for (Action _act: ActionS){
            if(_act.getAction_id()==ActionConstantId ) {return  _act;}
        }
        return new Action(0,0 );
    }

    public boolean startAction(String AnimalKind, int action_constant_id,float value) {
        Action act = findActionByConstantId(action_constant_id); // id действия для бега из интерфейса действий
        if(act.getAction_id()>0){ // 0 - "спит" или нет такого дейтсвия
            if(act.startAction(value)) {
                System.out.println(AnimalKind + " " + AnimalName + "(" + getSortedLimitsListAsString(',') + ") + успешно " + act.ActionNames[action_constant_id] + " на " + act.getAction_limit());
            }
            else
                System.out.println(AnimalKind + " " + AnimalName + "(" + getSortedLimitsListAsString(',') + ") - не умеет так далеко " + act.ActionNames2[action_constant_id] + ". Это фиаско, братан.");
            return act.startAction(value);
        }
                System.out.println(AnimalKind + " " + AnimalName + "(" + getSortedLimitsListAsString(',') + ") ! вообще не умеет " + act.ActionNames2[action_constant_id]);
        return false;
    }

    /*
        Возвращает сортированным списком ограничения
     */
    public String getSortedLimitsListAsString(char delimiter) {
        String str ="";
        if(ActionS.isEmpty() == false)
            for (int i = 1; i < ActionS.get(0).ActionNames.length; i++) {
                str+=" " + Float.toString(findActionByConstantId(i).getAction_limit())+delimiter;
            }
        return str.substring(0,str.length()-1).trim();
    }


    /*
    *  Методы для запроса изменения существующих параметров действий
    *  Случайное ограничение реализовано  в классе Action в доп конструкторе
    */

    @Override
    public float getActionLimit(int action_id_constant) {
        for (Action act:ActionS){
            if(act.getAction_id()==action_id_constant){
                return act.getAction_limit();
            }
        }
        return -1;
    }

    @Override
    /*
        Устанавливает границу для действия в базе животного
     */
    public void setActionLimit(int actions_id, float action_limit) {
        try {
            Action act = ActionS.get(actions_id);
            act.setAction_limit(action_limit);
            ActionS.set(actions_id,act);
        }catch (Exception e) {System.out.println("Animal::setActionLimit:: Error. Id is incorrect.");}
    }

    @Override
    /*
        Устанавливает случайную границу в пределах заданной для действия в базе животного
     */
    public void setActionLimitRandom(int actions_id, float action_limit) {
        try {
            Action act = ActionS.get(actions_id);
            act.setAction_limit((int) (Math.random() * action_limit) );
            ActionS.set(actions_id,act);
        }catch (Exception e) {System.out.println("Animal::setActionLimit:: Error. Id is incorrect.");}
    }




}

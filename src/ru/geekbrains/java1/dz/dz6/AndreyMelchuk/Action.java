package ru.geekbrains.java1.dz.dz6.AndreyMelchuk;

/*
    Описание "действия" содержит его название,id и границу
    ActionInterface содержит варианты возможных действий: бег, прыжок, плаванье, ...
 */

public class Action implements ActionInterface{
    private String actionName;
    private int action_id = -1; //уникальный id
    private float action_limit; //значение ограничения

    Action (int selected_action,float limit) {
        //Инициализирует действие и его максимум
        try {
            if (action_id >= ActionNames.length)
                throw new Exception("Action constructor error:: Bad action value.");
            else {
                if(action_id==-1){
                    action_id = selected_action;
                    action_limit = limit;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    Action (int selected_action,float limit, boolean Random) {
        //Инициализирует действие и его случайный максимум в пределах заданного значения
        try {
            if (action_id >= ActionNames.length)
                throw new Exception("Action constructor error:: Bad action value.");
            else {
                if(action_id==-1){
                    action_id = selected_action;
                    if(Random) action_limit = (int)(Math.random() * limit);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public String getActionName() {
        return ActionNames[action_id];
    }

    @Override
    public int getAction_id() {
        return action_id;
    }

    @Override
    public float getAction_limit() {
        return action_limit;
    }

    @Override
    public void setAction_limit(float limit) {
        action_limit = limit;
    }

    @Override
    public boolean startAction(float value) {
        if(value <= action_limit){
            return true;
        }
        return false;
    }
}

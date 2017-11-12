package ru.geekbrains.java1.dz.dz6.AndreyMelchuk;

public interface ActionInterface {
    //                          0       1           2           3           //Id действия
    String[] ActionNames = {    "спит", "бегает",   "прыгает",  "плавает"}; //Название
    String[] ActionNames2 = {    "спать", "бегать",   "прыгать",  "плавать"}; //Название, вторая форма
    String getActionName();
    int getAction_id();
    float getAction_limit();
    void setAction_limit(float limit);
    boolean startAction(float value);
}

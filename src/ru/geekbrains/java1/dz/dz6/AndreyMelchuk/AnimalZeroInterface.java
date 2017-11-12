package ru.geekbrains.java1.dz.dz6.AndreyMelchuk;

public interface AnimalZeroInterface {
    void AddAction(Action _action);
    void animalInfo (String AnimalKind);
    void setActionLimit(int action_id, float action_limit);
    void setActionLimitRandom(int action_id, float action_limit);
    float getActionLimit(int action_id);
    Action findActionByConstantId(int ActionConstantId);
    boolean startAction(String AnimalKind, int action_constant_id,float value);
    public void totalInfo ();
}

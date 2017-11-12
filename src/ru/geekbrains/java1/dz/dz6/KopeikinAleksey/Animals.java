package ru.geekbrains.java1.dz.dz6.KopeikinAleksey;

public abstract class Animals {
    protected int run;
    protected int runLimit;
    protected int swim;
    protected int swimLimit;
    protected double jump;
    protected double jumpLimit;


    public Animals(int run, int runLimit, int swim, int swimLimit, double jump, double jumpLimit ) {
        this.jump=jump;
        this.swim=swim;
        this.run=run;
        this.jumpLimit=jumpLimit;
        this.runLimit=runLimit;
        this.swimLimit=swimLimit;


    }

    public Animals(int run, int swim, double jump) {
        this.jump=jump;
        this.swim=swim;
        this.run=run;



    }

//    public static
//    int RunLimit(){
//        return runLimit;
//
//    }
//    public int SwimLimit(){
//        return swimLimit;
//    }
//    public double JumpLimit(){
//        return jumpLimit;
//    }
    public abstract boolean Run(int runlim);
    public abstract boolean Swim(int swimlim);
    public abstract boolean Jump(double jumplim);
    public void Info(){

    }


}

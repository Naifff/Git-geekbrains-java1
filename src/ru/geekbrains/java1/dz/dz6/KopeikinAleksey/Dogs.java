package ru.geekbrains.java1.dz.dz6.KopeikinAleksey;

public class Dogs extends Animals{

//    public Dogs(int run,int runLimit, int swim, int swimLimit, double jump, double jumpLimit){
public Dogs(int run, int swim,  double jump ){
//    super (run,runLimit,swim,swimLimit,jump,jumpLimit);
    super (run,swim,jump);


    }

    @Override
    public
    boolean Run(int runlim) {
    if(runlim<=run){return true;}
        return false;
    }


    @Override
    public
    boolean Swim(int swimlim) {
        if(swimlim<=swim){return true;}
        return false;
    }

    @Override
    public
    boolean Jump(double jumplim) {
        if(jumplim<=jump){return true;}
        return false;
    }


}

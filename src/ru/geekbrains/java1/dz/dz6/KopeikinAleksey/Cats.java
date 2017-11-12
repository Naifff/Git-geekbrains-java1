package ru.geekbrains.java1.dz.dz6.KopeikinAleksey;

public class Cats extends Animals {
    public Cats(int run, int swim,  double jump ){
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
        return false;
    }

    @Override
    public
    boolean Jump(double jumplim) {
        if(jumplim<=jump){return true;}
        return false;
    }
}
